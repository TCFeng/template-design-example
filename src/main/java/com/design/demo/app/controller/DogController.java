package com.design.demo.app.controller;

import javax.servlet.http.HttpServletRequest;
import com.design.demo.app.service.DogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class DogController {

    @Autowired
    @Qualifier(value = "dogServiceImpl")
    private DogService animalsService;

    @PostMapping("/dog/query")
    @ResponseBody
    public String query(HttpServletRequest request) {
        return animalsService.query();
    }

    @PostMapping("/dog/create")
    @ResponseBody
    public String create(HttpServletRequest request) {
        return animalsService.create();
    }

    @PostMapping("/dog/update")
    @ResponseBody
    public String update(HttpServletRequest request) {
        return animalsService.update();
    }

    @PostMapping("/dog/delete")
    @ResponseBody
    public String delete(HttpServletRequest request) {
        return animalsService.delete();
    }

    @PostMapping("/dog/doDog")
    @ResponseBody
    public String doDog(HttpServletRequest request) {
        return animalsService.doDog();
    }

}