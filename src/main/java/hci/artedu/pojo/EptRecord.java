package hci.artedu.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * EptRecord
 * @author 
 */
@Data
public class EptRecord implements Serializable {
    private Integer id;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 实验id
     */
    private Integer eptId;

    /**
     * 实验时长
     */
    private Long durTime;

    /**
     * 操作难度反馈
     */
    private Integer difficultyLevel;

    /**
     * 锻炼程度反馈
     */
    private Integer exerciseLevel;

    /**
     * 掌握程度反馈
     */
    private Integer masteryLevel;

    /**
     * 实验日期
     */
    @DateTimeFormat(pattern = "YYYY-mm-dd")
    private Date eptDate;

    /**
     * 开始时间
     */
    @DateTimeFormat(pattern = "YYYY-mm-dd HH:mm:ss")
    private Date startTime;

    /**
     * 结束时间
     */
    @DateTimeFormat(pattern = "YYYY-mm-dd HH:mm:ss")
    private Date endTime;

    private static final long serialVersionUID = 1L;
}