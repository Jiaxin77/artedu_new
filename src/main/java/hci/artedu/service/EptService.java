package hci.artedu.service;

import hci.artedu.common.ServerResponse;

import java.util.ArrayList;
import java.util.HashMap;

public interface EptService {
    public ServerResponse<ArrayList> getEptList();

    public ServerResponse<HashMap<String, Object>> getBigEptPurpose();

    public ServerResponse<HashMap<String, Object>> getBigEptRequirement();

    public ServerResponse<HashMap<String, Object>> getBigEptPrinciple();

    public ServerResponse<HashMap<String, Object>> getBigEptMethod();

    public ServerResponse<HashMap<String, Object>> getBigEptStep();

    public ServerResponse<HashMap<String, Object>> getBigEptDevice();

    public ServerResponse<HashMap<String, Object>> getBigEptInfo();

    public ServerResponse<HashMap<String, Object>> getEptBasicInfo(int eptId);

    public ServerResponse<ArrayList> getEptPoint(int eptId);


}
