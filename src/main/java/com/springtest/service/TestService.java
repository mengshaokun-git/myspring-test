package com.springtest.service;

import com.springtest.utils.ServerResponse;
import meng.springframework.annotation.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestService {

    public ServerResponse test(String a) {
        Map<String,Object> retMap = new HashMap<String, Object>();
        return ServerResponse.success(a,"调用成功了！");
    }
}
