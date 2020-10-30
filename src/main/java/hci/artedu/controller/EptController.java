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

    @GetMapping("/getBigEptInfo")
    public ServerResponse<HashMap<String,Object>> getBigEptInfo()
    {
        /**
         * @Author jiaxin
         * @Description 获取大实验的基本信息//TODO
         * @Date 5:30 下午 2020/10/28
         * @Param [eptId]
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         **/

        ServerResponse<HashMap<String,Object>> response = eptService.getBigEptInfo();
        return response;
    }

    @GetMapping("/getEptBasicInfo")
    public ServerResponse<HashMap<String,Object>> getEptBasicInfo(int eptId)
    {
        /**
         * @Author jiaxin
         * @Description 获取某小实验基本信息//TODO
         * @Date 11:17 上午 2020/10/29
         * @Param [eptId]
         * @return hci.artedu.common.ServerResponse<java.util.HashMap<java.lang.String,java.lang.Object>>
         **/
        ServerResponse<HashMap<String,Object>> response = eptService.getEptBasicInfo(eptId);
        return  response;

    }

    @GetMapping("/getBigEptPurpose")
    public ServerResponse<HashMap<String, Object>> getEptPurpose() {
        /**
         * @Author jiaxin
         * @Description 接口-获取大实验目的//TODO
         * @Date 11:40 上午 2020/10/27
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/

        ServerResponse<HashMap<String, Object>> response = eptService.getBigEptPurpose();
        return response;

    }

    @GetMapping("/getBigEptRequirement")
    public ServerResponse<HashMap<String, Object>> getEptRequirement() {
        /**
         * @Author myz
         * @Description 接口-获取大实验要求//TODO
         * @Date 10:17 上午 2020/10/30
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getBigEptRequirement();
        return response;
    }

    @GetMapping("/getBigEptPrinciple")
    public ServerResponse<HashMap<String, Object>> getEptPrinciple() {
        /**
         * @Author myz
         * @Description 接口-获取大实验原理//TODO
         * @Date 10:17 上午 2020/10/30
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getBigEptPrinciple();
        return response;
    }

    @GetMapping("/getBigEptMethod")
    public ServerResponse<HashMap<String, Object>> getEptMethod() {
        /**
         * @Author myz
         * @Description 接口-获取大实验原理//TODO
         * @Date 10:17 上午 2020/10/30
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getBigEptMethod();
        return response;
    }

    @GetMapping("/getBigEptStep")
    public ServerResponse<HashMap<String, Object>> getEptStep() {
        /**
         * @Author myz
         * @Description 接口-获取大实验步骤//TODO
         * @Date 10:17 上午 2020/10/30
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getBigEptStep();
        return response;
    }

    @GetMapping("/getBigEptDevice")
    public ServerResponse<HashMap<String, Object>> getEptDevice() {
        /**
         * @Author myz
         * @Description 接口-获取大实验仪器设备//TODO
         * @Date 10:17 上午 2020/10/30
         * @Param []
         * @return hci.artedu.common.ServerResponse<java.util.HashMap < java.lang.String, java.lang.Object>>
         **/
        ServerResponse<HashMap<String, Object>> response = eptService.getBigEptDevice();
        return response;
    }

}
