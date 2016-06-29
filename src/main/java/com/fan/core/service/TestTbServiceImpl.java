package com.fan.core.service;

import com.fan.core.bean.TestTb;
import com.fan.core.dao.TestTbDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by fqc on 2016/6/29.
 */
@Service
public class TestTbServiceImpl implements TestTbService {

    @Resource
    private TestTbDao testTbDao;

    @Override
    public void add(TestTb tb) {
        testTbDao.addTestTb(tb);
    }
}
