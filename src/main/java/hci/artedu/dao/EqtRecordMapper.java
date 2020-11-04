package hci.artedu.dao;

import hci.artedu.pojo.EqtRecord;
import hci.artedu.pojo.EqtRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EqtRecordMapper {
    long countByExample(EqtRecordExample example);

    int deleteByExample(EqtRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EqtRecord record);

    int insertSelective(EqtRecord record);

    List<EqtRecord> selectByExample(EqtRecordExample example);

    EqtRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EqtRecord record, @Param("example") EqtRecordExample example);

    int updateByExample(@Param("record") EqtRecord record, @Param("example") EqtRecordExample example);

    int updateByPrimaryKeySelective(EqtRecord record);

    int updateByPrimaryKey(EqtRecord record);
}