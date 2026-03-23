package com.example.sportradartask.Models.DTO;

import com.example.sportradartask.Models.Event;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventShowDTO {
    private Long eventId;
    private String eventStatus;
    private LocalTime eventTimeVenueUTC;
    private LocalDate eventDateVenue;
    private DayOfWeek dayOfTheWeek;

    private String homeTeamName;
    private String awayTeamName;
    private String result;
    private String sportName;


    public static List<EventShowDTO> toDTOList(List<Event> eventList){
        List<EventShowDTO> eventShowDTOS = eventList.stream()
                .map(event -> new EventShowDTO(
                        event.getEventId(),
                        event.getEventStatus(),
                        event.getEventTimeVenueUTC(),
                        event.getEventDateVenue(),
                        event.getEventDateVenue().getDayOfWeek(),
                        event.getEventHomeTeam().getTeamName(),
                        event.getEventAwayTeam().getTeamName(),
                        event.getEventResult().getResultWinner(),
                        event.getEventSport().getSportName()

                ))
                .toList();
        return eventShowDTOS;
    }
}
