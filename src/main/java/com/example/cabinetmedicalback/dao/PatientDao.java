package com.example.cabinetmedicalback.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("patient")
public class PatientDao {
    private String id;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String sexe;
    private Integer numSecu;
}
