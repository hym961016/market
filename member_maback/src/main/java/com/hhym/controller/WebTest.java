package com.hhym.controller;

import com.hhym.service.ServiceTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class WebTest {
    @RequestMapping("showAll")
    public String showAll(){
        ServiceTest po = new ServiceTest();
        return po.showService()+"我是Web";
    }
}
