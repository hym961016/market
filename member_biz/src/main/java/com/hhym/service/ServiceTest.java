package com.hhym.service;

import com.hhym.mapper.DaoTest;

public class ServiceTest {
    public String showService(){
        DaoTest po = new DaoTest();
        return po.showDao()+"我是Service";
    }
}
