package com.example.servletfilterlistener.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 * 创建人:ChiChi
 * 创建日期:2019/8/11 0011
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getName")
    public String getName(String name){
        return name;
    }
}
