package hci.artedu.dao;

import hci.artedu.pojo.PointExperiment;
import hci.artedu.pojo.PointExperimentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointExperimentMapper {
    long countByExample(PointExperimentExample example);

    int deleteByExample(PointExperimentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PointExperiment record);

    int insertSelective(PointExperiment record);

    List<PointExperiment> selectByExample(PointExperimentExample example);

    PointExperiment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PointExperiment record, @Param("example") PointExperimentExample example);

    int updateByExample(@Param("record") PointExperiment record, @Param("example") PointExperimentExample example);

    int updateByPrimaryKeySelective(PointExperiment record);

    int updateByPrimaryKey(PointExperiment record);
}