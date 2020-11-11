package hci.artedu.controller;

import hci.artedu.common.ServerResponse;
import hci.artedu.pojo.EptRecord;
import hci.artedu.service.EptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * @ClassName EptController
 * @Description TODO
 * @Author jiaxin
 * @Date 2020/10/26 7:33 下午
 * @Version 1.0
 **/
@RestController
public class EptController {

    @Autowired
    private EptService eptService;

    @GetMapping("/getEptList")
    public ServerResponse<ArrayList> getEptList() {
        /**
         * @Author jiaxin
         * @Description 接口-获取实验列表//TODO
         * @Date 11:39 上午 2020/10/27
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.ArrayList>
         **/

        ServerResponse<ArrayList> response = eptService.getEptList();
        return response;
    }

    @GetMapping("/getBigEptInfo")
    public ServerResponse<HashMap<String, Object>> getBigEptInfo() {
        /**
         * @Author jiaxin
         * @Description 获取大实验的基本信息//TODO
         * @Date 5:30 下午 2020/10/28
         * @Param [eptId]
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/

        ServerResponse<HashMap<String, Object>> response = eptService.getBigEptInfo();
        return response;
    }

    @GetMapping("/getEptBasicInfo")
    public ServerResponse<HashMap<String, Object>> getEptBasicInfo(int eptId) {
        /**
         * @Author jiaxin
         * @Description 获取某小实验基本信息//TODO
         * @Date 11:17 上午 2020/10/29
         * @Param [eptId]
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getEptBasicInfo(eptId);
        return response;

    }

    @GetMapping("/getBigEptPurpose")
    public ServerResponse<HashMap<String, Object>> getEptPurpose() {
        /**
         * @Author jiaxin
         * @Description 接口-获取大实验目的//TODO
         * @Date 11:40 上午 2020/10/27
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/

        ServerResponse<HashMap<String, Object>> response = eptService.getBigEptPurpose();
        return response;

    }

    @GetMapping("/getBigEptRequirement")
    public ServerResponse<HashMap<String, Object>> getEptRequirement() {
        /**
         * @Author myz
         * @Description 接口-获取大实验要求//TODO
         * @Date 10:17 上午 2020/10/30
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getBigEptRequirement();
        return response;
    }

    @GetMapping("/getBigEptPrinciple")
    public ServerResponse<HashMap<String, Object>> getEptPrinciple() {
        /**
         * @Author myz
         * @Description 接口-获取大实验原理//TODO
         * @Date 10:17 上午 2020/10/30
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getBigEptPrinciple();
        return response;
    }

    @GetMapping("/getBigEptMethod")
    public ServerResponse<HashMap<String, Object>> getEptMethod() {
        /**
         * @Author myz
         * @Description 接口-获取大实验方法//TODO
         * @Date 10:17 上午 2020/10/30
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getBigEptMethod();
        return response;
    }

    @GetMapping("/getBigEptStep")
    public ServerResponse<HashMap<String, Object>> getEptStep() {
        /**
         * @Author myz
         * @Description 接口-获取大实验步骤//TODO
         * @Date 10:17 上午 2020/10/30
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getBigEptStep();
        return response;
    }

    @GetMapping("/getBigEptDevice")
    public ServerResponse<HashMap<String, Object>> getEptDevice() {
        /**
         * @Author myz
         * @Description 接口-获取大实验仪器设备//TODO
         * @Date 10:17 上午 2020/10/30
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getBigEptDevice();
        return response;
    }

    @GetMapping("/getEptPoint")
    public ServerResponse<ArrayList> getEptPoint(int eptId)
    {
        /**
         * @Author jiaxin
         * @Description 获取某实验下知识点信息//TODO
         * @Date 8:07 下午 2020/11/4
         * @Param [eptId]
         * @return hci.artedu.common.ServerResponse<java.util.ArrayList>
         **/
        ServerResponse<ArrayList> response = eptService.getEptPoint(eptId);
        return response;

    }


    @PostMapping("/endPostExperiment")
    public ServerResponse endPostExperiment(EptRecord eptRecord,int[] process)
    {
        /**
         * @Author jiaxin
         * @Description 结束实验提交//TODO
         * @Date 10:59 上午 2020/11/5
         * @Param [eptRecord]
         * @return hci.artedu.common.ServerResponse
         **/


        ServerResponse response = eptService.endPostExperiment(eptRecord);
        return response;

    }

    @GetMapping("/getUserExperimentProcess")
    public ServerResponse<ArrayList> getUserExperimentProcess(int userId)
    {
        /**
         * @Author jiaxin
         * @Description 获取用户实验进度//TODO
         * @Date 11:00 上午 2020/11/5
         * @Param [userId]
         * @return hci.artedu.common.ServerResponse<java.util.ArrayList>
         **/
        ServerResponse response = eptService.getUserExperimentProcess(userId);
        return response;

    }

    @PostMapping("/beginExperiment")
    public ServerResponse<Boolean> beginExperiment(int userId,int expId)
    {
        /**
         * @Author jiaxin
         * @Description 开始实验//TODO
         * @Date 11:01 上午 2020/11/5
         * @Param [userid, expId]
         * @return hci.artedu.common.ServerResponse<java.lang.Boolean>
         **/
        ServerResponse<Boolean> response = eptService.beginExperiment(userId,expId);
        return response;

    }

    @GetMapping("/getUserProcess")
    public ServerResponse<int[]> getUserProcess(int userId,int expId)
    {
        /**
         * @Author jiaxin
         * @Description 获取某用户实验进度//TODO
         * @Date 4:53 下午 2020/11/11
         * @Param [userId, expId]
         * @return hci.artedu.common.ServerResponse<int[]>
         **/

        ServerResponse<int[]> response = eptService.getEptProcess(expId,userId);
        return response;

    }

    @GetMapping("/getAllTimeLength")
    public ServerResponse<HashMap<String, Object>> getAllTimeLength() {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 获取学生总体时长统计
         * @Author Leaf
         * @Date 2020/11/11 4:40 下午
         **/

        ServerResponse<HashMap<String, Object>> response = eptService.getAllTimeLength();
        return response;

    }

    @GetMapping("/getStudentMasterAttitude")
    public ServerResponse<HashMap<String, Object>> getStudentMasterAttitude()
    {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 用于获取所有学生的喜好度和掌握程度
         * @Author Leaf
         * @Date 2020/11/11 4:44 下午
         **/

        ServerResponse<HashMap<String, Object>> response = eptService.getStudentMasterAttitude();
        return response;

    }

    @PostMapping("/getStudentInfo")
    public ServerResponse<HashMap<String, Object>> getStudentInfo(String studentName)
    {
        /**
         * TODO 用于获取所有学生的喜好度和掌握程度
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 通过学生姓名查询学生基本信息
         * @Author Leaf
         * @Date 2020/11/11 4:47 下午
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getStudentInfo(studentName);
        return response;

    }

    @PostMapping("/getClassInfo")
    public ServerResponse<HashMap<String, Object>> getClassInfo(int classNumber)
    {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 获取某班级的整体统计信息
         * @Author Leaf
         * @Date 2020/11/11 4:47 下午
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getClassInfo(classNumber);
        return response;

    }

    @PostMapping("/getSchoolInfo")
    public ServerResponse<HashMap<String, Object>> getSchoolInfo(String SchoolName)
    {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 获取某院校的整体统计信息
         * @Author Leaf
         * @Date 2020/11/11 4:50 下午
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getSchoolInfo(SchoolName);
        return response;

    }

    @GetMapping("/getEptCondition")
    public ServerResponse<HashMap<String, Object>> getEptCondition()
    {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 获取整体实验情况
         * @Author Leaf
         * @Date 2020/11/11 4:50 下午
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getEptCondition();
        return response;

    }

    @PostMapping("/getStudentScore")
    public ServerResponse<HashMap<String, Object>> getStudentScore(String studentName)
    {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 搜索学生姓名，获取某学生分数
         * @Author Leaf
         * @Date 2020/11/11 4:51 下午
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getStudentScore(studentName);
        return response;

    }

    @PostMapping("/postAnswer")
    public ServerResponse<String> postAnswer(int userId, int eptId, int progress, Date time, Date startTime, Date endTime, Date date)
    {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.lang.String>
         * @Description 提交练习结果
         * @Author Leaf
         * @Date 2020/11/11 4:51 下午
         **/
        ServerResponse<String> response = eptService.postAnswer(userId, eptId, progress, time, startTime, endTime, date);
        return response;

    }

    @PostMapping("/getRank")
    public ServerResponse<HashMap<String, Object>> getRank(int userId, int id)
    {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 结束后获取完成度排名
         * @Author Leaf
         * @Date 2020/11/11 4:52 下午
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getRank(userId, id);
        return response;

    }

    @PostMapping("/postFeedback")
    public ServerResponse<String> postFeedback( int id, int difficultLevel, int exerciseLevel, int masteryLevel)
    {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.lang.String>
         * @Description 结束后提交实验体验反馈
         * @Author Leaf
         * @Date 2020/11/11 4:52 下午
         **/
        ServerResponse<String> response = eptService.postFeedback(id, difficultLevel, exerciseLevel, masteryLevel);
        return response;

    }

    @PostMapping("/getScore")
    public ServerResponse<HashMap<String, Object>> getScore(int userId, int eptId)
    {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 获取实验成绩
         * @Author Leaf
         * @Date 2020/11/11 4:52 下午
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getScore(userId, eptId);
        return response;

    }

    @PostMapping("/getReport")
    public ServerResponse<HashMap<String, Object>> getReport(int userId)
    {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         * @Description 获取实验报告
         * @Author Leaf
         * @Date 2020/11/11 4:52 下午
         **/

        ServerResponse<HashMap<String, Object>> response = eptService.getReport(userId);
        return response;

    }

}
