package com.example.sportradartask.Controllers;

import com.example.sportradartask.Models.Event;
import com.example.sportradartask.Service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2/events")
@AllArgsConstructor
public class EventRestController {

    private final EventService eventService;

    @PostMapping("add_event")
    public Event saveEvent(@RequestBody Event event) {
        return eventService.saveEvent(event);
    }

}
