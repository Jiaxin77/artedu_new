package hci.artedu.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * eqtRecord
 * @author 
 */
@Data
public class EqtRecord implements Serializable {
    /**
     * 记录编号
     */
    private Integer id;

    /**
     * 借阅器材编号
     */
    private Integer deviceId;

    /**
     * 借阅用户编号
     */
    private Integer userId;

    /**
     * 审批老师编号
     */
    private Integer checkerId;

    /**
     * 审批结果
     */
    private Integer state;

    /**
     * 预计使用时间
     */
    private Date useTime;

    /**
     * 预计使用时长
     */
    private Double usePeriod;

    /**
     * 申请时间
     */
    private Date applyTime;

    /**
     * 留言
     */
    private String note;

    private static final long serialVersionUID = 1L;
}