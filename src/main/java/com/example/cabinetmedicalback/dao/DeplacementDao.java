package com.example.cabinetmedicalback.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Data
@NoArgsConstructor
@Document("deplacement")
public class DeplacementDao {
    @Id
    private String id;
    private Integer cout;
    private String date;
//    @DBRef
//    private PatientDao patient;
//    @DBRef
//    private List<InfirmierDao> infirmiers;

    public DeplacementDao(String id, Integer cout, String date){
        this.id = id;
        this.cout = cout;
        setDate();
    }

    public void setDate(){
        Date today = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        this.date = dateFormat.format(today);
    }
}

