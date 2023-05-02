package com.example.Practise1.controller;


import com.example.Practise1.entity.EmpEntity;
import com.example.Practise1.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/a")
public class EmpController {

    @Autowired
    private EmpService service;

    @PostMapping("/b")
    public EmpEntity addEmps(@RequestBody EmpEntity emp){
        return service.addEmp(emp);
    }

    @GetMapping("/c")
    public List<EmpEntity> getAlls(){
        return service.getAll();
    }

    @GetMapping("/c/{id}")
    public EmpEntity getByEmpIds(@PathVariable int id){
        return service.getByEmpId(id);
    }

}
