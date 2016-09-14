package com.sylvanas.foe.test;

import com.alibaba.fastjson.JSON;
import com.sylvanas.foe.modules.fru.entity.User;
import com.sylvanas.foe.modules.fru.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by chenyong on 2016/9/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-content.xml"})

public class TestMyBatis {

    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Resource
    private UserService userService;

    @Test
    public void test1() {
        User user = userService.getUserById(1);
        System.out.println(JSON.toJSONString(user));
        logger.info(JSON.toJSONString(user));
    }
}
