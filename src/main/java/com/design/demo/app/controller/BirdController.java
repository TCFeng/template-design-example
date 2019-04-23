package com.design.demo.app.controller;

import javax.servlet.http.HttpServletRequest;
import com.design.demo.app.service.AnimalsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class BirdController {

    @Autowired
    @Qualifier(value = "birdServiceImpl")
    private AnimalsService animalsService;

    @PostMapping("/bird/query")
    @ResponseBody
    public String query(HttpServletRequest request) {
        return animalsService.query();
    }

    @PostMapping("/bird/create")
    @ResponseBody
    public String create(HttpServletRequest request) {
        return animalsService.create();
    }

    @PostMapping("/bird/update")
    @ResponseBody
    public String update(HttpServletRequest request) {
        return animalsService.update();
    }

    @PostMapping("/bird/delete")
    @ResponseBody
    public String delete(HttpServletRequest request) {
        return animalsService.delete();
    }

}