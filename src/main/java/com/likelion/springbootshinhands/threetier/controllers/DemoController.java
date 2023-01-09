package com.likelion.springbootshinhands.threetier.controllers;

import com.likelion.springbootshinhands.threetier.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/")
    public String hello(ModelMap model) {
        String message = demoService.getMessage();
        model.put("message", message);

        return "hello";
    }
}
