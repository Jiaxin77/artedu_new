package hci.artedu.service;

import hci.artedu.common.ServerResponse;

import java.util.Map;

public interface CodeService {
    ServerResponse sendMessage(String phoneNumber, Map<String, Object> map);
}
