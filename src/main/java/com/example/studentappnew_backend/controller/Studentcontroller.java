package com.example.studentappnew_backend.controller;

import com.example.studentappnew_backend.Model.Students;
import com.example.studentappnew_backend.doa.StudentDoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class Studentcontroller {
    @Autowired
    public StudentDoa dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my webpage";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add" , consumes = "application/json" ,produces = "application/json")
    public HashMap<String,String> AddStudent(@RequestBody Students s){
        System.out.println(s.getName().toString());
        System.out.println(s.getAdmno().toString());
        System.out.println(s.getRollno());
        System.out.println(s.getCollege().toString());
        dao.save(s);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Students> StudentView(){
        return (List<Students>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Students> Search(@RequestBody Students s) {
        String admno = s.getAdmno();
        System.out.println(admno);
        return (List<Students>) dao.Search(s.getAdmno());

    }

}
