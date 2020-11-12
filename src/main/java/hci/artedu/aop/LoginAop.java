package hci.artedu.aop;

import hci.artedu.pojo.User;
import hci.artedu.service.UserService;
import hci.artedu.service.impl.UserServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

/**
 * @ClassName LoginAop
 * @Description TODO
 * @Author jiaxin
 * @Date 2020/11/2 10:10 上午
 * @Version 1.0
 **/


//////加session？

@Aspect
@Component
public class LoginAop {
    /**
     * @Author jiaxin
     * @Description 登录AOP切面//TODO
     * @Date 10:44 上午 2020/11/2
     * @Param
     * @return
     **/

    @Autowired
    private UserServiceImpl userService;
    //提高作用域
    private Object proceed;

    private User user;
    private HttpSession session;
//    private String username;
//    private String password;

    //定义切点为controller包下的UserController类里的login()方法
    @Pointcut("execution(* hci.artedu.controller.UserController.login(..))")
    public void pointCut(){}
    //前置通知，在前置通知里一般是给变量赋值
    @Before("pointCut()")
    public void before(JoinPoint joinPoint)
    {
        System.out.println("前置通知————————");
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("类："+className);
        System.out.println("方法："+methodName);
        System.out.println("传入参数：");
        for (int i=0;i<args.length;i++){
            System.out.println("参数"+(i+1)+"："+args[i]);
        }
        //将第一个参数赋值给user
        System.out.println("arg0"+args[0]);
        user= (User) args[0];
        session = (HttpSession) args[1];

        //将第二个参数赋值给password
        //password=(String) args[1];
        System.out.println("前置通知完--------------------");

    }

    //环绕通知
    /**
     * 环绕通知：
     *       proceed为执行方法后返回的值
     */
    @Around("pointCut()")
    public Object Around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("环绕通知————————————");
        //获得方法执行后的返回值
        proceed = pjp.proceed();
        //login
        String status = (String) session.getAttribute("status");
        if(status.equals("login"))
        {
            User user = (User) session.getAttribute("user");
            Integer uid = user.getId();
            System.out.println("uid"+uid);
            int logid = userService.insertLoginLog(uid);
            session.setAttribute("logId",logid);
        }

        System.out.println("环绕通知完——————————");
        return proceed;
    }


}
