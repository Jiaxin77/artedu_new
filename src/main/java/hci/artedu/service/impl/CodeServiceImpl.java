package hci.artedu.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import hci.artedu.common.ServerResponse;
import hci.artedu.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * @ClassName EptServiceImpl
 * @Description TODO
 * @Author myz
 * @Date 2020/11/8 10:57 上午
 * @Version 1.0
 **/

@Service
public class CodeServiceImpl implements CodeService {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse sendMessage(String phoneNumber, Map<String, Object> map) {
        /**
         * @Author myz
         * @Description Send the random verification code to some phone number//TODO
         * @Date 10：58 上午 2020/11/8
         * @Param [phoneNumber, map]
         * @return hci.artedu.common.ServerResponse
         **/
        //Another one with RAM permission
        //AccessKey ID LTAI4G9EZBngyqwEqoJJkRqB
        //AccessKey Secret jho3dU9kJdy52uRrDxbxTzxzL6PaC5
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4FzrjYY7cuGRFshKRxQr", "EyQFocDVWxXsCXvjYpKTlx8cDoEGZO");
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phoneNumber);
        request.putQueryParameter("SignName", "虚拟仿真艺术教学平台");
        request.putQueryParameter("TemplateCode", "SMS_205394716");
        request.putQueryParameter("TemplateParam", JSONObject.toJSONString(map));
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
            return ServerResponse.createBySuccess();
        } catch (ServerException e) {
            e.printStackTrace();
            return ServerResponse.createByError();
        } catch (ClientException e) {
            e.printStackTrace();
            return ServerResponse.createByError();
        }
    }
}
