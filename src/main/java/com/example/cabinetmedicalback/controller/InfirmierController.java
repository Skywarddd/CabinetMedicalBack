package com.example.cabinetmedicalback.controller;

import com.example.cabinetmedicalback.dao.InfirmierDao;
import com.example.cabinetmedicalback.service.InfirmierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/infirmier")
@CrossOrigin
public class InfirmierController {

    private InfirmierService service;

    @Autowired
    InfirmierController(InfirmierService service) {
        this.service = service;
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<InfirmierDao> getAll() {
        if(service.getAll().isEmpty()) throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        return service.getAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<InfirmierDao> getById(@PathVariable String id) {
        if(service.getById(id).isEmpty()) throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        return service.getById(id);
    }

    //l'url est namefilter pour la differencier de l'url par défaut (conflit si pas de diff)
    @GetMapping("/name/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<InfirmierDao> getByNomOrPrenom(@PathVariable String name) {
        if(service.getByNomOrPrenom(name).isEmpty()) throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        return service.getByNomOrPrenom(name);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    public InfirmierDao post(@RequestBody InfirmierDao item) {
        return this.service.create(item);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public InfirmierDao put(@PathVariable String id, @RequestBody InfirmierDao item) {
        return this.service.replace(id, item);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public String delete(@PathVariable String id) {
        return this.service.delete(id);
    }
}
