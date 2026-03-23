package com.example.sportradartask.Service.impl;

import com.example.sportradartask.Models.DTO.EventRequestDTO;
import com.example.sportradartask.Models.DTO.EventShowDTO;
import com.example.sportradartask.Models.Event;
import com.example.sportradartask.Models.Result;
import com.example.sportradartask.Models.Sport;
import com.example.sportradartask.Models.Team;
import com.example.sportradartask.Repository.EventRepository;
import com.example.sportradartask.Repository.ResultRepository;
import com.example.sportradartask.Repository.SportRepository;
import com.example.sportradartask.Repository.TeamRepository;
import com.example.sportradartask.Service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;
    private TeamRepository teamRepository;
    private ResultRepository resultRepository;
    private SportRepository sportRepository;
    @Override
    public List<EventShowDTO> getEventList() {
        return EventShowDTO.toDTOList(eventRepository.findAll());
    }

    @Override
    public Event saveEvent(EventRequestDTO event) {
        Event eventObj = new Event();

        Optional<Team> awayT = teamRepository.findById(event.getAwayTeamId());
        Optional<Team> homeT = teamRepository.findById(event.getHomeTeamId());
        Optional<Result> result = resultRepository.findById(event.getResultId());
        Optional<Sport> sport = sportRepository.findById(event.getSportId());


        eventObj.setEventAwayTeam(awayT.get());
        eventObj.setEventHomeTeam(homeT.get());
        eventObj.setEventResult(result.get());
        eventObj.setEventSport(sport.get());
        eventObj.setEventStatus(event.getEventStatus());
        eventObj.setEventDateVenue(event.getEventDateVenue());
        eventObj.setEventTimeVenueUTC(event.getEventTimeVenueUTC());
        return eventRepository.save(eventObj);
    }
}
