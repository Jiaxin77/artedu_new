package hci.artedu.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * point_experiment
 * @author 
 */
@Data
public class PointExperiment implements Serializable {
    /**
     * 关系id
     */
    private Integer id;

    /**
     * 知识点id
     */
    private Integer pointId;

    /**
     * 实验id
     */
    private Integer eptId;

    private static final long serialVersionUID = 1L;
}