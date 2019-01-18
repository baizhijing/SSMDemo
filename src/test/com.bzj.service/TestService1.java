package com.bzj.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author:bai
 * @data:2019/1/18
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/applicationContext.xml")
public class TestService1 {

    @Autowired
    private TestService testService;

    @Test
    public void test(){
        testService.sayHello();
    }
}