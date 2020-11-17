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
import java.text.DecimalFormat;
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

    @Autowired
    private  LearningRecordMapper learningRecordMapper;

    @Autowired
    private  UserloginlogMapper userloginlogMapper;



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
            map.put("pointName", knowledgepoint.getName());
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
        long eptTimeMin = Long.MAX_VALUE;
        long eptTimeMax = 0;
        long eptTimeAver;
        EptRecordExample eptRecordExample = new EptRecordExample();
        List<EptRecord> eptRecordList = eptrecordMapper.selectByExample(eptRecordExample);
        long eptTimeSum = 0;
        for (EptRecord e : eptRecordList) {
            eptTimeSum += e.getDurTime();
            if (e.getDurTime() > eptTimeMax) {
                eptTimeMax = e.getDurTime();
            }
            if (e.getDurTime() < eptTimeMin) {
                eptTimeMin = e.getDurTime();
            }
        }
        eptTimeAver = eptTimeSum / eptRecordList.size();

        //学习时长
        long learningTimeMin = Long.MAX_VALUE;
        long learningTimeMax = 0;
        long learningTimeAver;
        LearningRecordExample learningRecordExample = new LearningRecordExample();
        List<LearningRecord> learningRecordList = learningRecordMapper.selectByExample(learningRecordExample);
        long learningTimeSum = 0;
        for (LearningRecord l :
                learningRecordList) {
            learningTimeSum += l.getDuringTime();
            if (l.getDuringTime() > eptTimeMax) {
                learningTimeMax = l.getDuringTime();
            }
            if (l.getDuringTime() < eptTimeMin) {
                learningTimeMin = l.getDuringTime();
            }
        }
        learningTimeAver = learningTimeSum / learningRecordList.size();

        //在线时长
        long onlineTimeMin = Long.MAX_VALUE;
        long onlineTimeMax = 0;
        long onlineTimeAver;
        UserloginlogExample userloginlogExample = new UserloginlogExample();
        List<Userloginlog> userloginlogList = userloginlogMapper.selectByExample(userloginlogExample);
        long onlineTimeSum = 0;
        for (Userloginlog u :
                userloginlogList) {
            onlineTimeSum += u.getDuringTime();
            if (u.getDuringTime() > onlineTimeMax) {
                onlineTimeMax = u.getDuringTime();
            }
            if (u.getDuringTime() < onlineTimeMin) {
                onlineTimeMin = u.getDuringTime();
            }
        }
        onlineTimeAver = onlineTimeSum / userloginlogList.size();

        HashMap<String, Object> res = new HashMap<>();
        res.put("eptTimeMin", eptTimeMin);
        res.put("eptTimeMax", eptTimeMax);
        res.put("eptTimeAver", eptTimeAver);
        res.put("learningTimeMin", learningTimeMin);
        res.put("learningTimeMax", learningTimeMax);
        res.put("learningTimeAver", learningTimeAver);
        res.put("onlineTimeMin", onlineTimeMin);
        res.put("onlineTimeMax", onlineTimeMax);
        res.put("onlineTimeAver", onlineTimeAver);

        return ServerResponse.createBySuccess("获取成功", res);
    }

    @Override
    public ServerResponse<HashMap<String, Object>> getStudentMasterAttitude() {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         * @Description 用于获取所有学生的喜好度和掌握程度
         * @Author Leaf
         * @Date 2020/11/13 10:16 上午
         **/
//        UserExample example = new UserExample();
//        UserExample.Criteria criteria = example.createCriteria();
//        criteria.andUserTypeEqualTo(0);
//        criteria.andUserAttitudeIsNotNull();
//        criteria.andLevelOfMasteryIsNotNull();
//        int averageLike = 0;
//        int averageNormal = 0;
//        int averageDislike = 0;
//        List<User> uList = userMapper.selectByExample(example);
//        for (User u : uList) {
//            if (u.getUserAttitude() == 0) {
//                averageLike++;
//            } else if (u.getUserAttitude() == 1) {
//                averageNormal++;
//            } else if (u.getUserAttitude() == 2) {
//                averageDislike++;
//            }
//        }
//        HashMap<String, Object> averInfo = new HashMap<String, Object>();
//        averInfo.put("averageLike", averageLike);
//        averInfo.put("averageNormal", averageNormal);
//        averInfo.put("averageDislike", averageDislike);
//
//        UserExample example1 = new UserExample();
//        UserExample.Criteria criteria1 = example1.createCriteria();
//        criteria1.andUserTypeEqualTo(0);
//        criteria1.andUserAttitudeIsNotNull();
//        criteria1.andLevelOfMasteryIsNotNull();
//        criteria1.andUserGenderEqualTo(Boolean.TRUE);
//        int maleLike = 0;
//        int maleNormal = 0;
//        int maleDislike = 0;
//        List<User> uList1 = userMapper.selectByExample(example1);
//        for (User u : uList1) {
//            if (u.getUserAttitude() == 0) {
//                maleLike++;
//            } else if (u.getUserAttitude() == 1) {
//                maleNormal++;
//            } else if (u.getUserAttitude() == 2) {
//                maleDislike++;
//            }
//        }
//        HashMap<String, Object> maleInfo = new HashMap<String, Object>();
//        maleInfo.put("maleLike", maleLike);
//        maleInfo.put("maleNormal", maleNormal);
//        maleInfo.put("maleDislike", maleDislike);
//
//        UserExample example2 = new UserExample();
//        UserExample.Criteria criteria2 = example2.createCriteria();
//        criteria2.andUserTypeEqualTo(0);
//        criteria2.andUserAttitudeIsNotNull();
//        criteria2.andLevelOfMasteryIsNotNull();
//        criteria2.andUserGenderEqualTo(Boolean.FALSE);
//        int femaleLike = 0;
//        int femaleNormal = 0;
//        int femaleDislike = 0;
//        List<User> uList2 = userMapper.selectByExample(example2);
//        for (User u : uList2) {
//            if (u.getUserAttitude() == 0) {
//                femaleLike++;
//            } else if (u.getUserAttitude() == 1) {
//                femaleNormal++;
//            } else if (u.getUserAttitude() == 2) {
//                femaleDislike++;
//            }
//        }
//        HashMap<String, Object> femaleInfo = new HashMap<String, Object>();
//        femaleInfo.put("femaleLike", femaleLike);
//        femaleInfo.put("femaleNormal", femaleNormal);
//        femaleInfo.put("femaleDislike", femaleDislike);
//
//        HashMap<String, Object> res = new HashMap<>();
//        res.put("aver", averInfo);
//        res.put("male", maleInfo);
//        res.put("female", femaleInfo);
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserTypeEqualTo(0);
        criteria.andUserAttitudeIsNotNull();
        criteria.andLevelOfMasteryIsNotNull();
        double male = 0, female = 0, maleMastery0 = 0, maleMastery1 = 0, maleMastery2 = 0, femaleMastery0 = 0,
                femaleMastery1 = 0, femaleMastery2 = 0, maleAttitude0 = 0, maleAttitude1 = 0,
                maleAttitude2 = 0, femaleAttitude0 = 0, femaleAttitude1 = 0, femaleAttitude2 = 0, averAttitude0 = 0,
                averAttitude1 = 0, averAttitude2 = 0, averMastery0 = 0, averMastery1 = 0, averMastery2 = 0;
        List<User> userList = userMapper.selectByExample(userExample);
        for (User u :
                userList) {
            if (u.getUserGender() == Boolean.TRUE) {
                male += 1;
                if (u.getUserAttitude() == 0) {
                    maleAttitude0 += 1;
                }
                if (u.getUserAttitude() == 1) {
                    maleAttitude1 += 1;
                }
                if (u.getUserAttitude() == 2) {
                    maleAttitude2 += 1;
                }
                if (u.getLevelOfMastery() == 0) {
                    maleMastery0 += 1;
                }
                if (u.getLevelOfMastery() == 1) {
                    maleMastery1 += 1;
                }
                if (u.getLevelOfMastery() == 2) {
                    maleMastery2 += 1;
                }
            } else if (u.getUserGender() == Boolean.FALSE) {
                female += 1;
                if (u.getUserAttitude() == 0) {
                    femaleAttitude0 += 1;
                }
                if (u.getUserAttitude() == 1) {
                    femaleAttitude1 += 1;
                }
                if (u.getUserAttitude() == 2) {
                    femaleAttitude2 += 1;
                }
                if (u.getLevelOfMastery() == 0) {
                    femaleMastery0 += 1;
                }
                if (u.getLevelOfMastery() == 1) {
                    femaleMastery1 += 1;
                }
                if (u.getLevelOfMastery() == 2) {
                    femaleMastery2 += 1;
                }
            }
        }
        double malePercent = male / userList.size();
        double femalePercent = female / userList.size();
        averAttitude0 = maleAttitude0 * malePercent + femaleAttitude0 * femalePercent;
        averAttitude1 = maleAttitude1 * malePercent + femaleAttitude1 * femalePercent;
        averAttitude2 = maleAttitude2 * malePercent + femaleAttitude2 * femalePercent;
        averMastery0 = maleMastery0 * malePercent + femaleMastery0 * femalePercent;
        averMastery1 = maleMastery1 * malePercent + femaleMastery1 * femalePercent;
        averMastery2 = maleMastery2 * malePercent + femaleMastery2 * femalePercent;
        HashMap<String, Object> map = new HashMap<>();
        map.put("like","喜欢");
        map.put("女生",femaleAttitude0);
        map.put("男生",maleAttitude0);
        map.put("平均",averAttitude0);

        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("like","一般");
        map1.put("女生",femaleAttitude1);
        map1.put("男生",maleAttitude1);
        map1.put("平均",averAttitude1);

        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("like","抵触");
        map2.put("女生",femaleAttitude2);
        map2.put("男生",maleAttitude2);
        map2.put("平均",averAttitude2);

        HashMap<String, Object> map3 = new HashMap<>();
        map3.put("mastery","从未学过");
        map3.put("女生",femaleMastery0);
        map3.put("男生",maleMastery0);
        map3.put("平均",averMastery0);

        HashMap<String, Object> map4 = new HashMap<>();
        map4.put("mastery","学习1-3年");
        map4.put("女生",femaleMastery1);
        map4.put("男生",maleMastery1);
        map4.put("平均",averMastery1);

        HashMap<String, Object> map5 = new HashMap<>();
        map5.put("mastery","学习3年以上");
        map5.put("女生",femaleMastery2);
        map5.put("男生",maleMastery2);
        map5.put("平均",averMastery2);
        String[] dim = {"like","女生","男生","平均"};
        HashMap<String,Object> like =new HashMap<>();
        List<Map> like1 = new ArrayList<>();
        like1.add(map);
        like1.add(map1);
        like1.add(map2);
        like.put("demensions",dim);
        like.put("source",like1);

        String[] dim1 = {"mastery","女生","男生","平均"};
        HashMap<String,Object> mastery =new HashMap<>();
        List<Map> mastery1 = new ArrayList<>();
        mastery1.add(map3);
        mastery1.add(map4);
        mastery1.add(map5);
        mastery.put("dimensions",dim1);
        mastery.put("source",mastery1);

        HashMap<String,Object> res =new HashMap<>();
        res.put("like",like);
        res.put("mastery",mastery);
        return ServerResponse.createBySuccess("获取成功", res);
    }

    @Override
    public ServerResponse<HashMap<String, Object>> getStudentInfo(int userNumber) {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         * @Description 通过学生姓名查询学生基本信息
         * @Author Leaf
         * @Date 2020/11/13 10:17 上午
         **/

        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNumberEqualTo(userNumber);
        List<User> userList = userMapper.selectByExample(example);
        if (userList.size()==0){
            return  ServerResponse.createByErrorMessage("查无此人");
        }
        User user = userList.get(0);
        //实验时长
        long eptTimeMin = Long.MAX_VALUE;
        long eptTimeMax = 0;
        long eptTimeAver;
        EptRecordExample eptRecordExample = new EptRecordExample();
        EptRecordExample.Criteria criteria1 = eptRecordExample.createCriteria();
        criteria1.andUseridEqualTo(user.getId());
        List<EptRecord> eptRecordList = eptrecordMapper.selectByExample(eptRecordExample);
        long eptTimeSum = 0;
        for (EptRecord e : eptRecordList) {
            eptTimeSum += e.getDurTime();
            if (e.getDurTime() > eptTimeMax) {
                eptTimeMax = e.getDurTime();
            }
            if (e.getDurTime() < eptTimeMin) {
                eptTimeMin = e.getDurTime();
            }
        }
        eptTimeAver = eptTimeSum / eptRecordList.size();

        //学习时长
        long learningTimeMin = Long.MAX_VALUE;
        long learningTimeMax = 0;
        long learningTimeAver;
        LearningRecordExample learningRecordExample = new LearningRecordExample();
        LearningRecordExample.Criteria criteria2 = learningRecordExample.createCriteria();
        criteria2.andUserIdEqualTo(user.getId());
        List<LearningRecord> learningRecordList = learningRecordMapper.selectByExample(learningRecordExample);
        long learningTimeSum = 0;
        for (LearningRecord l :
                learningRecordList) {
            learningTimeSum += l.getDuringTime();
            if (l.getDuringTime() > eptTimeMax) {
                learningTimeMax = l.getDuringTime();
            }
            if (l.getDuringTime() < eptTimeMin) {
                learningTimeMin = l.getDuringTime();
            }
        }
        learningTimeAver = learningTimeSum / learningRecordList.size();

        //在线时长
        long onlineTimeMin = Long.MAX_VALUE;
        long onlineTimeMax = 0;
        long onlineTimeAver;
        UserloginlogExample userloginlogExample = new UserloginlogExample();
        UserloginlogExample.Criteria criteria3 = userloginlogExample.createCriteria();
        criteria3.andUserIdEqualTo(user.getId());
        List<Userloginlog> userloginlogList = userloginlogMapper.selectByExample(userloginlogExample);
        long onlineTimeSum = 0;
        for (Userloginlog u :
                userloginlogList) {
            onlineTimeSum += u.getDuringTime();
            if (u.getDuringTime() > onlineTimeMax) {
                onlineTimeMax = u.getDuringTime();
            }
            if (u.getDuringTime() < onlineTimeMin) {
                onlineTimeMin = u.getDuringTime();
            }
        }
        onlineTimeAver = onlineTimeSum / userloginlogList.size();
        //实验进度
        double[] steps = new double[6];
        double[] maxSteps = new double[6];
        double[] stepPercent = new double[6];
        for (int i = 0; i < 6; i++) {
            maxSteps[i] = 0;
            stepPercent[i] = 0;
            ExperimentstepExample experimentstepExample = new ExperimentstepExample();
            ExperimentstepExample.Criteria criteria4 = experimentstepExample.createCriteria();
            criteria4.andEptIdEqualTo(i+1);
            List<Experimentstep> experimentstepList = experimentstepMapper.selectByExample(experimentstepExample);
            steps[i] = experimentstepList.size();
            UserprocessExample userprocessExample = new UserprocessExample();
            UserprocessExample.Criteria criteria5 = userprocessExample.createCriteria();
            criteria5.andEptIdEqualTo(i+1);
            criteria5.andUserIdEqualTo(user.getId());
            List<Userprocess> userprocessList = userprocessMapper.selectByExample(userprocessExample);
            for (Userprocess u:userprocessList) {
                if(u.getStageNum()>maxSteps[i]){
                    maxSteps[i] = u.getStageNum();
                }
            }
//            System.out.println(maxSteps[i]);
//            System.out.println(steps[i]);
            stepPercent[i] = maxSteps[i]/steps[i];
//            System.out.println(stepPercent[i]);
        }

        HashMap<String, Object> studentInfo = new HashMap<>();//基本信息
        studentInfo.put("userName", user.getUserName());
        studentInfo.put("userGender", user.getUserGender());
        studentInfo.put("userEmail", user.getUserEmail());
        studentInfo.put("schoolName", user.getSchoolName());
        studentInfo.put("className", user.getClassName());
        studentInfo.put("phoneNumber", user.getPhoneNumber());
        studentInfo.put("userAttitude", user.getUserAttitude());
        studentInfo.put("levelOfMastery", user.getLevelOfMastery());
        studentInfo.put("userEmail", user.getUserEmail());

        HashMap<String, Object> studentScore = new HashMap<>();
//        EptRecordExample eptRecordExample = new EptRecordExample();
//        EptRecordExample.Criteria criteria1 =eptRecordExample.createCriteria();
//        criteria1.andUseridEqualTo(user.getId());

        HashMap<String, Object> eptTime = new HashMap<>();//实验时长
        EptRecordExample eptRecordExample1 = new EptRecordExample();
        EptRecordExample.Criteria criteria4 = eptRecordExample1.createCriteria();
        criteria4.andUseridEqualTo(user.getId());
        List<EptRecord> eptRecordList1 = eptrecordMapper.selectByExample(eptRecordExample1);
        long[] temp = new long[6];
        for (int i = 0; i < 6; i++) {
            for (EptRecord e : eptRecordList1) {
                if (e.getEptId() == i) {
                    temp[i] += e.getEndTime().getTime() - e.getStartTime().getTime();
                }
            }
            eptTime.put("ept" + i, temp[i]);
        }

//
//        HashMap<String, Object> pointTime = new HashMap<>();//知识点时长 存在问题 现在就一个知识点
//        PointrecordExample pointrecordExample = new PointrecordExample();
//        PointrecordExample.Criteria criteria5 = pointrecordExample.createCriteria();
//        criteria5.andUserIdEqualTo(user.getId());
//        List<Pointrecord> pointrecordList = pointrecordMapper.selectByExample(pointrecordExample);
//        long[] temp1 = new long[6];
//        for (int i = 0; i < 6; i++) {
//            for (Pointrecord p : pointrecordList) {
//                if (p.getPointId() == i) {
//                    temp[i] += p.getCompleteTime().getTime();
//                }
//            }
//            pointTime.put("point" + i, temp1[i]);
//        }
        HashMap<String, Object> res = new HashMap<>();

        HashMap<String, Object> radarData = new HashMap<>();
        String[] latitude = {"平均","最低","最高"};
        radarData.put("latitude",latitude);
        ArrayList<ArrayList> values = new ArrayList<>();
        ArrayList ept = new ArrayList();
        ept.add(eptTimeAver);
        ept.add(eptTimeMin);
        ept.add(eptTimeMax);
        ArrayList online = new ArrayList();
        online.add(onlineTimeAver);
        online.add(onlineTimeMin);
        online.add(onlineTimeMax);
        ArrayList learn = new ArrayList();
        learn.add(learningTimeAver);
        learn.add(learningTimeMin);
        learn.add(learningTimeMax);
        values.add(ept);
        values.add(online);
        values.add(learn);
        radarData.put("values",values);
        res.put("studentInfo", studentInfo);
        res.put("eptTime", eptTime);
//        res.put("pointTime", );
        res.put("stepPercent",stepPercent);
        res.put("radarData",radarData);
        res.put("eptTimeSum",eptTimeSum);
        res.put("learningTimeSum",learningTimeSum);
        res.put("onlineTimeSum",onlineTimeSum);
        return ServerResponse.createBySuccess("获取成功", res);

    }

    @Override
    public ServerResponse<HashMap<String, Object>> getClassInfo(int classNumber) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andClassNameEqualTo(classNumber);
        criteria.andUserTypeEqualTo(0);
        double male = 0, female = 0, maleMastery0 = 0, maleMastery1 = 0, maleMastery2 = 0, femaleMastery0 = 0,
                femaleMastery1 = 0, femaleMastery2 = 0, maleAttitude0 = 0, maleAttitude1 = 0,
                maleAttitude2 = 0, femaleAttitude0 = 0, femaleAttitude1 = 0, femaleAttitude2 = 0, averAttitude0 = 0,
                averAttitude1 = 0, averAttitude2 = 0, averMastery0 = 0, averMastery1 = 0, averMastery2 = 0;
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size()==0){
            ServerResponse.createByErrorMessage("没有查询结果");
        }
        else{
            for (User u :userList) {
                if (u.getUserGender() == Boolean.TRUE) {
                    male += 1;
                    if (u.getUserAttitude() == 0) {
                        maleAttitude0 += 1;
                    }
                    if (u.getUserAttitude() == 1) {
                        maleAttitude1 += 1;
                    }
                    if (u.getUserAttitude() == 2) {
                        maleAttitude2 += 1;
                    }
                    if (u.getLevelOfMastery() == 0) {
                        maleMastery0 += 1;
                    }
                    if (u.getLevelOfMastery() == 1) {
                        maleMastery1 += 1;
                    }
                    if (u.getLevelOfMastery() == 2) {
                        maleMastery2 += 1;
                    }
                } else if (u.getUserGender() == Boolean.FALSE) {
                    female += 1;
                    if (u.getUserAttitude() == 0) {
                        femaleAttitude0 += 1;
                    }
                    if (u.getUserAttitude() == 1) {
                        femaleAttitude1 += 1;
                    }
                    if (u.getUserAttitude() == 2) {
                        femaleAttitude2 += 1;
                    }
                    if (u.getLevelOfMastery() == 0) {
                        femaleMastery0 += 1;
                    }
                    if (u.getLevelOfMastery() == 1) {
                        femaleMastery1 += 1;
                    }
                    if (u.getLevelOfMastery() == 2) {
                        femaleMastery2 += 1;
                    }
                }
            }
            double malePercent = male / userList.size();
            double femalePercent = female / userList.size();
            averAttitude0 = maleAttitude0 * malePercent + femaleAttitude0 * femalePercent;
            averAttitude1 = maleAttitude1 * malePercent + femaleAttitude1 * femalePercent;
            averAttitude2 = maleAttitude2 * malePercent + femaleAttitude2 * femalePercent;
            averMastery0 = maleMastery0 * malePercent + femaleMastery0 * femalePercent;
            averMastery1 = maleMastery1 * malePercent + femaleMastery1 * femalePercent;
            averMastery2 = maleMastery2 * malePercent + femaleMastery2 * femalePercent;
            HashMap<String, Object> AttitudeMap = new HashMap<>();
            AttitudeMap.put("女生喜欢", femaleAttitude0);
            AttitudeMap.put("女生一般", femaleAttitude1);
            AttitudeMap.put("女生抵触", femaleAttitude2);
            AttitudeMap.put("男生喜欢", maleAttitude0);
            AttitudeMap.put("男生一般", maleAttitude1);
            AttitudeMap.put("男生抵触", maleAttitude2);
            AttitudeMap.put("平均喜欢", averAttitude0);
            AttitudeMap.put("平均一般", averAttitude1);
            AttitudeMap.put("平均抵触", averAttitude2);

            HashMap<String, Object> MasteryMap = new HashMap<String, Object>();
            MasteryMap.put("女生从未学过", femaleMastery0);
            MasteryMap.put("女生学习1-3年", femaleMastery1);
            MasteryMap.put("女生学习3年以上", femaleMastery2);
            MasteryMap.put("男生从未学过", maleMastery0);
            MasteryMap.put("男生学习1-3年", maleMastery1);
            MasteryMap.put("男生学习3年以上", maleMastery2);
            MasteryMap.put("平均从未学过", averMastery0);
            MasteryMap.put("平均学习1-3年", averMastery1);
            MasteryMap.put("平均学习3年以上", averMastery2);
            //实验时长
            long eptTimeMin = Long.MAX_VALUE;
            long eptTimeMax = 0;
            long eptTimeAver;
            int eptCount = 0;
            long eptTimeSum = 0;
            for (User u : userList) {
                EptRecordExample eptRecordExample = new EptRecordExample();
                EptRecordExample.Criteria criteria1 = eptRecordExample.createCriteria();
                criteria1.andUseridEqualTo(u.getId());
                List<EptRecord> eptRecordList = eptrecordMapper.selectByExample(eptRecordExample);
                eptCount += eptRecordList.size();

                for (EptRecord e : eptRecordList) {
                    eptTimeSum += e.getDurTime();
                    if (e.getDurTime() > eptTimeMax) {
                        eptTimeMax = e.getDurTime();
                    }
                    if (e.getDurTime() < eptTimeMin) {
                        eptTimeMin = e.getDurTime();
                    }
                }
            }
            eptTimeAver = eptTimeSum / eptCount;

            //学习时长
            long learningTimeMin = Long.MAX_VALUE;
            long learningTimeMax = 0;
            long learningTimeAver;
            long learningTimeSum = 0;
            int learningCount = 0;
            for (User u : userList) {
                LearningRecordExample learningRecordExample = new LearningRecordExample();
                LearningRecordExample.Criteria criteria2 = learningRecordExample.createCriteria();
                criteria2.andUserIdEqualTo(u.getId());
                List<LearningRecord> learningRecordList = learningRecordMapper.selectByExample(learningRecordExample);
                learningCount += learningRecordList.size();
                for (LearningRecord l :
                        learningRecordList) {
                    learningTimeSum += l.getDuringTime();
                    if (l.getDuringTime() > eptTimeMax) {
                        learningTimeMax = l.getDuringTime();
                    }
                    if (l.getDuringTime() < eptTimeMin) {
                        learningTimeMin = l.getDuringTime();
                    }
                }
            }
            learningTimeAver = learningTimeSum / learningCount;

            //在线时长
            long onlineTimeMin = Long.MAX_VALUE;
            long onlineTimeMax = 0;
            long onlineTimeAver;
            long onlineTimeSum = 0;
            int onlineCount = 0;
            for (User uu : userList) {
                UserloginlogExample userloginlogExample = new UserloginlogExample();
                UserloginlogExample.Criteria criteria3 = userloginlogExample.createCriteria();
                criteria3.andUserIdEqualTo(uu.getId());
                List<Userloginlog> userloginlogList = userloginlogMapper.selectByExample(userloginlogExample);
                onlineCount += userloginlogList.size();
                for (Userloginlog u :
                        userloginlogList) {
                    onlineTimeSum += u.getDuringTime();
                    if (u.getDuringTime() > onlineTimeMax) {
                        onlineTimeMax = u.getDuringTime();
                    }
                    if (u.getDuringTime() < onlineTimeMin) {
                        onlineTimeMin = u.getDuringTime();
                    }
                }
            }
            onlineTimeAver = onlineTimeSum / onlineCount;
            HashMap<String, Object> timeInfo = new HashMap<>();
            timeInfo.put("eptTimeMin", eptTimeMin);
            timeInfo.put("eptTimeMax", eptTimeMax);
            timeInfo.put("eptTimeAver", eptTimeAver);
            timeInfo.put("learningTimeMin", learningTimeMin);
            timeInfo.put("learningTimeMax", learningTimeMax);
            timeInfo.put("learningTimeAver", learningTimeAver);
            timeInfo.put("onlineTimeMin", onlineTimeMin);
            timeInfo.put("onlineTimeMax", onlineTimeMax);
            timeInfo.put("onlineTimeAver", onlineTimeAver);
            //实验进度


            HashMap<String, Object> res = new HashMap<>();
            res.put("attitude", AttitudeMap);
            res.put("Mastery", MasteryMap);
            res.put("timeInfo", timeInfo);
            res.put("male", male);
            res.put("female", female);
            res.put("malePercent", malePercent);
            res.put("femalePercent", femalePercent);
            return ServerResponse.createBySuccess("获取成功", res);
        }
        return ServerResponse.createBySuccessMessage("获取成功");
    }

    @Override
    public ServerResponse<HashMap<String, Object>> getSchoolInfo(String schoolName) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andSchoolNameEqualTo(schoolName);
        criteria.andUserTypeEqualTo(0);
        double male = 0, female = 0, maleMastery0 = 0, maleMastery1 = 0, maleMastery2 = 0, femaleMastery0 = 0,
                femaleMastery1 = 0, femaleMastery2 = 0, maleAttitude0 = 0, maleAttitude1 = 0,
                maleAttitude2 = 0, femaleAttitude0 = 0, femaleAttitude1 = 0, femaleAttitude2 = 0, averAttitude0 = 0,
                averAttitude1 = 0, averAttitude2 = 0, averMastery0 = 0, averMastery1 = 0, averMastery2 = 0;
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size()==0){
            return ServerResponse.createByErrorMessage("没有此学校");
        }
        for (User u :
                userList) {
            if (u.getUserGender() == Boolean.TRUE) {
                male += 1;
                if (u.getUserAttitude() == 0) {
                    maleAttitude0 += 1;
                }
                if (u.getUserAttitude() == 1) {
                    maleAttitude1 += 1;
                }
                if (u.getUserAttitude() == 2) {
                    maleAttitude2 += 1;
                }
                if (u.getLevelOfMastery() == 0) {
                    maleMastery0 += 1;
                }
                if (u.getLevelOfMastery() == 1) {
                    maleMastery1 += 1;
                }
                if (u.getLevelOfMastery() == 2) {
                    maleMastery2 += 1;
                }
            } else if (u.getUserGender() == Boolean.FALSE) {
                female += 1;
                if (u.getUserAttitude() == 0) {
                    femaleAttitude0 += 1;
                }
                if (u.getUserAttitude() == 1) {
                    femaleAttitude1 += 1;
                }
                if (u.getUserAttitude() == 2) {
                    femaleAttitude2 += 1;
                }
                if (u.getLevelOfMastery() == 0) {
                    femaleMastery0 += 1;
                }
                if (u.getLevelOfMastery() == 1) {
                    femaleMastery1 += 1;
                }
                if (u.getLevelOfMastery() == 2) {
                    femaleMastery2 += 1;
                }
            }
        }
        double malePercent = male / userList.size();
        double femalePercent = female / userList.size();
        averAttitude0 = maleAttitude0 * malePercent + femaleAttitude0 * femalePercent;
        averAttitude1 = maleAttitude1 * malePercent + femaleAttitude1 * femalePercent;
        averAttitude2 = maleAttitude2 * malePercent + femaleAttitude2 * femalePercent;
        averMastery0 = maleMastery0 * malePercent + femaleMastery0 * femalePercent;
        averMastery1 = maleMastery1 * malePercent + femaleMastery1 * femalePercent;
        averMastery2 = maleMastery2 * malePercent + femaleMastery2 * femalePercent;
        HashMap<String, Object> AttitudeMap = new HashMap<>();
        AttitudeMap.put("女生喜欢", femaleAttitude0);
        AttitudeMap.put("女生一般", femaleAttitude1);
        AttitudeMap.put("女生抵触", femaleAttitude2);
        AttitudeMap.put("男生喜欢", maleAttitude0);
        AttitudeMap.put("男生一般", maleAttitude1);
        AttitudeMap.put("男生抵触", maleAttitude2);
        AttitudeMap.put("平均喜欢", averAttitude0);
        AttitudeMap.put("平均一般", averAttitude1);
        AttitudeMap.put("平均抵触", averAttitude2);

        HashMap<String, Object> MasteryMap = new HashMap<String, Object>();
        MasteryMap.put("女生从未学过", femaleMastery0);
        MasteryMap.put("女生学习1-3年", femaleMastery1);
        MasteryMap.put("女生学习3年以上", femaleMastery2);
        MasteryMap.put("男生从未学过", maleMastery0);
        MasteryMap.put("男生学习1-3年", maleMastery1);
        MasteryMap.put("男生学习3年以上", maleMastery2);
        MasteryMap.put("平均从未学过", averMastery0);
        MasteryMap.put("平均学习1-3年", averMastery1);
        MasteryMap.put("平均学习3年以上", averMastery2);

        //实验时长
        long eptTimeMin = Long.MAX_VALUE;
        long eptTimeMax = 0;
        long eptTimeAver;
        int eptCount = 0;
        long eptTimeSum = 0;
        for (User u : userList) {
            EptRecordExample eptRecordExample = new EptRecordExample();
            EptRecordExample.Criteria criteria1 = eptRecordExample.createCriteria();
            criteria1.andUseridEqualTo(u.getId());
            List<EptRecord> eptRecordList = eptrecordMapper.selectByExample(eptRecordExample);
            eptCount += eptRecordList.size();

            for (EptRecord e : eptRecordList) {
                eptTimeSum += e.getDurTime();
                if (e.getDurTime() > eptTimeMax) {
                    eptTimeMax = e.getDurTime();
                }
                if (e.getDurTime() < eptTimeMin) {
                    eptTimeMin = e.getDurTime();
                }
            }
        }
        eptTimeAver = eptTimeSum / eptCount;
        //学习时长
        long learningTimeMin = Long.MAX_VALUE;
        long learningTimeMax = 0;
        long learningTimeAver = 0;
        long learningTimeSum = 0;
        int learningCount = 0;
        for (User u : userList) {
            LearningRecordExample learningRecordExample = new LearningRecordExample();
            LearningRecordExample.Criteria criteria2 = learningRecordExample.createCriteria();
            criteria2.andUserIdEqualTo(u.getId());
            List<LearningRecord> learningRecordList = learningRecordMapper.selectByExample(learningRecordExample);
            learningCount += learningRecordList.size();
            for (LearningRecord l :
                    learningRecordList) {
                learningTimeSum += l.getDuringTime();



                if (l.getDuringTime() > eptTimeMax) {
                    learningTimeMax = l.getDuringTime();
                }
                if (l.getDuringTime() < eptTimeMin) {
                    learningTimeMin = l.getDuringTime();
                }
            }
        }
        learningTimeAver = learningTimeSum / learningCount;

        //在线时长
        long onlineTimeMin = Long.MAX_VALUE;
        long onlineTimeMax = 0;
        long onlineTimeAver = 0;
        long onlineTimeSum = 0;
        int onlineCount = 0;
        for (User uu : userList) {
            UserloginlogExample userloginlogExample = new UserloginlogExample();
            UserloginlogExample.Criteria criteria3 = userloginlogExample.createCriteria();
            criteria3.andUserIdEqualTo(uu.getId());
            List<Userloginlog> userloginlogList = userloginlogMapper.selectByExample(userloginlogExample);
            onlineCount += userloginlogList.size();
            for (Userloginlog u :
                    userloginlogList) {
                onlineTimeSum += u.getDuringTime();
                if (u.getDuringTime() > onlineTimeMax) {
                    onlineTimeMax = u.getDuringTime();
                }
                if (u.getDuringTime() < onlineTimeMin) {
                    onlineTimeMin = u.getDuringTime();
                }
            }
        }
        onlineTimeAver = onlineTimeSum / onlineCount;
        System.out.println(onlineCount);
        HashMap<String, Object> timeInfo = new HashMap<>();
        timeInfo.put("eptTimeMin", eptTimeMin);
        timeInfo.put("eptTimeMax", eptTimeMax);
        timeInfo.put("eptTimeAver", eptTimeAver);
        timeInfo.put("learningTimeMin", learningTimeMin);
        timeInfo.put("learningTimeMax", learningTimeMax);
        timeInfo.put("learningTimeAver", learningTimeAver);
        timeInfo.put("onlineTimeMin", onlineTimeMin);
        timeInfo.put("onlineTimeMax", onlineTimeMax);
        timeInfo.put("onlineTimeAver", onlineTimeAver);
        
        HashMap<String, Object> res = new HashMap<>();
        res.put("attitude", AttitudeMap);
        res.put("Mastery", MasteryMap);
        res.put("male", male);
        res.put("female", female);
        res.put("malePercent", malePercent);
        res.put("femalePercent", femalePercent);
        res.put("timeInfo",timeInfo);
        return ServerResponse.createBySuccess("获取成功", res);
    }

    @Override
    public ServerResponse<HashMap<String, Object>> getEptCondition() {
        long[] eptParticipantsTime = new long[6];
        int[] eptParticipantsNum = new int[6];
        for (int i = 0; i < 6; i++) {
            EptRecordExample eptRecordExample = new EptRecordExample();
            EptRecordExample.Criteria criteria = eptRecordExample.createCriteria();
            criteria.andEptIdEqualTo(i+1);
            ArrayList arrayList = new ArrayList();
            eptParticipantsTime[i] = 0;
            List<EptRecord> eptRecordList = eptrecordMapper.selectByExample(eptRecordExample);
            for (EptRecord e:
                 eptRecordList) {
                eptParticipantsTime[i] += e.getDurTime();
                if(arrayList.contains(e.getUserid())){
                    continue;
                }else{
                    arrayList.add(e.getUserid());
                }
            }
            eptParticipantsNum[i] = arrayList.size();

        }
        HashMap<String,Object> res = new HashMap<>();
        res.put("eptParticipantsTime",eptParticipantsTime);
        res.put("eptParticipantsNum",eptParticipantsNum);
        return ServerResponse.createBySuccess("获取成功", res);
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
        EptRecord eptRecord = eptrecordMapper.selectByPrimaryKey(id);
        User user = userMapper.selectByPrimaryKey(userId);
        int className = user.getClassName();
        int eptId = eptRecord.getEptId();
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andClassNameEqualTo(className);
        List<User> userList = userMapper.selectByExample(userExample);

        int classSum = userList.size();
        long time = eptRecord.getDurTime();
        Date startTime = eptRecord.getStartTime();
        Date endTime = eptRecord.getEndTime();
        int[] score = new int[classSum];
        int i = 0;
        for (User u:
             userList) {
            score[i] = 0;
            UserprocessExample userprocessExample = new UserprocessExample();
            UserprocessExample.Criteria criteria1 = userprocessExample.createCriteria();
            criteria1.andUserIdEqualTo(u.getId());
            List<Userprocess> userProcessList = userprocessMapper.selectByExample(userprocessExample);
            for (Userprocess p: userProcessList ) {
                if(p.getStageNum() > score[i]){
                    score[i] = p.getStageNum();
                }
            }
        }
//        int rank;
//        for ( int j = 0; j < classSum;j++){
//            if(score[j] == eptRecord)
//        }
        HashMap<String,Object> res =new HashMap<>();
        res.put("Time",time);
        res.put("startTime", startTime);
        res.put("endTime",endTime);
//        return ServerResponse.createBySuccess("获取成功",res);
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
        EptRecord eptRecord = eptRecordList.get(0);
        eptRecord.setDifficultyLevel(difficultLevel);
        eptRecord.setExerciseLevel(exerciseLevel);
        eptRecord.setMasteryLevel(masteryLevel);
        return null;
    }

    @Override
    public ServerResponse<ArrayList<Object>> getScore(Integer userNumber) {
       /**
        * @Author jiaxin
        * @Description 获取某用户的各实验分数//TODO
        * @Date 10:35 上午 2020/11/16
        * @Param [userId]
        * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
        **/

       //定位到哪位同学
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria1 = userExample.createCriteria();
        criteria1.andUserNumberEqualTo(userNumber);
        List<User> userList = userMapper.selectByExample(userExample);
        User user;

        if(userList.size()!=0)
        {
            user = userList.get(0);
        }
        else
        {
            return ServerResponse.createByErrorMessage("学号错误，未找到该用户");
        }
       //实验ID列表
        ExperimentExample eptExample = new ExperimentExample();
        eptExample.setDistinct(false);
        List<Experiment> epts = experimentMapper.selectByExample(eptExample);
        ArrayList<Object> result = new ArrayList<>();
        for(Experiment ept : epts) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("eptId", ept.getId());
            hashMap.put("eptName", ept.getEptName());
            UserprocessExample userprocessExample = new UserprocessExample();
            UserprocessExample.Criteria criteria = userprocessExample.createCriteria();
            criteria.andUserIdEqualTo(user.getId());
            criteria.andEptIdEqualTo(ept.getId());
            List<Userprocess> userprocessList = userprocessMapper.selectByExample(userprocessExample);
            double avg_score = 0;
            if(userprocessList.size()!=0)
            {
                avg_score = userprocessList.stream().mapToDouble(Userprocess::getScore).average().getAsDouble();
            }
            //保留两位小数
            DecimalFormat df   = new DecimalFormat("######0.00");
            hashMap.put("eptScore", df.format(avg_score));
            result.add(hashMap);
        }
        return ServerResponse.createBySuccess("获取成功",result);




    }

    @Override
    public ServerResponse<HashMap<String, Object>> getReport(int userId) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(userId);
        List<User> userList = userMapper.selectByExample(example);
        if(userList.size()==0){
            return ServerResponse.createByErrorMessage("查无此人");
        }
        User user = userList.get(0);
        //实验时长
        long eptTimeMin = Long.MAX_VALUE;
        long eptTimeMax = 0;
        long eptTimeAver;
        EptRecordExample eptRecordExample = new EptRecordExample();
        EptRecordExample.Criteria criteria1 = eptRecordExample.createCriteria();
        criteria1.andUseridEqualTo(user.getId());
        List<EptRecord> eptRecordList = eptrecordMapper.selectByExample(eptRecordExample);
        long eptTimeSum = 0;
        for (EptRecord e : eptRecordList) {
            eptTimeSum += e.getDurTime();
            if (e.getDurTime() > eptTimeMax) {
                eptTimeMax = e.getDurTime();
            }
            if (e.getDurTime() < eptTimeMin) {
                eptTimeMin = e.getDurTime();
            }
        }
        eptTimeAver = eptTimeSum / eptRecordList.size();

        //学习时长
        long learningTimeMin = Long.MAX_VALUE;
        long learningTimeMax = 0;
        long learningTimeAver;
        LearningRecordExample learningRecordExample = new LearningRecordExample();
        LearningRecordExample.Criteria criteria2 = learningRecordExample.createCriteria();
        criteria2.andUserIdEqualTo(user.getId());
        List<LearningRecord> learningRecordList = learningRecordMapper.selectByExample(learningRecordExample);
        long learningTimeSum = 0;
        for (LearningRecord l :
                learningRecordList) {
            learningTimeSum += l.getDuringTime();
            if (l.getDuringTime() > eptTimeMax) {
                learningTimeMax = l.getDuringTime();
            }
            if (l.getDuringTime() < eptTimeMin) {
                learningTimeMin = l.getDuringTime();
            }
        }
        learningTimeAver = learningTimeSum / learningRecordList.size();

        //在线时长
        long onlineTimeMin = Long.MAX_VALUE;
        long onlineTimeMax = 0;
        long onlineTimeAver;
        UserloginlogExample userloginlogExample = new UserloginlogExample();
        UserloginlogExample.Criteria criteria3 = userloginlogExample.createCriteria();
        criteria3.andUserIdEqualTo(user.getId());
        List<Userloginlog> userloginlogList = userloginlogMapper.selectByExample(userloginlogExample);
        long onlineTimeSum = 0;
        for (Userloginlog u :
                userloginlogList) {
            onlineTimeSum += u.getDuringTime();
            if (u.getDuringTime() > onlineTimeMax) {
                onlineTimeMax = u.getDuringTime();
            }
            if (u.getDuringTime() < onlineTimeMin) {
                onlineTimeMin = u.getDuringTime();
            }
        }
        onlineTimeAver = onlineTimeSum / userloginlogList.size();
        //实验进度
        double[] steps = new double[6];
        double[] maxSteps = new double[6];
        double[] stepPercent = new double[6];
        for (int i = 0; i < 6; i++) {
            maxSteps[i] = 0;
            ExperimentstepExample experimentstepExample = new ExperimentstepExample();
            ExperimentstepExample.Criteria criteria4 = experimentstepExample.createCriteria();
            criteria4.andEptIdEqualTo(i+1);
            List<Experimentstep> experimentstepList = experimentstepMapper.selectByExample(experimentstepExample);
            steps[i] = experimentstepList.size();
            UserprocessExample userprocessExample = new UserprocessExample();
            UserprocessExample.Criteria criteria5 = userprocessExample.createCriteria();
            criteria5.andEptIdEqualTo(i+1);
            criteria5.andUserIdEqualTo(user.getId());
            List<Userprocess> userprocessList = userprocessMapper.selectByExample(userprocessExample);
            for (Userprocess u:userprocessList) {
                if(u.getStageNum()>maxSteps[i]){
                    maxSteps[i] = u.getStageNum();
                }
            }
            stepPercent[i] = maxSteps[i]/steps[i];
        }
        HashMap<String, Object> res = new HashMap<>();
        res.put("eptTimeMin", eptTimeMin);
        res.put("eptTimeMax", eptTimeMax);
        res.put("eptTimeAver", eptTimeAver);
        res.put("learningTimeMin", learningTimeMin);
        res.put("learningTimeMax", learningTimeMax);
        res.put("learningTimeAver", learningTimeAver);
        res.put("onlineTimeMin", onlineTimeMin);
        res.put("onlineTimeMax", onlineTimeMax);
        res.put("onlineTimeAver", onlineTimeAver);
        res.put("stepPercent", stepPercent);
        return ServerResponse.createBySuccess("获取成功", res);
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
    public ServerResponse<int[]> getEptProcess(int eptId, int userId) {
        UserprocessExample userprocessExample = new UserprocessExample();
        UserprocessExample.Criteria criteria = userprocessExample.createCriteria();
        criteria.andEptIdEqualTo(eptId);
        criteria.andUserIdEqualTo(userId);
        List<Userprocess> userprocessList = userprocessMapper.selectByExample(userprocessExample);

        int[] stageList = new int[userprocessList.size()];
        int count = 0;
        for (Userprocess userprocess : userprocessList) {
            stageList[count] = userprocess.getStageNum();
            count++;
        }

        return ServerResponse.createBySuccess("获取成功", stageList);


    }

    //用户过了某一关
    @Override
    @Transactional(propagation = Propagation.REQUIRED)//增加事务回滚
    public ServerResponse<Boolean> postUserStageNum(int userId, int eptId, int stageNum,int score) {
        /**
         * @Author jiaxin
         * @Description 用户过了某一关//TODO
         * @Date 3:34 下午 2020/11/12
         * @Param [userId, eptId, stageNum]
         * @return hci.artedu.common.ServerResponse<int [ ]>
         **/
        //先查有没有此关的记录

        UserprocessExample userprocessExample = new UserprocessExample();
        UserprocessExample.Criteria criteria = userprocessExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andEptIdEqualTo(eptId);
        criteria.andStageNumEqualTo(stageNum);
        List<Userprocess> userprocessList = userprocessMapper.selectByExample(userprocessExample);
        if (userprocessList.size() != 0) {
            return ServerResponse.createByErrorMessage("已存在该记录");
        } else {
            Userprocess userprocess = new Userprocess();
            userprocess.setStageNum(stageNum);
            userprocess.setEptId(eptId);
            userprocess.setUserId(userId);
            userprocess.setScore(score);
            Timestamp nowTime = DateUtils.nowDateTime();
            userprocess.setCompletetime(nowTime);
            userprocessMapper.insert(userprocess);
            return ServerResponse.createBySuccess("记录成功", Boolean.TRUE);
        }
    }

    //TODO 这个界面主要是下面这两个评分，上面是教师评分，教师可以调节，下面这个学习过程得分是网站直接给出的，
    // 逻辑是学习过程的100分=实验平均得分（未参加的实验不计入成绩）*60%+实验时长（大于1h得满分，0.5h-1h得60分，
    // 0.5小时以下30分）*20%+学习时长（大于1h得满分，0.5h-1h得60分，0.5小时以下30分）*20%，
    // 原来的界面可能容易被误解成两项都是教师评分，所以可能还需要再改一下

    //通关率

    //实验练习结果 rank

    //实验数据 参与人数 参与时长

    //返回值 错误信息

    //成绩


}
