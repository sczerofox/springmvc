package com.itbbj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user save...");
        return "save success";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(){
        System.out.println("user login...");
        return "login success";
    }
}
