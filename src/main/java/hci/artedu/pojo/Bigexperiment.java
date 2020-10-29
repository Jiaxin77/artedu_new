package hci.artedu.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * bigExperiment
 * @author 
 */
@Data
public class Bigexperiment implements Serializable {
    /**
     * 实验id
     */
    private Integer id;

    /**
     * 大实验名称
     */
    private String name;

    /**
     * 通过率
     */
    private Integer passRate;

    /**
     * 参与率
     */
    private Integer participateRate;

    /**
     * 所占课时数
     */
    private Integer time;

    /**
     * 课程总课时数
     */
    private Integer courseTime;

    /**
     * 实验内容
     */
    private String content;

    /**
     * 所属课程
     */
    private String course;

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

    /**
     * 封面图片
     */
    private String coverPic;

    /**
     * 目的图片
     */
    private String purposePic;

    /**
     * 要求图片
     */
    private String requirementPic;

    /**
     * 原理图片
     */
    private String principlePic;

    /**
     * 方法图片
     */
    private String methodPic;

    /**
     * 步骤图片
     */
    private String stepPic;

    /**
     * 设备图片
     */
    private String devicePic;

    private static final long serialVersionUID = 1L;
}