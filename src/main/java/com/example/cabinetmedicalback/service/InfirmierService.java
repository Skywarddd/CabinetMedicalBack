package com.example.cabinetmedicalback.service;

import com.example.cabinetmedicalback.dao.InfirmierDao;
import com.example.cabinetmedicalback.repository.InfirmierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfirmierService {
    private InfirmierRepository repo;

    @Autowired
    public InfirmierService(InfirmierRepository repo) {
        this.repo = repo;
    }

    public List<InfirmierDao> getAll() {
        return this.repo.findAll();
    }

}
