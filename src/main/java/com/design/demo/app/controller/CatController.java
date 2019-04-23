package com.design.demo.app.controller;

import javax.servlet.http.HttpServletRequest;
import com.design.demo.app.service.AnimalsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class CatController {

    @Autowired
    @Qualifier(value = "catServiceImpl")
    private AnimalsService animalsService;

    @PostMapping("/cat/query")
    @ResponseBody
    public String query(HttpServletRequest request) {
        return animalsService.query();
    }

    @PostMapping("/cat/create")
    @ResponseBody
    public String create(HttpServletRequest request) {
        return animalsService.create();
    }

    @PostMapping("/cat/update")
    @ResponseBody
    public String update(HttpServletRequest request) {
        return animalsService.update();
    }

    @PostMapping("/cat/delete")
    @ResponseBody
    public String delete(HttpServletRequest request) {
        return animalsService.delete();
    }

}