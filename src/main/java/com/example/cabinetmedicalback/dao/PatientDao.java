package com.example.cabinetmedicalback.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("patient")
@AllArgsConstructor
@NoArgsConstructor
public class PatientDao {

    @Id
    private String id;
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private String sexe;
    private String adresse;
    private String numeroSecu;
    private Boolean isActive = true;

    @DBRef
    private InfirmierDao infirmier;

    @DBRef
    private DeplacementDao deplacement;

}
