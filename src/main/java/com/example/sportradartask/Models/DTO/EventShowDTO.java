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
    private DayOfWeek eventDayOfTheWeek;
    private LocalDate eventDateVenue;
    private LocalTime eventTimeVenueUTC;
    private String sportName;
    private String homeTeamName;
    private String awayTeamName;
    private String result;


    public static List<EventShowDTO> toDTOList(List<Event> eventList){
        List<EventShowDTO> eventShowDTOS = eventList.stream()
                .map(event -> new EventShowDTO(
                        event.getEventId(),
                        event.getEventStatus(),
                        event.getEventDateVenue().getDayOfWeek(),
                        event.getEventDateVenue(),
                        event.getEventTimeVenueUTC(),
                        event.getEventSport().getSportName(),
                        event.getEventHomeTeam().getTeamName(),
                        event.getEventAwayTeam().getTeamName(),
                        event.getEventResult().getResultWinner()

                ))
                .toList();
        return eventShowDTOS;
    }
}
