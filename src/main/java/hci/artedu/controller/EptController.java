package hci.artedu.controller;

import hci.artedu.common.ServerResponse;
import hci.artedu.service.EptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @ClassName EptController
 * @Description TODO
 * @Author jiaxin
 * @Date 2020/10/26 7:33 下午
 * @Version 1.0
 **/
@RestController
public class EptController {

    @Autowired
    private EptService eptService;

    @GetMapping("/getEptList")
    public ServerResponse<ArrayList> getEptList()
    {
        /**
         * @Author jiaxin
         * @Description 接口-获取实验列表//TODO
         * @Date 11:39 上午 2020/10/27
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.ArrayList>
         **/

        ServerResponse<ArrayList> response = eptService.getEptList();
        return response;
    }

    @GetMapping("/getEptPurpose")
    public ServerResponse<HashMap<String,Object>> getEptPurpose(int eptId)
    {
        /**
         * @Author jiaxin
         * @Description 接口-获取某实验目的//TODO
         * @Date 11:40 上午 2020/10/27
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         **/

        ServerResponse<HashMap<String,Object>> response = eptService.getOneEptPurpose(eptId);
        return response;

    }





}
