package hci.artedu.service.impl;

import hci.artedu.common.ServerResponse;
import hci.artedu.dao.LearningRecordMapper;
import hci.artedu.pojo.LearningRecord;
import hci.artedu.pojo.LearningRecordExample;
import hci.artedu.service.LearningService;
import hci.artedu.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @program: artedu
 * @description: 学习记录
 * @author: Leaf
 * @create: 2020-11-12 15:46
 * @Version: 1.0
 **/
@Service
public class LearningServiceImpl implements LearningService {
    @Autowired
    private LearningRecordMapper learningRecordMapper;

    @Override
    public ServerResponse<String> startLearning(int userId) {
        LearningRecord learningRecord = new LearningRecord();
        learningRecord.setUserId(userId);
        Timestamp startTime = DateUtils.nowDateTime();
        learningRecord.setStartTime(startTime);
        learningRecordMapper.insert(learningRecord);
        return ServerResponse.createBySuccess(learningRecord.getId().toString());
    }

    @Override
    public ServerResponse<String> finishLearning(int id) {
        LearningRecordExample learningRecordExample = new LearningRecordExample();
        LearningRecordExample.Criteria criteria = learningRecordExample.createCriteria();
        criteria.andIdEqualTo(id);
        LearningRecord record = learningRecordMapper.selectByExample(learningRecordExample).get(0);
        Timestamp endTime = DateUtils.nowDateTime();
        record.setEndTime(endTime);
        Date startTime =  record.getStartTime();
        long duringTime = endTime.getTime() - startTime.getTime();
        record.setDuringTime(duringTime);
        learningRecordMapper.updateByExample(record,learningRecordExample);
        return ServerResponse.createBySuccess("插入成功");
    }
}
