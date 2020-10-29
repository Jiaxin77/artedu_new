package hci.artedu.dao;

import hci.artedu.pojo.Experimentstep;
import hci.artedu.pojo.ExperimentstepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExperimentstepMapper {
    long countByExample(ExperimentstepExample example);

    int deleteByExample(ExperimentstepExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Experimentstep record);

    int insertSelective(Experimentstep record);

    List<Experimentstep> selectByExample(ExperimentstepExample example);

    Experimentstep selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Experimentstep record, @Param("example") ExperimentstepExample example);

    int updateByExample(@Param("record") Experimentstep record, @Param("example") ExperimentstepExample example);

    int updateByPrimaryKeySelective(Experimentstep record);

    int updateByPrimaryKey(Experimentstep record);
}