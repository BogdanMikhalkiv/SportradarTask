package com.example.sportradartask.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "Event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    private String eventStatus;
    private LocalTime eventTimeVenueUTC;
    private LocalDate eventDateVenue;

    @ManyToOne
    @JoinColumn(name = "homeTeamId_foreignkey", nullable = false)
    private Team eventHomeTeam;

    @ManyToOne
    @JoinColumn(name = "awayTeamId_foreignkey", nullable = false)
    private Team eventAwayTeam;

    @ManyToOne
    @JoinColumn(name = "resultId_foreignkey", nullable = false)
    private Result eventResult;

    @ManyToOne
    @JoinColumn(name = "sportId_foreignkey", nullable = false)
    private Sport eventSport;
}
