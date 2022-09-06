package com.example.cabinetmedicalback.controller;

import com.example.cabinetmedicalback.dao.InfirmierDao;
import com.example.cabinetmedicalback.service.InfirmierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/infirmier")
public class InfirmierController {

    private InfirmierService service;

    @Autowired
    InfirmierController(InfirmierService service) {
        this.service = service;
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<InfirmierDao> getAll() {
        return service.getAll();
    }
}
