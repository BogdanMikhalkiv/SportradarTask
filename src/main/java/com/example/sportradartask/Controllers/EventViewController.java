package com.example.sportradartask.Controllers;

import com.example.sportradartask.Models.DTO.EventShowDTO;
import com.example.sportradartask.Models.Event;
import com.example.sportradartask.Service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("v1/events")
@AllArgsConstructor
public class EventViewController {

    private final EventService eventService;

    @GetMapping
    public String getEvents(Model model) {
        List<EventShowDTO> eventShowDTOS = eventService.getEventList();

        model.addAttribute("primeList", eventShowDTOS);

        return "index";
    }


}
