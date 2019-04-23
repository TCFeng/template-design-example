package com.design.demo.app.service;

public abstract class CreateService {

    public String doCreate() {
        createData();
        publishIoT();
        writeLog();
        return result();
    }

    public abstract void createData();

    private void publishIoT() {
        System.out.println("Publish IoT");
    }

    private void writeLog() {
        System.out.println("Write log");
    }

    public String result() {
        return "Create Success";
    }


}