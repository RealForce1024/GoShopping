package com.fan.core.service;

import com.fan.common.SpringJunitTest;
import com.fan.core.bean.TestTb;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by fqc on 2016/6/29.
 */
public class TestTbServiceImplTest extends SpringJunitTest {
    @Autowired
    private TestTbService tbService;
    @Test
    public void add() throws Exception {
        TestTb testTb = new TestTb();
        tbService.add(testTb);
        //int a = 1/0; 注意这里已经跑出了事务层，因此即使配置了事务处理，也不会作用到这里

    }

}