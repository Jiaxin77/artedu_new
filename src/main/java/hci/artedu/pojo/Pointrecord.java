package hci.artedu.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * pointRecord
 * @author 
 */
@Data
public class Pointrecord implements Serializable {
    /**
     * 记录编号
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 知识点id
     */
    private Integer pointId;

    /**
     * 完成的日期
     */
    private Date completeTime;

    private static final long serialVersionUID = 1L;
}