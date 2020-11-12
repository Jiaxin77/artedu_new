package hci.artedu.dao;

import hci.artedu.pojo.Userloginlog;
import hci.artedu.pojo.UserloginlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserloginlogMapper {
    long countByExample(UserloginlogExample example);

    int deleteByExample(UserloginlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userloginlog record);

    int insertSelective(Userloginlog record);

    List<Userloginlog> selectByExample(UserloginlogExample example);

    Userloginlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userloginlog record, @Param("example") UserloginlogExample example);

    int updateByExample(@Param("record") Userloginlog record, @Param("example") UserloginlogExample example);

    int updateByPrimaryKeySelective(Userloginlog record);

    int updateByPrimaryKey(Userloginlog record);
}