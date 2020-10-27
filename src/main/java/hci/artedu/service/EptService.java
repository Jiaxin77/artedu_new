package hci.artedu.service;

import hci.artedu.common.ServerResponse;

import java.util.ArrayList;
import java.util.HashMap;

public interface EptService {
    public ServerResponse<ArrayList> getEptList();
    public ServerResponse<HashMap<String,Object>> getOneEptPurpose(int eptId);
}
