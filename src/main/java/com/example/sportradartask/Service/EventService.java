package com.example.sportradartask.Service;

import com.example.sportradartask.Models.DTO.EventRequestDTO;
import com.example.sportradartask.Models.Event;

import java.util.List;

public interface EventService {

    List<Event> getEventList();
    Event saveEvent(EventRequestDTO event);
}
