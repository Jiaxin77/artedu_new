package hci.artedu.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * experimentStep
 * @author 
 */
@Data
public class Experimentstep implements Serializable {
    private Integer id;

    /**
     * 所属小实验id
     */
    private Integer eptId;

    /**
     * 步骤序号
     */
    private Integer stepNum;

    /**
     * 步骤名称
     */
    private String stepName;

    /**
     * 步骤描述
     */
    private String stepDes;

    /**
     * 步骤图片
     */
    private String stepPic;

    private static final long serialVersionUID = 1L;
}