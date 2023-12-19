package com.example.FirstProjectJavaSprings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/")
    public String hello(){
        return "Hi ,This is my first Spring Controller";
    }
}
