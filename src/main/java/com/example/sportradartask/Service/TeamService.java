package com.example.sportradartask.Service;

import com.example.sportradartask.Models.Team;

import java.util.List;

public interface TeamService {

    List<Team> getTeamList();
    Team saveTeam(Team team);
}
