package com.example.cabinetmedicalback.repository;

import com.example.cabinetmedicalback.dao.InfirmierDao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfirmierRepository extends MongoRepository<InfirmierDao, String> {

    List<InfirmierDao> findByNomOrPrenom(String nom, String prenom);

    InfirmierDao findAllById(String id);
}
