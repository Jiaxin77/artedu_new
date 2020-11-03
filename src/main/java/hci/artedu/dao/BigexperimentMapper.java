package hci.artedu.dao;

import hci.artedu.pojo.Bigexperiment;
import hci.artedu.pojo.BigexperimentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BigexperimentMapper {
    long countByExample(BigexperimentExample example);

    int deleteByExample(BigexperimentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bigexperiment record);

    int insertSelective(Bigexperiment record);

    List<Bigexperiment> selectByExample(BigexperimentExample example);

    Bigexperiment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bigexperiment record, @Param("example") BigexperimentExample example);

    int updateByExample(@Param("record") Bigexperiment record, @Param("example") BigexperimentExample example);

    int updateByPrimaryKeySelective(Bigexperiment record);

    int updateByPrimaryKey(Bigexperiment record);
}