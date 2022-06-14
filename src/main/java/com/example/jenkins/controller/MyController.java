package com.example.jenkins.controller;

import com.example.jenkins.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/get")
    public String getDetails(){

        return myService.get();
    }
}
