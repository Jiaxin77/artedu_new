package hci.artedu.dao;

import hci.artedu.pojo.Userprocess;
import hci.artedu.pojo.UserprocessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserprocessMapper {
    long countByExample(UserprocessExample example);

    int deleteByExample(UserprocessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userprocess record);

    int insertSelective(Userprocess record);

    List<Userprocess> selectByExample(UserprocessExample example);

    Userprocess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userprocess record, @Param("example") UserprocessExample example);

    int updateByExample(@Param("record") Userprocess record, @Param("example") UserprocessExample example);

    int updateByPrimaryKeySelective(Userprocess record);

    int updateByPrimaryKey(Userprocess record);
}