package com.example.cabinetmedicalback.service;

import com.example.cabinetmedicalback.dao.DeplacementDao;
import com.example.cabinetmedicalback.repository.DeplacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;
@Service
public class DeplacementService {
    private DeplacementRepository repo;

    @Autowired
    public DeplacementService(DeplacementRepository repo){
        this.repo = repo;
    }

    public List<DeplacementDao> getDeplacements(){
        return this.repo.findAll();
    }

    public DeplacementDao postDeplacement(DeplacementDao deplacement){
        return this.repo.insert(deplacement);
    }

    public DeplacementDao putDeplacement(String id, DeplacementDao deplacement){
        if (!Objects.equals(deplacement.getId(), id)) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Identifiants Incorrects");
        return this.repo.save(deplacement);
    }

    public DeplacementDao patchDeplacement(String id, DeplacementDao patchDeplacement){
        DeplacementDao deplacement = this.repo.findById(id).get();
        deplacement.setCout(patchDeplacement.getCout());
        return this.repo.save(deplacement);
    }

    public String deleteDeplacement(String id){
        this.repo.deleteById(id);
        return "Suppression du déplacement !";
    }
}
