package hci.artedu.dao;

import hci.artedu.pojo.LearningRecord;
import hci.artedu.pojo.LearningRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LearningRecordMapper {
    long countByExample(LearningRecordExample example);

    int deleteByExample(LearningRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LearningRecord record);

    int insertSelective(LearningRecord record);

    List<LearningRecord> selectByExample(LearningRecordExample example);

    LearningRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LearningRecord record, @Param("example") LearningRecordExample example);

    int updateByExample(@Param("record") LearningRecord record, @Param("example") LearningRecordExample example);

    int updateByPrimaryKeySelective(LearningRecord record);

    int updateByPrimaryKey(LearningRecord record);
}