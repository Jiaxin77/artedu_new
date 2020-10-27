package hci.artedu.service.impl;

import hci.artedu.common.ServerResponse;
import hci.artedu.dao.ExperimentMapper;
import hci.artedu.pojo.Experiment;
import hci.artedu.pojo.ExperimentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName EptServiceImpl
 * @Description TODO
 * @Author jiaxin
 * @Date 2020/10/27 10:56 上午
 * @Version 1.0
 **/
@Service
public class EptServiceImpl {

    @Autowired
    private ExperimentMapper experimentMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<ArrayList> getEptList()
    {

        /***
         * @Author jiaxin
         * @Description 获取实验列表//TODO
         * @Date 11:07 上午 2020/10/27
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.ArrayList>
         **/

        ArrayList<Object> eptList = new ArrayList<Object>();
        ExperimentExample eptExample = new ExperimentExample();
        eptExample.setDistinct(false);
        List<Experiment> epts = experimentMapper.selectByExample(eptExample);
        for(Experiment ept : epts)
        {
            HashMap<String,Object> eptInfo = new HashMap<String, Object>();
            eptInfo.put("eptId",ept.getId());
            eptInfo.put("eptName",ept.getEptname());
            eptInfo.put("eptTime",ept.getEpttime());
            eptList.add(eptInfo);
        }

        return ServerResponse.createBySuccess("获取成功",eptList);
    }

    public ServerResponse<HashMap<String,Object>> getOneEptPurpose(int eptId)
    {
        /**
         * @Author jiaxin
         * @Description 获取某实验目的//TODO
         * @Date 11:14 上午 2020/10/27
         * @Param [eptId]
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         **/

        ExperimentExample experimentExample = new ExperimentExample();
        ExperimentExample.Criteria


    }


}