package com.example.cabinetmedicalback.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("deplacement")
public class DeplacementDao {
    @Id
    private String Id;
    private Integer cout;
    private Date date;
//    @DBRef
//    private PatientDaopatient patient;
//    @DBRef
//    private List<InfirmierDao> infirmiers;
}
