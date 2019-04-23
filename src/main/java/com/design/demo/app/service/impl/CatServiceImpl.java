package com.design.demo.app.service.impl;

import com.design.demo.app.service.AnimalsService;
import com.design.demo.app.service.CreateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
class CatServiceImpl implements AnimalsService{

    @Autowired
    @Qualifier(value = "createCatServiceImpl")
    private CreateService createService;

    @Override
    public String query() {
        return "Service Cat query";
    }

    @Override
    public String create() {
        return createService.doCreate();
    }

    @Override
    public String update() {
        return "Service Cat update";
    }

    @Override
    public String delete() {
        return "Service Cat delete";
    }

    public String doCat() {
        return "Service Do Cat";

    }

}