package hci.artedu.service.impl;

import hci.artedu.common.ServerResponse;
import hci.artedu.dao.*;
import hci.artedu.pojo.*;
import hci.artedu.service.EptService;
import hci.artedu.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.*;

/**
 * @ClassName EptServiceImpl
 * @Description TODO
 * @Author jiaxin
 * @Date 2020/10/27 10:56 上午
 * @Version 1.0
 **/
@Service
public class EptServiceImpl implements EptService {

    @Autowired
    private ExperimentMapper experimentMapper;

    @Autowired
    private BigexperimentMapper bigexperimentMapper;

    @Autowired
    private ExperimentstepMapper experimentstepMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UseroperationMapper useroperationMapper;

    @Autowired
    private PointExperimentMapper pointExperimentMapper;

    @Autowired
    private KnowledgepointMapper knowledgepointMapper;

    @Autowired
    private EptrecordMapper eptrecordMapper;

    @Autowired
    private UserprocessMapper userprocessMapper;


    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<ArrayList> getEptList()
    {

        /***
         * @Author jiaxin
         * @Description 获取小实验列表//TODO
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
            eptInfo.put("eptName",ept.getEptName());
            eptInfo.put("eptTime",ept.getEptTime());
            eptInfo.put("coverPic",ept.getCoverPic());
            eptList.add(eptInfo);
        }

        return ServerResponse.createBySuccess("获取成功",eptList);
    }


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<HashMap<String,Object>> getBigEptInfo()
    {
        /**
         * @Author jiaxin
         * @Description 获取大实验的基本信息//TODO
         * @Date 5:22 下午 2020/10/28
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/
        int eptId = 1;
        Bigexperiment bigexperiment = bigexperimentMapper.selectByPrimaryKey(eptId);
        HashMap<String,Object> eptInfo = new HashMap<String, Object>();
        eptInfo.put("eptId",bigexperiment.getId());
        eptInfo.put("eptName",bigexperiment.getName());
        eptInfo.put("eptPassRate",bigexperiment.getPassRate());
        eptInfo.put("eptParticipateRate",bigexperiment.getParticipateRate());
        eptInfo.put("eptTime",bigexperiment.getTime());
        eptInfo.put("totalTime",bigexperiment.getCourseTime());
        eptInfo.put("content",bigexperiment.getContent());
        eptInfo.put("course",bigexperiment.getCourse());
        eptInfo.put("eptDes",bigexperiment.getDes());
        eptInfo.put("eptPic",bigexperiment.getCoverPic());

        return ServerResponse.createBySuccess("获取成功",eptInfo);


    }


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<HashMap<String,Object>> getEptBasicInfo(int eptId)
    {
        /**
         * @Author jiaxin
         * @Description 获取小实验基本信息//TODO
         * @Date 11:00 上午 2020/10/29
         * @Param [eptId]
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         **/

        Experiment experiment = experimentMapper.selectByPrimaryKey(eptId);
        HashMap<String,Object> eptInfo = new HashMap<String, Object>();
        eptInfo.put("eptId",experiment.getId());
        eptInfo.put("eptName",experiment.getEptName());
        eptInfo.put("englishName",experiment.getEnglishName());
        eptInfo.put("eptDes",experiment.getDes());
        eptInfo.put("difficultLevel",experiment.getDifficultDegree());
        eptInfo.put("passRate",experiment.getPassRate());
        eptInfo.put("stepNum",experiment.getSteps());
        eptInfo.put("knowledgePoint",experiment.getKnowledgePoint());
        eptInfo.put("scanNum",experiment.getScanNum());
        eptInfo.put("coverPic",experiment.getCoverPic());

        //获取步骤图
        ExperimentstepExample experimentstepExample = new ExperimentstepExample();
        ExperimentstepExample.Criteria criteria = experimentstepExample.createCriteria();
        criteria.andEptIdEqualTo(experiment.getId());
        List<Experimentstep> experimentsteps = experimentstepMapper.selectByExample(experimentstepExample);

        ArrayList<Object> stepInfo = new ArrayList<Object>();
        for(Experimentstep step:experimentsteps)
        {
            HashMap<String,Object> oneStepInfo = new HashMap<String, Object>();
            oneStepInfo.put("num",step.getStepNum());
            oneStepInfo.put("name",step.getStepName());
            oneStepInfo.put("des",step.getStepDes());
            oneStepInfo.put("pic",step.getStepPic());

            stepInfo.add(oneStepInfo);

        }

        eptInfo.put("stepInfo",stepInfo);

        return ServerResponse.createBySuccess("获取成功",eptInfo);







    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<HashMap<String, Object>> getBigEptPurpose() {
        /**
         * @Author jiaxin
         * @Description 获取某实验目的//TODO
         * @Date 11:14 上午 2020/10/27
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/

        int eptId = 1;
        Bigexperiment bigexperiment = bigexperimentMapper.selectByPrimaryKey((Integer) eptId);
        HashMap<String, Object> eptInfo = new HashMap<String, Object>();
        eptInfo.put("eptId", bigexperiment.getId());
        eptInfo.put("eptName", bigexperiment.getName());
        eptInfo.put("eptContent", bigexperiment.getPurpose());
        eptInfo.put("eptPic", bigexperiment.getPurposePic());


        return ServerResponse.createBySuccess("获取成功", eptInfo);


    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<HashMap<String, Object>> getBigEptRequirement() {
        /**
         * @Author myz
         * @Description 获取某实验要求//TODO
         * @Date 9：50 上午 2020/10/30
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/
        int eptId = 1;  //only one bigExpt
        Bigexperiment bigexperiment = bigexperimentMapper.selectByPrimaryKey((Integer) eptId);
        HashMap<String, Object> eptInfo = new HashMap<String, Object>();
        eptInfo.put("eptId", bigexperiment.getId());
        eptInfo.put("eptName", bigexperiment.getName());
        eptInfo.put("eptContent", bigexperiment.getRequirement());
        eptInfo.put("eptPic", bigexperiment.getRequirementPic());

        return ServerResponse.createBySuccess("获取成功", eptInfo);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<HashMap<String, Object>> getBigEptPrinciple() {
        /**
         * @Author myz
         * @Description 获取某实验原理//TODO
         * @Date 9：50 上午 2020/10/30
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/

        int eptId = 1;
        Bigexperiment bigexperiment = bigexperimentMapper.selectByPrimaryKey((Integer) eptId);
        HashMap<String, Object> eptInfo = new HashMap<String, Object>();
        eptInfo.put("eptId", bigexperiment.getId());
        eptInfo.put("eptName", bigexperiment.getName());
        eptInfo.put("eptContent", bigexperiment.getPrinciple());
        eptInfo.put("eptPic", bigexperiment.getPrinciplePic());

        return ServerResponse.createBySuccess("获取成功", eptInfo);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<HashMap<String, Object>> getBigEptMethod() {
        /**
         * @Author myz
         * @Description 获取某实验方法//TODO
         * @Date 9：50 上午 2020/10/30
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/

        int eptId = 1;
        Bigexperiment bigexperiment = bigexperimentMapper.selectByPrimaryKey((Integer) eptId);
        HashMap<String, Object> eptInfo = new HashMap<String, Object>();
        eptInfo.put("eptId", bigexperiment.getId());
        eptInfo.put("eptName", bigexperiment.getName());
        eptInfo.put("eptContent", bigexperiment.getMethod());
        eptInfo.put("eptPic", bigexperiment.getMethodPic());

        return ServerResponse.createBySuccess("获取成功", eptInfo);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<HashMap<String, Object>> getBigEptStep() {
        /**
         * @Author myz
         * @Description 获取某实验步骤//TODO
         * @Date 9：50 上午 2020/10/30
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/

        int eptId = 1;
        Bigexperiment bigexperiment = bigexperimentMapper.selectByPrimaryKey((Integer) eptId);
        HashMap<String, Object> eptInfo = new HashMap<String, Object>();
        eptInfo.put("eptId", bigexperiment.getId());
        eptInfo.put("eptName", bigexperiment.getName());
        eptInfo.put("eptContent", bigexperiment.getSteps());
        eptInfo.put("eptPic", bigexperiment.getStepPic());

        return ServerResponse.createBySuccess("获取成功", eptInfo);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<HashMap<String, Object>> getBigEptDevice() {
        /**
         * @Author myz
         * @Description 获取某实验仪器设备//TODO
         * @Date 9：50 上午 2020/10/30
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/

        int eptId = 1;
        Bigexperiment bigexperiment = bigexperimentMapper.selectByPrimaryKey((Integer) eptId);
        HashMap<String, Object> eptInfo = new HashMap<String, Object>();
        eptInfo.put("eptId", bigexperiment.getId());
        eptInfo.put("eptName", bigexperiment.getName());
        eptInfo.put("eptContent", bigexperiment.getDevice());
        eptInfo.put("eptPic", bigexperiment.getDevicePic());

        return ServerResponse.createBySuccess("获取成功", eptInfo);
    }





    //开始实验
    @Override
    @Transactional(propagation = Propagation.REQUIRED)//增加事务回滚
    public ServerResponse<Boolean> beginExperiment(int userid,int expId)
    {
        /**
         * @Author jiaxin
         * @Description 开始实验；记录实验开始的时间？【或许获取进度？】//TODO
         * @Date 10:04 下午 2020/11/2
         * @Param [userid用户id, expId实验id]
         * @return hci.artedu.common.ServerResponse<java.lang.Boolean>
         **/

        //写日志
        User user = userMapper.selectByPrimaryKey(userid);
        Experiment experiment = experimentMapper.selectByPrimaryKey(expId);

        Useroperation useroperation = new Useroperation();
        useroperation.setUserId(user.getId());
        useroperation.setUserOperation("beginEpt");
        useroperation.setParams(Integer.toString(experiment.getId()));
        useroperation.setUserName(user.getUserName());
        Timestamp beginTime = DateUtils.nowDateTime();
        useroperation.setOperationTime(beginTime);
        useroperationMapper.insert(useroperation);

        return ServerResponse.createBySuccess("开始成功", true);


    }



    @Override
    @Transactional(propagation = Propagation.REQUIRED)//增加事务回滚
    public ServerResponse endPostExperiment(EptRecord eptRecord,int[] process)
    {
        /**
         * @Author jiaxin
         * @Description 实验结束后提交信息//TODO
         * @Date 10:49 上午 2020/11/5
         * @Param [eptRecord]
         * @return hci.artedu.common.ServerResponse
         **/

        eptrecordMapper.insert(eptRecord);//记录实验相关
        //写日志
        User user = userMapper.selectByPrimaryKey(eptRecord.getUserid());
        Experiment experiment = experimentMapper.selectByPrimaryKey(eptRecord.getEptId());

        //记录实验进度
        for(int i =0;i<process.length;i++)
        {
            Userprocess userprocess = new Userprocess();
            userprocess.setUserId(eptRecord.getUserid());
            userprocess.setEptId(eptRecord.getEptId());
            userprocess.setStageNum(process[i]);
            userprocessMapper.insert(userprocess);
        }


        Useroperation useroperation = new Useroperation();
        useroperation.setUserId(user.getId());
        useroperation.setUserOperation("endEpt");
        useroperation.setParams(Integer.toString(experiment.getId()));
        useroperation.setUserName(user.getUserName());
        Timestamp endTime = DateUtils.nowDateTime();
        useroperation.setOperationTime(endTime);

        useroperationMapper.insert(useroperation);

        return ServerResponse.createBySuccessMessage("记录成功");

    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<ArrayList> getUserExperimentProcess(int userId)
    {
        /**
         * @Author jiaxin
         * @Description 获取某用户的实验进度//TODO
         * @Date 10:49 上午 2020/11/5
         * @Param [userId]
         * @return hci.artedu.common.ServerResponse<java.util.ArrayList>
         **/

        User user = userMapper.selectByPrimaryKey(userId);
        EptRecordExample eptRecordExample = new EptRecordExample();
        EptRecordExample.Criteria criteria = eptRecordExample.createCriteria();
        criteria.andUseridEqualTo(user.getId());
        List<EptRecord> eptRecordList = eptrecordMapper.selectByExample(eptRecordExample);

        ArrayList<Object> userProcess = new ArrayList<Object>();
        for(EptRecord eptRecord:eptRecordList)
        {
            HashMap<String,Object> map = new HashMap<String, Object>();
            map.put("eptId",eptRecord.getEptId());
            Experiment experiment = experimentMapper.selectByPrimaryKey(eptRecord.getEptId());
            map.put("eptName",experiment.getEptName());
            map.put("process",eptRecord.getProgress());

            userProcess.add(map);
        }

        return ServerResponse.createBySuccess("获取成功", userProcess);

    }



    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<ArrayList> getEptPoint(int eptId)
    {
        /**
         * @Author jiaxin
         * @Description 获取某个实验对应的知识点列表//TODO
         * @Date 4:58 下午 2020/11/4
         * @Param [eptId]
         * @return hci.artedu.common.ServerResponse<java.util.ArrayList>
         **/

        Experiment experiment = experimentMapper.selectByPrimaryKey(eptId);
        PointExperimentExample pointExperimentExample = new PointExperimentExample();
        PointExperimentExample.Criteria criteria = pointExperimentExample.createCriteria();
        criteria.andEptIdEqualTo(experiment.getId());
        List<PointExperiment> pointExperimentList = pointExperimentMapper.selectByExample(pointExperimentExample);

        ArrayList<Object> pointList = new ArrayList<>();
        for(PointExperiment pointExperiment:pointExperimentList)
        {
            Knowledgepoint knowledgepoint = knowledgepointMapper.selectByPrimaryKey(pointExperiment.getPointId());
            HashMap<String,Object> map = new HashMap<String, Object>();
            map.put("id",knowledgepoint.getId());
            map.put("pointName",knowledgepoint.getName());
            pointList.add(map);

        }
        return ServerResponse.createBySuccess("获取成功", pointList);



    }


    //获取该用户该实验进度
    public ServerResponse<int[]> getEptProcess(int eptId,int userId)
    {
        UserprocessExample userprocessExample = new UserprocessExample();
        UserprocessExample.Criteria criteria = userprocessExample.createCriteria();
        criteria.andEptIdEqualTo(eptId);
        criteria.andUserIdEqualTo(userId);
        List<Userprocess> userprocessList = userprocessMapper.selectByExample(userprocessExample);
        Set set = new HashSet(userprocessList);
        List tempList = new ArrayList(set);
        userprocessList = tempList;

        int[] stageList = new int[userprocessList.size()];
        int count = 0;
        for(Userprocess userprocess:userprocessList)
        {
            stageList[count] = userprocess.getStageNum();
        }

        return ServerResponse.createBySuccess("获取成功", stageList);


    }







}
