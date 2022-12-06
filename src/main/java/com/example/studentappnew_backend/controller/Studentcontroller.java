package com.example.studentappnew_backend.controller;

import com.example.studentappnew_backend.Model.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my webpage";
    }
    @PostMapping(path = "/add" , consumes = "application/json" ,produces = "application/json")
    public String AddStudent(@RequestBody Students s){
        System.out.println(s.getName().toString());
        return "Successfully added";
    }

}
