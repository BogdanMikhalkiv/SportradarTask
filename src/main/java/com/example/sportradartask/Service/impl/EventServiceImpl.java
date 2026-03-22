package com.example.sportradartask.Service.impl;

import com.example.sportradartask.Models.Event;
import com.example.sportradartask.Repository.EventRepository;
import com.example.sportradartask.Service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;
    @Override
    public List<Event> getEventList() {
        return eventRepository.findAll();
    }

    @Override
    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }
}
