package hci.artedu.service;

import hci.artedu.common.ServerResponse;
import hci.artedu.pojo.Course;
import hci.artedu.pojo.Knowledgepoint;

import java.util.ArrayList;

public interface CourseService {

    //获取课程信息
    public ServerResponse<Course> getCourseInfo();
    //获取知识点列表
    public ServerResponse<ArrayList> getKnowledgePointList();
    //获取知识点信息
    public ServerResponse<Knowledgepoint> getKnowledgePointInfo(int pointId);
    //完成知识点
    public ServerResponse completeKnowledgePoint(int userId, int kpId);
    //获取某用户知识点进度
    public ServerResponse<ArrayList> getUserPoint(int userId);
    //获取某知识点旗下实验
    public ServerResponse<ArrayList> getPointEpt(int pointId);





}
