package com.example.Practise1.service;

import com.example.Practise1.entity.EmpEntity;
import com.example.Practise1.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepo repo;

    public EmpEntity addEmp(EmpEntity emp) {
       return repo.save(emp);
    }

    public List<EmpEntity> getAll() {
        return repo.findAll();
    }

    public EmpEntity getByEmpId(int id) {
        return repo.findById(id).orElse(null);
    }
}
