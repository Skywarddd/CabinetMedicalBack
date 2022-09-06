package com.example.cabinetmedicalback.repository;

import com.example.cabinetmedicalback.dao.InfirmierDao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfirmierRepository extends MongoRepository<InfirmierDao, String> {
}
