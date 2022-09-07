package com.example.cabinetmedicalback.controller;

import com.example.cabinetmedicalback.dao.DeplacementDao;
import com.example.cabinetmedicalback.service.DeplacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deplacement")
@CrossOrigin
public class DeplacementController {
    private DeplacementService service;

    @Autowired
    public DeplacementController(DeplacementService service){
        this.service = service;
    }

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<DeplacementDao> getDeplacements(){
        return this.service.getDeplacements();
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public DeplacementDao postDeplacement(@RequestBody DeplacementDao deplacement){
        return this.service.postDeplacement(deplacement);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public DeplacementDao putDeplacement(@PathVariable String id, @RequestBody DeplacementDao deplacement){
        return this.service.putDeplacement(id, deplacement);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public DeplacementDao patchDeplacement(@PathVariable String id, @RequestBody DeplacementDao deplacement){
        return this.service.patchDeplacement(id, deplacement);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public String deleteDeplacement(@PathVariable String id){
        return this.service.deleteDeplacement(id);
    }
}
