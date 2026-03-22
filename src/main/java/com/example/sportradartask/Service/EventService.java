package com.example.sportradartask.Service;

import com.example.sportradartask.Models.Event;
import com.example.sportradartask.Models.Result;

import java.util.List;

public interface EventService {

    List<Event> getEventList();
    Event saveEvent(Event event);
}
