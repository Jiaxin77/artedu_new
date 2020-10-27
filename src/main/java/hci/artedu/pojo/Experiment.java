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
    private String eptname;

    /**
     * 实验课时数
     */
    private Long epttime;

    /**
     * 难易程度
     */
    private Integer difficultdegree;

    /**
     * 实验类别
     */
    private String epttype;

    /**
     * 实验通过率
     */
    private Integer passrate;

    /**
     * 实验参与率
     */
    private Integer participaterate;

    /**
     * 实验课程
     */
    private String course;

    /**
     * 总课时数
     */
    private Integer allcoursetime;

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