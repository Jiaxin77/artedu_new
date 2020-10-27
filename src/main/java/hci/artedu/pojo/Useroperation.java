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
    private Integer userId;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户操作（"登录成功"/"退出登录"/"开始实验"/"退出实验"）
     */
    private String userOperation;

    /**
     * 参数（学习的课程ID/实验id）
     */
    private String params;

    /**
     * 用户ip地址
     */
    private String userIp;

    /**
     * 操作时间
     */
    private Date operationTime;

    private static final long serialVersionUID = 1L;
}