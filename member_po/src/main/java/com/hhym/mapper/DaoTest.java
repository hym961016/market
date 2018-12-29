package com.hhym.mapper;

import com.hhym.po.Entitytest;

public class DaoTest {
    public String showDao(){
        Entitytest po = new Entitytest();
        return po.showEntity()+"我是Dao";
    }
}
