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
    private String userName;

    /**
     * 性别
     */
    private Boolean userGender;

    /**
     * 邮箱
     */
    private String userEmail;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 用户类型
     */
    private Integer userType;

    /**
     * 学号/工号
     */
    private String userNumber;

    /**
     * 学校名称
     */
    private String schoolName;

    /**
     * 班号
     */
    private String className;

    /**
     * 对素描的掌握程度
     */
    private Integer levelOfMastery;

    /**
     * 对素描课程态度
     */
    private Integer userAttitude;

    /**
     * 成绩
     */
    private Double userScore;

    private static final long serialVersionUID = 1L;
}