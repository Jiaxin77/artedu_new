package hci.artedu.controller;


import hci.artedu.common.ServerResponse;
import hci.artedu.pojo.LearningRecord;
import hci.artedu.service.LearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @program: artedu
 * @description: 学习记录
 * @author: Leaf
 * @create: 2020-11-12 15:58
 * @Version: 1.0
 **/
@RestController
public class LearningController {

    @Autowired
    private LearningService learningService;


    @PostMapping("/startLearning")
    public ServerResponse<String> startLearning(Integer userId) {
        ServerResponse<String> response =  learningService.startLearning(userId);
        return response;
    }

    @PostMapping("/finishLearning")
    public ServerResponse<String> finishLearning(Integer id) {
        ServerResponse<String> response =  learningService.finishLearning(id);
        return response;
    }
}
