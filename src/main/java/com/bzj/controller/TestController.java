package com.bzj.controller;

import com.bzj.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:bai
 * @data:2019/1/18
 **/

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(String name){
        testService.sayHello();
        return name;
    }
}
