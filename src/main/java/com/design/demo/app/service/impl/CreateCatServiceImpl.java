package com.design.demo.app.service.impl;

import com.design.demo.app.service.CreateService;

import org.springframework.stereotype.Service;

@Service
class CreateCatServiceImpl extends CreateService{

    @Override
    public void createData() {
        System.out.println("Create Data in CatServiceImpl");
    }

    @Override
    public String result() {
        return "Result Message in CatServiceImpl";
    }


}