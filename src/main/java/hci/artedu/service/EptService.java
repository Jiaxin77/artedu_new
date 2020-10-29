package hci.artedu.service;

import hci.artedu.common.ServerResponse;

import java.util.ArrayList;
import java.util.HashMap;

public interface EptService {
    public ServerResponse<ArrayList> getEptList();
    public ServerResponse<HashMap<String,Object>> getBigEptPurpose();
    public ServerResponse<HashMap<String,Object>> getBigEptInfo();
    public ServerResponse<HashMap<String,Object>> getEptBasicInfo(int eptId);


}
