package com.example.studentappnew_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my webpage";
    }
    @GetMapping("/contact")
    public String Contactpage(){
        return "Welcome to my contactpage";
    }
    @GetMapping("/gallery")
    public String Gallerypage(){
        return  "Welcome to my Gallerypage";
    }
    @GetMapping("/home")
    public String Home(){
        return "Welcome to my Home";
    }
}
