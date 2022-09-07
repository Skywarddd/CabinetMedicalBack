package com.example.cabinetmedicalback.service;

import com.example.cabinetmedicalback.dao.PatientDao;
import com.example.cabinetmedicalback.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PatientService {
    private PatientRepo repo;

    @Autowired
    public PatientService(PatientRepo repo) {
        this.repo = repo;
    }

    public List<PatientDao> getAllPatient() {
        List<PatientDao> result = this.repo.findAll();
        if (result.size() == 0) throw new ResponseStatusException(HttpStatus.OK);
        return result;
    }

    public Optional<PatientDao> getPatientById(String id) {
        Optional<PatientDao> result = this.repo.findById(id);
        return result;
    }

    public List<PatientDao>  getPatientByName(String nom) {
        List<PatientDao> result = this.repo.findByNomOrPrenom(nom, nom);
        return result;
    }

    public PatientDao postPatient(PatientDao item) {
        return this.repo.insert(item);
    }

    public PatientDao putPatient(String id, PatientDao item) {

        if (!Objects.equals(item.getId(), id)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id non cohérente");
        } else {
            this.repo.save(item);
            return item;
        }
    }

    public PatientDao deletePatient(String id){
        PatientDao result = this.repo.findAllById(id);
        result.setIsActive(false);
        this.repo.save(result);
        return result;
    }



}