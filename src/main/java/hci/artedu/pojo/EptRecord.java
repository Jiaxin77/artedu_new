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
     * 实验成绩
     */
    private Integer score;

    /**
     * 实验时长
     */
    @DateTimeFormat(pattern = "HH:mm:ss")
    private Date durTime;

    /**
     * 实验进度 %
     */
    private Integer progress;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date eptDate;

    /**
     * 开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    /**
     * 结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    private static final long serialVersionUID = 1L;
}