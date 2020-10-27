package hci.artedu.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * experiment
 * @author 
 */
@Data
public class Experiment implements Serializable {
    /**
     * 实验序号

     */
    private Integer id;

    /**
     * 实验名称
     */
    private String eptName;

    /**
     * 实验课时数
     */
    private Long eptTime;

    /**
     * 难易程度
     */
    private Integer difficultDegree;

    /**
     * 实验类别
     */
    private String eptType;

    /**
     * 实验通过率
     */
    private Integer passRate;

    /**
     * 实验参与率
     */
    private Integer participateRate;

    /**
     * 实验课程
     */
    private String course;

    /**
     * 总课时数
     */
    private Integer allCourseTime;

    /**
     * 实验内容
     */
    private String content;

    /**
     * 实验简介
     */
    private String des;

    /**
     * 实验目的
     */
    private String purpose;

    /**
     * 实验要求
     */
    private String requirement;

    /**
     * 实验原理
     */
    private String principle;

    /**
     * 实验方法
     */
    private String method;

    /**
     * 实验步骤
     */
    private String steps;

    /**
     * 实验仪器设备
     */
    private String device;

    private static final long serialVersionUID = 1L;
}