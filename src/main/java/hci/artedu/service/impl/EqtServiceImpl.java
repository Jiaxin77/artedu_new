package hci.artedu.service.impl;

import hci.artedu.common.ServerResponse;
import hci.artedu.dao.EqtRecordMapper;
import hci.artedu.dao.EquipmentMapper;
import hci.artedu.dao.UserMapper;
import hci.artedu.pojo.*;
import hci.artedu.service.EqtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @program: artedu
 * @description: 设备
 * @author: Leaf
 * @create: 2020-11-04 16:14
 * @Version: 1.0
 **/
@Service
public class EqtServiceImpl implements EqtService {
    @Autowired
    private EqtRecordMapper eqtRecordMapper;

    @Autowired
    private EquipmentMapper equipmentMapper;

    @Autowired
    private UserMapper userMapper;


    @Override
    public ServerResponse<HashMap<String, Object>> getEqtNumber() {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 实验仪器设备中获取目前已有设备数量
         * @Author Leaf
         * @Date 2020/11/4 6:30 下午
         **/
        int toolTpye1 = 0;
        EquipmentExample example = new EquipmentExample();
        EquipmentExample.Criteria criteria = example.createCriteria();
        criteria.andTypeEqualTo(0);
        int toolNum1 = (int)equipmentMapper.countByExample(example);

        int toolTpye2 = 1;
        EquipmentExample example2 = new EquipmentExample();
        EquipmentExample.Criteria criteria2 = example2.createCriteria();
        criteria2.andTypeEqualTo(1);
        int toolNum2 = (int)equipmentMapper.countByExample(example2);

        HashMap<String, Object> toolInfo = new HashMap<String, Object>();
        toolInfo.put("toolTpye1",toolTpye1);
        toolInfo.put("toolNum1",toolNum1);
        toolInfo.put("toolTpye2",toolTpye2);
        toolInfo.put("toolNum2",toolNum2);
        return ServerResponse.createBySuccess("获取成功", toolInfo);
    }

    @Override
    public ServerResponse<String> reserveApply(int deviceId, Date reverseTime, Double reversePeriod)
    {
        /**
         * TODO 
         * @return hci.artedu.common.ServerResponse<java.lang.String>
         * @Description 提交设备预约申请
         * @Author Leaf
         * @Date 2020/11/4 6:27 下午
         **/
        EqtRecord eqtRecord =new EqtRecord();
        eqtRecord.setDeviceId(deviceId);
        eqtRecord.setUseTime(reverseTime);
        eqtRecord.setUsePeriod(reversePeriod);
        eqtRecordMapper.insert(eqtRecord);
        return ServerResponse.createBySuccess("提交成功");
    }

    @Override
    public ServerResponse<ArrayList<Object>> getReserveApply() {
        /**
         * TODO 获取设备租借申请的相关信息
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 
         * @Author Leaf
         * @Date 2020/11/4 6:27 下午
         **/
        EqtRecordExample eqtRecordExample = new EqtRecordExample();
        List<EqtRecord> eqtRecordList = eqtRecordMapper.selectByExample(eqtRecordExample);

        ArrayList<Object> getEqtRecordList = new ArrayList<>();
        for (EqtRecord eqtRecord: eqtRecordList) {

            Integer userId = eqtRecord.getUserId();
            UserExample example = new UserExample();
            example.createCriteria().andIdEqualTo(userId);
            List<User> userList = userMapper.selectByExample(example);
            String userName = null;
            int userClass = 0;
            if (!userList.isEmpty()){
                User thisUser = userList.get(0);
                userName = thisUser.getUserName();
                userClass = thisUser.getClassName();
            }
            Integer toolInfo = eqtRecord.getState();
            Date useTime = eqtRecord.getUseTime();
            HashMap<String,Object> map = new HashMap<String, Object>();
            map.put("userName", userName);
            map.put("userClass", userClass);
            map.put("toolInfo", toolInfo);
            map.put("useTime", useTime);
            getEqtRecordList.add(map);
        }
        return ServerResponse.createBySuccess("获取成功", getEqtRecordList);
    }

    @Override
    public ServerResponse<HashMap<String, Object>> toolInfo(int toolTpye) {
        /**
         * TODO 
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 获取设备信息
         * @Author Leaf
         * @Date 2020/11/4 6:26 下午
         **/
        EquipmentExample example = new EquipmentExample();
        int toolNum = (int)equipmentMapper.countByExample(example);

        EquipmentExample example1 = new EquipmentExample();
        EquipmentExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andStateEqualTo(1);
        int offNum = (int)equipmentMapper.countByExample(example1);

        EquipmentExample example2 = new EquipmentExample();
        EquipmentExample.Criteria criteria2 = example2.createCriteria();
        criteria2.andStateEqualTo(2);
        int brokeNum = (int)equipmentMapper.countByExample(example2);

        HashMap<String, Object> toolInfo = new HashMap<String, Object>();
        toolInfo.put("toolTpye",toolTpye);
        toolInfo.put("toolNum",toolNum);
        toolInfo.put("offNum",offNum);
        toolInfo.put("brokeNum",brokeNum);
        return ServerResponse.createBySuccess("获取成功", toolInfo);

    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<String> checkApply(int result,String comment) {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.lang.String>
         * @Description 提交教师批准结果
         * @Author Leaf
         * @Date 2020/11/4 5:09 下午
         **/
        EqtRecord eqtRecord =new EqtRecord();
        eqtRecord.setState(result);
        eqtRecord.setNote(comment);
        eqtRecordMapper.insert(eqtRecord);
        return ServerResponse.createBySuccess("提交成功");
    }
}
