package com.example.cabinetmedicalback.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;
import java.util.Date;

@Data
@AllArgsConstructor
@Document("deplacement")
public class DeplacementDao {
    @Id
    private String id;
    private int cout;
    private Date date;

    public DeplacementDao(){
        createDate();
    }
    public DeplacementDao(String id, Integer cout, Date date){
        this();
        this.id = id;
        this.cout = cout;
        this.date = date;
    }

    public void createDate(){
        this.date = Calendar.getInstance().getTime();
    }
}

