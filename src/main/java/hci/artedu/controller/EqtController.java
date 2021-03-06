package hci.artedu.controller;
import hci.artedu.common.ServerResponse;
import hci.artedu.service.EqtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


/**
 * @program: artedu
 * @description: 设备相关操作
 * @author: Leaf
 * @create: 2020-11-04 16:13
 * @Version: 1.0
 **/
@RestController
public class EqtController {
    @Autowired
    private EqtService eqtService;

    @GetMapping("/getReserveApply")
    public ServerResponse<ArrayList<Object>> getReserveApply() {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.util.ArrayList>
         * @Description 获取设备租借申请的相关信息
         * @Author Leaf
         * @Date 2020/11/4 4:28 下午
         **/
        ServerResponse<ArrayList<Object>> response = eqtService.getReserveApply();
        return response;
    }

    @PostMapping("/checkApply")
    public ServerResponse<String> checkApply(Integer result,String comment) {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.lang.String>
         * @Description 提交教师批准结果
         * @Author Leaf
         * @Date 2020/11/4 6:49 下午
         **/
        ServerResponse<String> response = eqtService.checkApply(result, comment);
        return response;
    }

    @PostMapping("/reserveApply")
    public ServerResponse<String> reserveApply(Integer deviceId, Date reverseTime, Double reversePeriod) {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.lang.String>
         * @Description 提交设备预约申请
         * @Author Leaf
         * @Date 2020/11/4 6:49 下午
         **/
        ServerResponse<String> response = eqtService.reserveApply(deviceId, reverseTime,reversePeriod);
        return response;
    }

    @GetMapping("/toolInfo")
    public ServerResponse<HashMap<String, Object>> toolInfo(int toolTpye) {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.lang.String>
         * @Description 获取设备信息
         * @Author Leaf
         * @Date 2020/11/4 6:49 下午
         **/
        ServerResponse<HashMap<String, Object>> response = eqtService.toolInfo(toolTpye);
        return response;
    }

    @GetMapping("/getNum")
    public ServerResponse<HashMap<String, Object>> getNum() {
        /**
         * TODO
         * @return hci.artedu.common.ServerResponse<java.lang.String>
         * @Description 获取目前已有设备数量
         * @Author Leaf
         * @Date 2020/11/4 6:49 下午
         **/
        ServerResponse<HashMap<String, Object>> response = eqtService.getEqtNumber();
        return response;
    }
}
