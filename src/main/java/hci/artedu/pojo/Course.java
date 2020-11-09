package hci.artedu.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * course
 * @author 
 */
@Data
public class Course implements Serializable {
    private Integer id;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 课程英文名称
     */
    private String englishName;

    /**
     * 课程编号
     */
    private String number;

    /**
     * 学分
     */
    private Integer studyScore;

    /**
     * 学时
     */
    private Integer studyTime;

    /**
     * 是否必修
     */
    private Boolean isMust;

    /**
     * 开课学期
     */
    private String openTerm;

    /**
     * 课程类别
     */
    private String category;

    /**
     * 适用专业
     */
    private String major;

    /**
     * 先修课程
     */
    private String beforeCourse;

    /**
     * 教学目标
     */
    private String target;

    /**
     * 小标题1
     */
    private String title_one;

    /**
     * 小标题2
     */
    private String title_two;

    /**
     * 小标题3
     */
    private String title_three;

    /**
     * 内容1
     */
    private String content_one;

    /**
     * 内容2
     */
    private String content_two;

    /**
     * 内容3
     */
    private String content_three;

    /**
     * 封面图片
     */
    private String coverPic;

    private static final long serialVersionUID = 1L;
}