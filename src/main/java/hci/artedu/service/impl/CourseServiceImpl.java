package hci.artedu.service.impl;

import hci.artedu.common.ServerResponse;
import hci.artedu.dao.*;
import hci.artedu.pojo.*;
import hci.artedu.service.CourseService;
import hci.artedu.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName CourseServiceImpl
 * @Description TODO
 * @Author jiaxin
 * @Date 2020/11/2 9:33 下午
 * @Version 1.0
 **/
@Service
public class CourseServiceImpl implements CourseService {
    /**
     * @Author jiaxin
     * @Description 获取课程信息以及知识点//TODO
     * @Date 9:39 下午 2020/11/2
     * @Param
     * @return
     **/

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private KnowledgepointMapper knowledgepointMapper;

    @Autowired
    private PointrecordMapper pointrecordMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PointExperimentMapper pointExperimentMapper;

    @Autowired
    private ExperimentMapper experimentMapper;



    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<Course> getCourseInfo()
    {
        /*
         * @Author jiaxin
         * @Description 获取课程信息//TODO
         * @Date 11:33 上午 2020/11/4
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         **/

        int courseId = 1;
        Course course = courseMapper.selectByPrimaryKey(courseId);
        //HashMap<String,Object> resultMap = new HashMap<String, Object>();
        return ServerResponse.createBySuccess("获取成功", course);


    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<ArrayList> getKnowledgePointList()
    {
        /**
         * @Author jiaxin
         * @Description 获取知识点列表//TODO
         * @Date 2:52 下午 2020/11/4
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.ArrayList>
         **/

        ArrayList<Object> pointList = new ArrayList<Object>();
        KnowledgepointExample kpExample = new KnowledgepointExample();
        kpExample.setDistinct(false);
        List<Knowledgepoint> kpList = knowledgepointMapper.selectByExample(kpExample);

        for(Knowledgepoint kp:kpList)
        {
            HashMap<String,Object> map = new HashMap<String, Object>();
            map.put("id",kp.getId());
            map.put("name",kp.getName());
            pointList.add(map);
        }
        return ServerResponse.createBySuccess("获取成功",pointList);




    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<Knowledgepoint> getKnowledgePointInfo(int pointId)
    {
        /**
         * @Author jiaxin
         * @Description 获取某知识点内容//TODO
         * @Date 3:04 下午 2020/11/4
         * @Param [pointId]
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         **/
        Knowledgepoint knowledgepoint = knowledgepointMapper.selectByPrimaryKey(pointId);
        return ServerResponse.createBySuccess("获取成功",knowledgepoint);


    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)//增加事务回滚
    public ServerResponse completeKnowledgePoint(int userId, int kpId)
    {
        /**
         * @Author jiaxin
         * @Description   确认学完了某知识点//TODO
         * @Date 4:15 下午 2020/11/4
         * @Param [userId, kpId]
         * @return hci.artedu.common.ServerResponse<java.lang.Boolean>
         **/

        Knowledgepoint  knowledgepoint = knowledgepointMapper.selectByPrimaryKey(kpId);
        User user = userMapper.selectByPrimaryKey(userId);
        Pointrecord pointrecord = new Pointrecord();
        pointrecord.setPointId(knowledgepoint.getId());
        Timestamp nowTime = DateUtils.nowDateTime();
        pointrecord.setCompleteTime(nowTime);
        pointrecord.setUserId(user.getId());
        pointrecordMapper.insert(pointrecord);
        return ServerResponse.createBySuccessMessage("确认成功");



    }


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<ArrayList> getUserPoint(int userId)
    {
        /**
         * @Author jiaxin
         * @Description 获取某用户的知识点进度//TODO
         * @Date 3:05 下午 2020/11/4
         * @Param [userId]
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         **/

        User user = userMapper.selectByPrimaryKey(userId);
        PointrecordExample pointrecordExample = new PointrecordExample();
        PointrecordExample.Criteria criteria = pointrecordExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<Pointrecord> pointrecords = pointrecordMapper.selectByExample(pointrecordExample);
        ArrayList<Object> studiedPoint = new ArrayList<>();
        for(Pointrecord pointrecord:pointrecords)
        {
            HashMap<String,Object> map = new HashMap<String, Object>();
            Knowledgepoint knowledgepoint = knowledgepointMapper.selectByPrimaryKey(pointrecord.getPointId());
            map.put("pointId",knowledgepoint.getId());
            map.put("pointName",knowledgepoint.getName());
            studiedPoint.add(map);
        }

        return ServerResponse.createBySuccess("获取成功",studiedPoint);




    }



    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<ArrayList> getPointEpt(int pointId)
    {
        /**
         * @Author jiaxin
         * @Description 获取知识点对应的实验列表以及每个实验的知识点列表//TODO
         * @Date 3:43 下午 2020/11/4
         * @Param [pointId]
         * @return hci.artedu.common.ServerResponse<java.util.ArrayList>
         **/
        ArrayList<Object> experimentList = new ArrayList<Object>();

        PointExperimentExample pointExperimentExample = new PointExperimentExample();
        PointExperimentExample.Criteria criteria = pointExperimentExample.createCriteria();
        criteria.andPointIdEqualTo(pointId);
        List<PointExperiment> pointExperimentList = pointExperimentMapper.selectByExample(pointExperimentExample);
        for(PointExperiment pointExperiment:pointExperimentList)
        {
            Experiment experiment = experimentMapper.selectByPrimaryKey(pointExperiment.getEptId());
            HashMap<String,Object> map = new HashMap<String, Object>();
            map.put("eptId",experiment.getId());
            map.put("eptName",experiment.getName());

            //实验涉及的知识点
            PointExperimentExample pointExperimentExample1 = new PointExperimentExample();
            PointExperimentExample.Criteria criteria1 = pointExperimentExample1.createCriteria();
            criteria1.andEptIdEqualTo(experiment.getId());
            List<PointExperiment> pointExperimentList1 = pointExperimentMapper.selectByExample(pointExperimentExample1);
            ArrayList<Object> pointArrayList = new ArrayList<Object>();
            for(PointExperiment pet:pointExperimentList1)
            {
                Knowledgepoint knowledgepoint = knowledgepointMapper.selectByPrimaryKey(pet.getPointId());
                HashMap<String,Object> petMap = new HashMap<String, Object>();
                petMap.put("pointid",knowledgepoint.getId());
                petMap.put("pointName",knowledgepoint.getName());
                pointArrayList.add(petMap);
            }
            map.put("knowledgePoints",pointArrayList);

            experimentList.add(map);


        }
        return ServerResponse.createBySuccess("获取成功",experimentList);
    }









}
