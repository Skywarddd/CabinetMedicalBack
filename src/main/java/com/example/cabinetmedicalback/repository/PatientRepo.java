package com.example.cabinetmedicalback.repository;

import com.example.cabinetmedicalback.dao.PatientDao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends MongoRepository<PatientDao, String> {

    PatientDao findByNomOrPrenom(String nom, String prenom);

    PatientDao findByIdAndNom(String id,String nom);

    PatientDao findAllById(String id);

}
