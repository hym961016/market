package com.hhym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("main")
@Controller
public class LoginController {

    @RequestMapping("index")
    public String redirect(){
        return "main/index";
    }

    @RequestMapping("sayHi")
    @ResponseBody
    public String sayHi(){
        return "hello";
    }
}
