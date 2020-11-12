package hci.artedu.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * learningRecord
 * @author 
 */
@Data
public class LearningRecord implements Serializable {
    /**
     * 记录编号
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    private Long duringTime;

    private static final long serialVersionUID = 1L;
}