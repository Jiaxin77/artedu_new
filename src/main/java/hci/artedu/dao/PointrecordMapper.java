package hci.artedu.dao;

import hci.artedu.pojo.Pointrecord;
import hci.artedu.pojo.PointrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointrecordMapper {
    long countByExample(PointrecordExample example);

    int deleteByExample(PointrecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pointrecord record);

    int insertSelective(Pointrecord record);

    List<Pointrecord> selectByExample(PointrecordExample example);

    Pointrecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pointrecord record, @Param("example") PointrecordExample example);

    int updateByExample(@Param("record") Pointrecord record, @Param("example") PointrecordExample example);

    int updateByPrimaryKeySelective(Pointrecord record);

    int updateByPrimaryKey(Pointrecord record);
}