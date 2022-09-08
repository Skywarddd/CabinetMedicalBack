package com.example.cabinetmedicalback.service;

import com.example.cabinetmedicalback.dao.InfirmierDao;
import com.example.cabinetmedicalback.repository.InfirmierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

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

    public Optional<InfirmierDao> getById(String id) {
        return this.repo.findById(id);
    }

    public List<InfirmierDao> getByNomOrPrenom (String name) {
        return this.repo.findByNomOrPrenom(name, name);
    }

    public InfirmierDao create(InfirmierDao item) {
        return this.repo.insert(item);
    }

    public InfirmierDao replace(String id, InfirmierDao item) {
        if (this.getById(id).isEmpty()) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "cet id n'existe pas");
        item.setId(id);
        return this.repo.save(item);
    }

    public String delete(String id) {
        if (this.getById(id).isEmpty()) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "cet id n'existe pas");
        InfirmierDao aSupprimer = this.repo.findAllById(id);
        aSupprimer.setActive(false);
        this.repo.save(aSupprimer);
        return "Utilisateur supprimé";
    }

}
