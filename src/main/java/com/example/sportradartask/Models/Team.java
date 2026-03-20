package com.example.sportradartask.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Team")
public class Team {

    @Id
    @GeneratedValue
    private Long teamId;

    private String teamName;
}
