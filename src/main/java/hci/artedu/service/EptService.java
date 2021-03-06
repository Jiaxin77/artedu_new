package hci.artedu.service;

import hci.artedu.common.ServerResponse;
import hci.artedu.pojo.EptRecord;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public interface EptService {
    ServerResponse<ArrayList> getEptList();

    ServerResponse<HashMap<String, Object>> getBigEptPurpose();

    ServerResponse<HashMap<String, Object>> getBigEptRequirement();

    ServerResponse<HashMap<String, Object>> getBigEptPrinciple();

    ServerResponse<HashMap<String, Object>> getBigEptMethod();

    ServerResponse<HashMap<String, Object>> getBigEptStep();

    ServerResponse<HashMap<String, Object>> getBigEptDevice();

    ServerResponse<HashMap<String, Object>> getBigEptInfo();

    ServerResponse<HashMap<String, Object>> getEptBasicInfo(int eptId);

    ServerResponse<ArrayList> getEptPoint(int eptId);

    ServerResponse endPostExperiment(EptRecord eptRecord);

    ServerResponse<ArrayList> getUserExperimentProcess(int userId);

    ServerResponse<Boolean> beginExperiment(int userid, int expId);

    ServerResponse<HashMap<String, Object>> getAllTimeLength();

    ServerResponse<HashMap<String, Object>> getStudentMasterAttitude();

    ServerResponse<HashMap<String, Object>> getStudentInfo(int userNumber);


    ServerResponse<HashMap<String, Object>> getClassInfo(int classNumber);

    ServerResponse<HashMap<String, Object>> getSchoolInfo(String schoolName);

    ServerResponse<HashMap<String, Object>> getEptCondition();

    ServerResponse<HashMap<String, Object>> getStudentScore(String studentName);

    ServerResponse<String> postAnswer(int userId, int eptId, int progress, Date time,  Date startTime, Date endTime, Date date);

    ServerResponse<HashMap<String, Object>> getRank(int userId, int id);

    ServerResponse<String> postFeedback(int id, int difficultLevel, int exerciseLevel, int masteryLevel);

    ServerResponse<ArrayList<Object>> getScore(Integer userNumber);

    ServerResponse<HashMap<String, Object>> getReport(int userId);

    ServerResponse<int[]> getEptProcess(int expId, int userId);

    ServerResponse postUserStageNum(int userId,int eptId,int stageNum,int score);
}
