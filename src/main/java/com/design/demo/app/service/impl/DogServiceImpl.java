package com.design.demo.app.service.impl;

import com.design.demo.app.service.CreateService;
import com.design.demo.app.service.DogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
class DogServiceImpl implements DogService {

    @Autowired
    @Qualifier(value = "createDogServiceImpl")
    private CreateService createService;

    @Override
    public String query() {
        return "Service Dog query";
    }

    @Override
    public String create() {
        return createService.doCreate();
    }

    @Override
    public String update() {
        return "Service Dog update";
    }

    @Override
    public String delete() {
        return "Service Dog delete";
    }

    public String doDog() {
        return "Service Do Dog";

    }

}