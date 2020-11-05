package hci.artedu.dao;

import hci.artedu.pojo.EptRecord;
import hci.artedu.pojo.EptRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EptrecordMapper {
    long countByExample(EptRecordExample example);

    int deleteByExample(EptRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EptRecord record);

    int insertSelective(EptRecord record);

    List<EptRecord> selectByExample(EptRecordExample example);

    EptRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EptRecord record, @Param("example") EptRecordExample example);

    int updateByExample(@Param("record") EptRecord record, @Param("example") EptRecordExample example);

    int updateByPrimaryKeySelective(EptRecord record);

    int updateByPrimaryKey(EptRecord record);
}