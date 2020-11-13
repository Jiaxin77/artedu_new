package hci.artedu.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * userLoginLog
 * @author 
 */
@Data
public class Userloginlog implements Serializable {
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 开始时间
     */
    private Date beginTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 持续时间
     */
    private Long duringTime;

    /**
     * 用户ip
     */
    private String userIp;

    private static final long serialVersionUID = 1L;
}