package com.example.sportradartask.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Sport")
public class Sport {

    @Id
    @GeneratedValue
    private Long sportId;

    private String sportName;



}
