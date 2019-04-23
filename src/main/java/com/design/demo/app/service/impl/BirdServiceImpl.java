package com.design.demo.app.service.impl;

import com.design.demo.app.service.AnimalsService;
import com.design.demo.app.service.CreateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
class BirdServiceImpl implements AnimalsService{

    @Autowired
    @Qualifier(value = "createBirdServiceImpl")
    private CreateService createService;

    @Override
    public String query() {
        return "Service Bird query";
    }

    @Override
    public String create() {
        return createService.doCreate();
    }

    @Override
    public String update() {
        return "Service Bird update";
    }

    @Override
    public String delete() {
        return "Service Bird delete";
    }

}