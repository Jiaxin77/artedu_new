package hci.artedu.controller;

import hci.artedu.common.ServerResponse;
import hci.artedu.pojo.Course;
import hci.artedu.pojo.Knowledgepoint;
import hci.artedu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @ClassName CourseController
 * @Description TODO
 * @Author jiaxin
 * @Date 2020/10/26 7:33 下午
 * @Version 1.0
 **/

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;




    @GetMapping("/getCourseInfo")
    public ServerResponse<Course> getCourseInfo()
    {
        /**
         * @Author jiaxin
         * @Description 获取课程信息//TODO
         * @Date 7:47 下午 2020/11/4
         * @Param []
         * @return hci.artedu.common.ServerResponse<hci.artedu.pojo.Course>
         **/

        ServerResponse<Course> response = courseService.getCourseInfo();
        return response;
    }

    @GetMapping("/getKnowledgePointList")
    public ServerResponse<ArrayList> getKnowledgePointList()
    {
        /**
         * @Author jiaxin
         * @Description 获取知识点列表//TODO
         * @Date 7:57 下午 2020/11/4
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.ArrayList>
         **/

        ServerResponse<ArrayList> response = courseService.getKnowledgePointList();
        return response;
    }


    //获取知识点信息
    @GetMapping("/getKnowledgePointInfo")
    public ServerResponse<Knowledgepoint> getKnowledgePointInfo(int pointId)
    {
        /**
         * @Author jiaxin
         * @Description 获取知识点信息//TODO
         * @Date 7:59 下午 2020/11/4
         * @Param [pointId]
         * @return hci.artedu.common.ServerResponse<hci.artedu.pojo.Knowledgepoint>
         **/

        ServerResponse<Knowledgepoint> response = courseService.getKnowledgePointInfo(pointId);
        return response;
    }


    //完成知识点
    @PostMapping("/completeKnowledgePoint")
    public ServerResponse completeKnowledgePoint(int userId, int kpId)
    {
        /**
         * @Author jiaxin
         * @Description 完成知识点//TODO
         * @Date 8:00 下午 2020/11/4
         * @Param [userId, kpId]
         * @return hci.artedu.common.ServerResponse
         **/

        ServerResponse response = courseService.completeKnowledgePoint(userId,kpId);
        return response;
    }


    //获取某用户知识点进度
    @GetMapping("/getUserPoint")
    public ServerResponse<ArrayList> getUserPoint(int userId)
    {
        /**
         * @Author jiaxin
         * @Description 获取用户知识点进度//TODO
         * @Date 8:01 下午 2020/11/4
         * @Param [userId]
         * @return hci.artedu.common.ServerResponse<java.util.ArrayList>
         **/

        ServerResponse<ArrayList> response = courseService.getUserPoint(userId);
        return  response;

    }


    @GetMapping("/getPointEpt")
    public ServerResponse<ArrayList> getPointEpt(int pointId)
    {
        /**
         * @Author jiaxin
         * @Description 获取某知识点旗下实验//TODO
         * @Date 8:04 下午 2020/11/4
         * @Param [pointId]
         * @return hci.artedu.common.ServerResponse<java.util.ArrayList>
         **/

        ServerResponse<ArrayList> response = courseService.getPointEpt(pointId);
        return response;
    }







}
