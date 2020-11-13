package hci.artedu.service.impl;

import hci.artedu.common.ServerResponse;
import hci.artedu.dao.*;
import hci.artedu.pojo.*;
import hci.artedu.service.EptService;
import hci.artedu.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.hash.HashMapper;
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
    private PointExperimentMapper pointExperimentMapper;

    @Autowired
    private KnowledgepointMapper knowledgepointMapper;

    @Autowired
    private EptrecordMapper eptrecordMapper;

    @Autowired
    private  PointrecordMapper pointrecordMapper;

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

//        Useroperation useroperation = new Useroperation();
//        useroperation.setUserId(user.getId());
//        useroperation.setUserOperation("beginEpt");
//        useroperation.setParams(Integer.toString(experiment.getId()));
//        useroperation.setUserName(user.getUserName());
//        Timestamp beginTime = DateUtils.nowDateTime();
//        useroperation.setOperationTime(beginTime);
//        useroperationMapper.insert(useroperation);

        return ServerResponse.createBySuccess("开始成功", true);


    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)//增加事务回滚
    public ServerResponse endPostExperiment(EptRecord eptRecord)
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
        //写日志
        User user = userMapper.selectByPrimaryKey(eptRecord.getUserid());
        Experiment experiment = experimentMapper.selectByPrimaryKey(eptRecord.getEptId());
//
//        Useroperation useroperation = new Useroperation();
//        useroperation.setUserId(user.getId());
//        useroperation.setUserOperation("endEpt");
//        useroperation.setParams(Integer.toString(experiment.getId()));
//        useroperation.setUserName(user.getUserName());
//        Timestamp endTime = DateUtils.nowDateTime();
//        useroperation.setOperationTime(endTime);
//
//        useroperationMapper.insert(useroperation);

        return ServerResponse.createBySuccessMessage("记录成功");

    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<ArrayList> getUserExperimentProcess(int userId)
    {
        /**
         * @Author jiaxin
         * @Description 获取某用户的实验进度-不用了//TODO
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

    @Override
    public ServerResponse<HashMap<String, Object>> getAllTimeLength() {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 学生总体时长统计
         * @Author Leaf
         * @Date 2020/11/13 11:32 上午
         **/
        //实验时长
        int eptSum = 0;
        EptRecordExample eptRecordExample = new EptRecordExample();

        //学习时长
        //在线时长
        return null;
    }

    @Override
    public ServerResponse<HashMap<String, Object>> getStudentMasterAttitude() {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 用于获取所有学生的喜好度和掌握程度
         * @Author Leaf
         * @Date 2020/11/13 10:16 上午
         **/
        UserExample example = new UserExample();
        UserExample.Criteria criteria =  example.createCriteria();
        criteria.andUserTypeEqualTo(0);
        criteria.andUserAttitudeIsNotNull();
        criteria.andLevelOfMasteryIsNotNull();
        int averageLike = 0;
        int averageNormal = 0;
        int averageDislike = 0;
        List<User> uList = userMapper.selectByExample(example);
        for(User u:uList){
            if(u.getUserAttitude() == 0){
                averageLike ++;
            }
            else if(u.getUserAttitude() == 1){
                averageNormal++;
            }
            else if(u.getUserAttitude() == 2){
                averageDislike++;
            }
        }
        HashMap<String,Object> averInfo = new HashMap<String, Object>();
        averInfo.put("averageLike",averageLike);
        averInfo.put("averageNormal",averageNormal);
        averInfo.put("averageDislike",averageDislike);

        UserExample example1 = new UserExample();
        UserExample.Criteria criteria1 =  example1.createCriteria();
        criteria1.andUserTypeEqualTo(0);
        criteria1.andUserAttitudeIsNotNull();
        criteria1.andLevelOfMasteryIsNotNull();
        criteria1.andUserGenderEqualTo(Boolean.TRUE);
        int maleLike = 0;
        int maleNormal = 0;
        int maleDislike = 0;
        List<User> uList1 = userMapper.selectByExample(example1);
        for(User u:uList1){
            if(u.getUserAttitude() == 0){
                maleLike ++;
            }
            else if(u.getUserAttitude() == 1){
                maleNormal++;
            }
            else if(u.getUserAttitude() == 2){
                maleDislike++;
            }
        }
        HashMap<String,Object> maleInfo = new HashMap<String, Object>();
        averInfo.put("maleLike",maleLike);
        averInfo.put("maleNormal",maleNormal);
        averInfo.put("maleDislike",maleDislike);

        UserExample example2 = new UserExample();
        UserExample.Criteria criteria2 =  example2.createCriteria();
        criteria2.andUserTypeEqualTo(0);
        criteria2.andUserAttitudeIsNotNull();
        criteria2.andLevelOfMasteryIsNotNull();
        criteria2.andUserGenderEqualTo(Boolean.FALSE);
        int femaleLike = 0;
        int femaleNormal = 0;
        int femaleDislike = 0;
        List<User> uList2 = userMapper.selectByExample(example2);
        for(User u:uList2){
            if(u.getUserAttitude() == 0){
                femaleLike ++;
            }
            else if(u.getUserAttitude() == 1){
                femaleNormal++;
            }
            else if(u.getUserAttitude() == 2){
                femaleDislike++;
            }
        }
        HashMap<String,Object> femaleInfo = new HashMap<String, Object>();
        averInfo.put("femaleLike",femaleLike);
        averInfo.put("femaleNormal",femaleNormal);
        averInfo.put("femaleDislike",femaleDislike);

        HashMap<String, Object> res= new HashMap<>();
        res.put("aver", averInfo);
        res.put("male", maleInfo);
        res.put("female",femaleInfo);

        return ServerResponse.createBySuccess("获取成功", res);
    }

    @Override
    public ServerResponse<HashMap<String, Object>> getStudentInfo(String studentName) {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 通过学生姓名查询学生基本信息
         * @Author Leaf
         * @Date 2020/11/13 10:17 上午
         **/
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(studentName);
        List<User> userList = userMapper.selectByExample(example);
        User user =userList.get(0);

        HashMap<String,Object> studentInfo = new HashMap<>();//基本信息
        studentInfo.put("userGender", user.getUserGender());
        studentInfo.put("userEmail", user.getUserEmail());
        studentInfo.put("schoolName", user.getSchoolName());
        studentInfo.put("className", user.getClassName());
        studentInfo.put("phoneNumber", user.getPhoneNumber());
        studentInfo.put("userAttitude", user.getUserAttitude());
        studentInfo.put("levelOfMastery", user.getLevelOfMastery());
        studentInfo.put("userEmail", user.getUserEmail());

        HashMap<String,Object> studentScore = new HashMap<>();
//        EptRecordExample eptRecordExample = new EptRecordExample();
//        EptRecordExample.Criteria criteria1 =eptRecordExample.createCriteria();
//        criteria1.andUseridEqualTo(user.getId());

        HashMap<String,Object> eptTime = new HashMap<>();//实验时长
        EptRecordExample eptRecordExample1 = new EptRecordExample();
        EptRecordExample.Criteria criteria2 =eptRecordExample1.createCriteria();
        criteria2.andUseridEqualTo(user.getId());
        List<EptRecord> eptRecordList = eptrecordMapper.selectByExample(eptRecordExample1);
        long[] temp=new long[6];
        for (int i = 0; i < 6; i++) {
            for (EptRecord e: eptRecordList) {
                if (e.getEptId() == i){
                    temp[i] += e.getEndTime().getTime() - e.getStartTime().getTime();
                }
            }
            eptTime.put("ept"+i, temp[i]);
        }
        HashMap<String,Object> pointTime = new HashMap<>();//知识点时长 存在问题 现在就一个知识点
        PointrecordExample pointrecordExample = new PointrecordExample();
        PointrecordExample.Criteria criteria3 =pointrecordExample.createCriteria();
        criteria3.andUserIdEqualTo(user.getId());
        List<Pointrecord> pointrecordList = pointrecordMapper.selectByExample(pointrecordExample);
        long[] temp1=new long[6];
        for (int i = 0; i < 6; i++) {
            for (Pointrecord p: pointrecordList) {
                if (p.getPointId() == i){
                    temp[i] += p.getCompleteTime().getTime();
                }
            }
            pointTime.put("point"+i, temp1[i]);
        }
        return null;

    }

    @Override
    public ServerResponse<HashMap<String, Object>> getClassInfo(int classNumber) {
       return null;
    }

    @Override
    public ServerResponse<HashMap<String, Object>> getSchoolInfo(String schoolName) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andSchoolNameEqualTo(schoolName);
        criteria.andUserTypeEqualTo(0);
        int male = 0, female = 0, maleMastery0 = 0, maleMastery1 = 0, maleMastery2 = 0, femaleMastery0 = 0,
                femaleMastery1 = 0, femaleMastery2 = 0, maleAttitude0 = 0, maleAttitude1 = 0,
                maleAttitude2 = 0, femaleAttitude0 = 0,femaleAttitude1 = 0,femaleAttitude2 =0,averAttitude0 = 0,
                averAttitude1 = 0, averAttitude2 = 0, averMastery0 = 0, averMastery1 = 0, averMastery2 = 0;
        List<User> userList = userMapper.selectByExample(userExample);
        for (User u:
             userList) {
            if(u.getUserGender()==Boolean.TRUE){
                male += 1;
                if(u.getUserAttitude() == 0){
                    maleAttitude0 += 1;
                }
                if(u.getUserAttitude() == 1){
                    maleAttitude1 += 1;
                }
                if(u.getUserAttitude() == 2){
                    maleAttitude2 += 1;
                }
                if(u.getLevelOfMastery() ==0){
                    maleMastery0 += 1;
                }
                if(u.getLevelOfMastery() == 1){
                    maleMastery1 += 1;
                }
                if(u.getLevelOfMastery() == 2){
                    maleMastery2 += 1;
                }
            }
            else if(u.getUserGender()==Boolean.FALSE){
                female += 1;
                if(u.getUserAttitude() == 0){
                    femaleAttitude0 += 1;
                }
                if(u.getUserAttitude() == 1){
                    femaleAttitude1 += 1;
                }
                if(u.getUserAttitude() == 2){
                    femaleAttitude2 += 1;
                }
                if(u.getLevelOfMastery() ==0){
                    femaleMastery0 += 1;
                }
                if(u.getLevelOfMastery() == 1){
                    femaleMastery1 += 1;
                }
                if(u.getLevelOfMastery() == 2){
                    femaleMastery2 += 1;
                }
            }
        }
        int malePercent = male/userList.size();
        int femalePercent = female/userList.size();
        averAttitude0 = maleAttitude0 * malePercent + femaleAttitude0 * femalePercent;
        averAttitude1 = maleAttitude1 * malePercent + femaleAttitude1 * femalePercent;
        averAttitude2 = maleAttitude2 * malePercent + femaleAttitude2 * femalePercent;
        averMastery0 = maleMastery0 * malePercent + femaleMastery0 * femalePercent;
        averMastery1 = maleMastery1 * malePercent + femaleMastery1 * femalePercent;
        averMastery2 = maleMastery2 * malePercent + femaleMastery2 * femalePercent;
        HashMap<String,Object> AttitudeMap =new HashMap<>();
        AttitudeMap.put("女生喜欢",femaleAttitude0);
        AttitudeMap.put("女生一般",femaleAttitude1);
        AttitudeMap.put("女生抵触", femaleAttitude2);
        AttitudeMap.put("男生喜欢", maleAttitude0);
        AttitudeMap.put("男生一般", maleAttitude1);
        AttitudeMap.put("男生抵触", maleAttitude2);
        AttitudeMap.put("平均喜欢", averAttitude0);
        AttitudeMap.put("平均一般", averAttitude1);
        AttitudeMap.put("平均抵触", averAttitude2);

        HashMap<String,Object> MasteryMap = new HashMap<String, Object>();
        MasteryMap.put("女生从未学过",femaleMastery0);
        MasteryMap.put("女生学习1-3年",femaleMastery1);
        MasteryMap.put("女生学习3年以上",femaleMastery2);
        MasteryMap.put("男生从未学过",maleMastery0);
        MasteryMap.put("男生学习1-3年",maleMastery1);
        MasteryMap.put("男生学习3年以上",maleMastery2);
        MasteryMap.put("平均从未学过",averMastery0);
        MasteryMap.put("平均学习1-3年",averMastery1);
        MasteryMap.put("平均学习3年以上",averMastery2);

        HashMap<String,Object> res = new HashMap<>();
        res.put("attitude",AttitudeMap);
        res.put("Mastery",MasteryMap);
        res.put("male",male);
        res.put("female",female);
        res.put("malePercent",malePercent);
        res.put("femalePercent",femalePercent);
        return ServerResponse.createBySuccess("获取成功", res);
    }

    @Override
    public ServerResponse<HashMap<String, Object>> getEptCondition() {
        return null;
    }

    @Override
    public ServerResponse<HashMap<String, Object>> getStudentScore(String studentName) {
        return null;
    }

    @Override
    public ServerResponse<String> postAnswer(int userId, int eptId, int progress, Date time, Date startTime, Date endTime, Date date) {
        /**
         * TODO 好像没啥用
         * @return hci.artedu.common.ServerResponse<java.lang.String>
         * @Description 
         * @Author Leaf
         * @Date 2020/11/11 8:24 下午
         **/
        EptRecord eptRecord = new EptRecord();
        eptRecord.setUserid(userId);
        eptRecord.setEptId(eptId);
        eptRecord.setEptDate(date);
        eptRecord.setStartTime(startTime);
        eptRecord.setEndTime(endTime);
//        eptRecord.setDurTime(time);
        return null;
    }

    @Override
    public ServerResponse<HashMap<String, Object>> getRank(int userId, int id) {
        return null;
    }

    @Override
    public ServerResponse<String> postFeedback(int id, int difficultLevel, int exerciseLevel, int masteryLevel) {
        /**
         * TODO 提交实验 看结果 应该返回记录id  然后这里重写那个记录
         * @return hci.artedu.common.ServerResponse<java.lang.String>
         * @Description 
         * @Author Leaf
         * @Date 2020/11/11 8:30 下午
         **/
        EptRecordExample eptRecordExample = new EptRecordExample();
        EptRecordExample.Criteria critrtia = eptRecordExample.createCriteria();
        critrtia.andIdEqualTo(id);
        List<EptRecord> eptRecordList = eptrecordMapper.selectByExample(eptRecordExample);
        EptRecord eptRecord =eptRecordList.get(0);
        eptRecord.setDifficultyLevel(difficultLevel);
        eptRecord.setExerciseLevel(exerciseLevel);
        eptRecord.setMasteryLevel(masteryLevel);
        return null;
    }

    @Override
    public ServerResponse<HashMap<String, Object>> getScore(int userId, int eptId) {
        return null;
    }

    @Override
    public ServerResponse<HashMap<String, Object>> getReport(int userId) {
        return null;
    }


//    @Override
//    public ServerResponse<int[]> getEptProcess(int expId, int userId)
//    {
//        UserprocessExample userprocessExample = new UserprocessExample();
//        UserprocessExample.Criteria criteria = userprocessExample.createCriteria();
//        criteria.andEptIdEqualTo(expId);
//        criteria.andUserIdEqualTo(userId);
//
//    }

    //获取该用户该实验进度
    public ServerResponse<int[]> getEptProcess(int eptId,int userId)
    {
        UserprocessExample userprocessExample = new UserprocessExample();
        UserprocessExample.Criteria criteria = userprocessExample.createCriteria();
        criteria.andEptIdEqualTo(eptId);
        criteria.andUserIdEqualTo(userId);
        List<Userprocess> userprocessList = userprocessMapper.selectByExample(userprocessExample);

        int[] stageList = new int[userprocessList.size()];
        int count = 0;
        for(Userprocess userprocess:userprocessList)
        {
            stageList[count] = userprocess.getStageNum();
            count++;
        }

        return ServerResponse.createBySuccess("获取成功", stageList);


    }

    //用户过了某一关
    @Override
    @Transactional(propagation = Propagation.REQUIRED)//增加事务回滚
    public ServerResponse<Boolean> postUserStageNum(int userId,int eptId,int stageNum)
    {
        /**
         * @Author jiaxin
         * @Description 用户过了某一关//TODO
         * @Date 3:34 下午 2020/11/12
         * @Param [userId, eptId, stageNum]
         * @return hci.artedu.common.ServerResponse<int[]>
         **/
         //先查有没有此关的记录

        UserprocessExample userprocessExample = new UserprocessExample();
        UserprocessExample.Criteria criteria = userprocessExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andEptIdEqualTo(eptId);
        criteria.andStageNumEqualTo(stageNum);
        List<Userprocess> userprocessList = userprocessMapper.selectByExample(userprocessExample);
        if(userprocessList.size()!=0)
        {
            return ServerResponse.createByErrorMessage("已存在该记录");
        }
        else
        {
            Userprocess userprocess = new Userprocess();
            userprocess.setStageNum(stageNum);
            userprocess.setEptId(eptId);
            userprocess.setUserId(userId);
            Timestamp nowTime = DateUtils.nowDateTime();
            userprocess.setCompletetime(nowTime);
            userprocessMapper.insert(userprocess);
            return ServerResponse.createBySuccess("记录成功",Boolean.TRUE);
        }
    }

    //




}
