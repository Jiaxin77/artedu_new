package hci.artedu.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * knowledgePoint
 * @author 
 */
@Data
public class Knowledgepoint implements Serializable {
    /**
     * 知识点id
     */
    private Integer id;

    /**
     * 知识点名称
     */
    private String name;

    /**
     * 知识点简介
     */
    private String intro;

    /**
     * 知识点内容
     */
    private String content;

    private static final long serialVersionUID = 1L;
}