package com.example.sportradartask.Service.impl;

import com.example.sportradartask.Models.Team;
import com.example.sportradartask.Repository.TeamRepository;
import com.example.sportradartask.Service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class TeamServiceImpl  implements TeamService {

    private TeamRepository teamRepository;

    @Override
    public List<Team> getTeamList() {
        return teamRepository.findAll();
    }

    @Override
    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }
}
