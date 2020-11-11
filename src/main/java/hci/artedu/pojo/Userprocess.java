package hci.artedu.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * userProcess
 * @author 
 */
@Data
public class Userprocess implements Serializable {
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 实验id
     */
    private Integer eptId;

    /**
     * 关卡序号
     */
    private Integer stageNum;

    private static final long serialVersionUID = 1L;
}