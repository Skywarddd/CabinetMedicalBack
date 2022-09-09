package com.example.cabinetmedicalback.controller;

import com.example.cabinetmedicalback.dao.DeplacementDao;
import com.example.cabinetmedicalback.dao.InfirmierDao;
import com.example.cabinetmedicalback.dao.PatientDao;
import com.example.cabinetmedicalback.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patient")
@CrossOrigin
public class PatientController {

    private final PatientService service;

    @Autowired
    public PatientController(PatientService service){
        this.service = service;
    }

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<PatientDao> getAllPatient(){
        return this.service.getAllPatient();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Optional<PatientDao> getPatientById(@PathVariable String id){
        return this.service.getPatientById(id);
    }

    @GetMapping("/name/{nom}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<PatientDao>  getPatientByName(@PathVariable String nom){
        return this.service.getPatientByName(nom);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public PatientDao postPatient(@RequestBody PatientDao item){
        return this.service.postPatient(item);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public PatientDao putPatient(@PathVariable String id, @RequestBody PatientDao item){
        return this.service.putPatient(id,item);

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public PatientDao deletePatient(@PathVariable String id){
        return this.service.deletePatient(id);
    }

    @PatchMapping("/infirmier/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public PatientDao addInfirmier(@PathVariable String id, @RequestBody InfirmierDao infirmier) {
        return this.service.addInfirmier(id, infirmier);
    }

    @PatchMapping("/deplacement/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public PatientDao addDeplacement(@PathVariable String id, @RequestBody DeplacementDao deplacement) {
        return this.service.addDeplacement(id, deplacement);
    }
}
