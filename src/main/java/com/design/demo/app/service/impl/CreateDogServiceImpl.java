package com.design.demo.app.service.impl;

import com.design.demo.app.service.CreateService;

import org.springframework.stereotype.Service;

@Service
class CreateDogServiceImpl extends CreateService{

    @Override
    public void createData() {
        System.out.println("Create Data in DogServiceImpl");
    }

    @Override
    public String result() {
        return "Result Message in CreateDogServiceImpl";
    }


}