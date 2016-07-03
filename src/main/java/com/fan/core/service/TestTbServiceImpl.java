package com.fan.core.service;

import com.fan.core.bean.TestTb;
import com.fan.core.dao.TestTbDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by fqc on 2016/6/29.
 */
@Service
@Transactional
public class TestTbServiceImpl implements TestTbService {

    @Resource
    private TestTbDao testTbDao;

    public void add(TestTb tb) {
        testTbDao.addTestTb(tb);
        //int a = 1/0;//测试事务添加
    }
}
