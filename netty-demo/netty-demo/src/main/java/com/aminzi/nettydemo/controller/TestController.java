package com.aminzi.nettydemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：测试控制器
 *
 * @author 郑敏
 * @email aminzi97@163.com
 * @Date 2023/12/6 16:45
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @PostMapping("/test")
    public void test(){

    }}
