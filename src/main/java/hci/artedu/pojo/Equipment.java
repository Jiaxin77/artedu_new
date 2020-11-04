package hci.artedu.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * equipment
 * @author 
 */
@Data
public class Equipment implements Serializable {
    /**
     * 器材编号
     */
    private Integer id;

    /**
     * 器材名称
     */
    private String name;

    /**
     * 器材种类
     */
    private Integer type;

    /**
     * 器材状态
     */
    private Integer state;

    private static final long serialVersionUID = 1L;
}