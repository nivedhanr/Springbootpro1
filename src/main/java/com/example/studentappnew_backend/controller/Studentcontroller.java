package com.example.studentappnew_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my webpage";
    }
}
