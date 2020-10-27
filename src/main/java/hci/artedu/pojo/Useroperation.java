package hci.artedu.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * userOperation
 * @author 
 */
@Data
public class Useroperation implements Serializable {
    /**
     * 记录id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 用户操作（"登录成功"/"退出登录"/"开始实验"/"退出实验"）
     */
    private String useroperation;

    /**
     * 参数（学习的课程ID/实验id）
     */
    private String params;

    /**
     * 用户ip地址
     */
    private String userip;

    /**
     * 操作时间
     */
    private Date operationtime;

    private static final long serialVersionUID = 1L;
}