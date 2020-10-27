package hci.artedu.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer id;

    /**
     * 姓名
     */
    private String username;

    /**
     * 性别
     */
    private Boolean usergender;

    /**
     * 邮箱
     */
    private String useremail;

    /**
     * 密码
     */
    private String userpassword;

    /**
     * 用户类型
     */
    private Integer usertype;

    /**
     * 学号/工号
     */
    private String usernumber;

    /**
     * 学校名称
     */
    private String schoolname;

    /**
     * 班号
     */
    private String classname;

    /**
     * 对素描的掌握程度
     */
    private Integer levelofmastery;

    /**
     * 对素描课程态度
     */
    private Integer userattitude;

    /**
     * 成绩
     */
    private Double userscore;

    private static final long serialVersionUID = 1L;
}