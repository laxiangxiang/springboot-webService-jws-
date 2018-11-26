package com.example.demo.webservice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by LXX on 2018/11/22.
 */
@WebService
@Service
public class TestServiceImpl implements TestService{

    private Log log = LogFactory.getLog(TestServiceImpl.class);

    @Override
    public String hiWebService(String s) {
        String msg = "获取消息："+s;
        log.info(msg);
        return msg;
    }
}
