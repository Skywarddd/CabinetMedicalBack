package com.example.cabinetmedicalback.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("infirmiers")
public class InfirmierDao {

    @Id
    private String id;
    private String nom;
    private String prenom;
    private Integer numPro;
    private String telMobile;
    private String telFixe;
    private boolean isActive = true;

    //uncomment pour utiliser la liste de patients en DBRef
//    @DBRef
//    private List<PatientDAO> patients;
}
