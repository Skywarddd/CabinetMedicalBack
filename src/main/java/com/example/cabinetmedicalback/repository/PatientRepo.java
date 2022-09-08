package com.example.cabinetmedicalback.repository;

import com.example.cabinetmedicalback.dao.PatientDao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepo extends MongoRepository<PatientDao, String> {

    List<PatientDao> findByNomOrPrenom(String nom, String prenom);


    PatientDao findAllById(String id);

}
