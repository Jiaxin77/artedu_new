package hci.artedu.service;

import hci.artedu.common.ServerResponse;
import hci.artedu.pojo.LearningRecord;

/**
 * @program: artedu
 * @description: 学习记录
 * @author: Leaf
 * @create: 2020-11-12 15:45
 * @Version: 1.0
 **/
public interface LearningService {
    ServerResponse<String> startLearning(int userId);
    ServerResponse<String> finishLearning(int id);
}
