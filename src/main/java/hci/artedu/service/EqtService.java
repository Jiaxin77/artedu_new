package hci.artedu.service;

import hci.artedu.common.ServerResponse;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * @program: artedu
 * @description: 设备
 * @author: Leaf
 * @create: 2020-11-04 16:17
 * @Version: 1.0
 **/
public interface EqtService {
    ServerResponse<HashMap<String, Object>> getEqtNumber();
    ServerResponse<String> reserveApply(int deviceId, Date reverseTime, Double reversePeriod);
    ServerResponse<ArrayList<Object>> getReserveApply();
    ServerResponse<HashMap<String, Object>> toolInfo(int toolTpye);
    ServerResponse<String> checkApply(int result,String comment);
}
