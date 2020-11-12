package hci.artedu.aop;

import hci.artedu.service.UserService;
import hci.artedu.service.impl.UserServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.util.BsonUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

/**
 * @ClassName LogoutAop
 * @Description TODO
 * @Author jiaxin
 * @Date 2020/11/2 10:10 上午
 * @Version 1.0
 **/

@Aspect
@Component
public class LogoutAop {
    @Autowired
    private UserServiceImpl userService;
    //提高作用域
    private Object proceed;
    private Integer uid;
    private HttpSession session;
    private String status = "";
    private  int logId;
    @Pointcut("execution(* hci.artedu.controller.UserController.logout(..))")
    public void pointCut(){}
    //前置通知
    @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        System.out.println("前置通知——————————");
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] args=joinPoint.getArgs();
        System.out.println("类："+className);
        System.out.println("方法："+methodName);
        System.out.println("传入参数：");
        for (int i=0;i<args.length;i++){
            System.out.println("参数"+(i+1)+"："+args[i]);
        }
        //第一个参数值赋给userid

        uid = (int)args[0];
        session = (HttpSession)args[1];
        status = (String) session.getAttribute("status");
        logId = (Integer) session.getAttribute("logId");
        System.out.println("前置通知完——————");
    }

    @Around("pointCut()")
    public Object Around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("环绕通知——————————");
        //获得方法执行后的返回值
        proceed = pjp.proceed();
        ///logout

        if(status!= null && status.equals("login"))
        {
            userService.insertLogoutLog(logId);
        }

        System.out.println("执行的方法后的返回值"+proceed+"");
        System.out.println("环绕通知完————————");
        return proceed;
    }



}
