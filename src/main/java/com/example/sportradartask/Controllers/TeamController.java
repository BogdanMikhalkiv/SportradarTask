package com.example.sportradartask.Controllers;


import com.example.sportradartask.Models.Team;
import com.example.sportradartask.Service.TeamService;
import com.example.sportradartask.Service.impl.TeamServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("api/v1/teams")
@AllArgsConstructor
public class TeamController {
    private final TeamService teamService;

//    public TeamController(TeamService teamService) {
//        this.teamService = teamService;
//    }

    @GetMapping
    String getTeams (Model model) {
        List<Team> teamList = teamService.getTeamList();

        model.addAttribute("primeList", teamList);

        return "index";
    }
}
