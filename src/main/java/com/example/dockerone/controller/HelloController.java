package com.example.dockerone.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 冯攀峰(fengpanfeng @ corp.netease.com)
 */
@Slf4j
@RestController()
@RequestMapping("/user")
public class HelloController {

    @Value("${user1.name}")
    private String name;


    @Value("${user2.name}")
    private String name2;

    @RequestMapping("/name")
    public String getName(){
        log.info("haha");
        String ss= name2;
        return name;
    }
}