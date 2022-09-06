package com.example.cabinetmedicalback.repository;

import com.example.cabinetmedicalback.dao.DeplacementDao;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeplacementRepository extends MongoRepository<DeplacementDao, String> {
}
