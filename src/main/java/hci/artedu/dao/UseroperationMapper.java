package hci.artedu.dao;

import hci.artedu.pojo.Useroperation;
import hci.artedu.pojo.UseroperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UseroperationMapper {
    long countByExample(UseroperationExample example);

    int deleteByExample(UseroperationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Useroperation record);

    int insertSelective(Useroperation record);

    List<Useroperation> selectByExample(UseroperationExample example);

    Useroperation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Useroperation record, @Param("example") UseroperationExample example);

    int updateByExample(@Param("record") Useroperation record, @Param("example") UseroperationExample example);

    int updateByPrimaryKeySelective(Useroperation record);

    int updateByPrimaryKey(Useroperation record);
}