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
    private String name;

    /**
     * 小实验英文名称
     */
    private String englishName;

    /**
     * 实验简介
     */
    private String des;

    /**
     * 实验通过率
     */
    private Integer passRate;

    /**
     * 知识点
     */
    private String knowledgePoint;

    /**
     * 难度
     */
    private String diffucultLevel;

    /**
     * 关卡数
     */
    private Integer step;

    /**
     * 所属大实验
     */
    private Integer bigEpt;

    /**
     * 实验时间
     */
    private Integer time;

    /**
     * 封面图片
     */
    private String coverPic;

    /**
     * 浏览量
     */
    private Integer scanNum;

    /**
     * 参与量
     */
    private Integer participateNum;

    private static final long serialVersionUID = 1L;
}