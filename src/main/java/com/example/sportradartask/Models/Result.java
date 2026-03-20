package com.example.sportradartask.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "Result")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resultId;

    private Integer resultHomeGoals;
    private Integer resultAwayGoals;
    private String resultWinner;

    @OneToMany(mappedBy = "eventResult",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Event> events;
}
