package hci.artedu.service;

import hci.artedu.common.ServerResponse;
import hci.artedu.pojo.EptRecord;

import java.util.ArrayList;
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

    public ServerResponse<ArrayList> getEptPoint(int eptId);

    public ServerResponse endPostExperiment(EptRecord eptRecord,int[] process);

    public ServerResponse<ArrayList> getUserExperimentProcess(int userId);

    public ServerResponse<Boolean> beginExperiment(int userid,int expId);

    public ServerResponse<int[]> getEptProcess(int eptId,int userId);

}
