package com.example.sportradartask.Models.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventRequestDTO {
    private String eventStatus;
    private LocalTime eventTimeVenueUTC;
    private LocalDate eventDateVenue;

    private Long homeTeamId;
    private Long awayTeamId;
    private Long resultId;
    private Long sportId;
}
