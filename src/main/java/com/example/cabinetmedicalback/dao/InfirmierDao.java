package com.example.cabinetmedicalback.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("infirmier")
public class InfirmierDao {
    private String id;
    private String nom;
    private String prenom;
    private Integer numPro;
    private Integer telephone;
}
