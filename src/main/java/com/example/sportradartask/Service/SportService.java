package com.example.sportradartask.Service;

import com.example.sportradartask.Models.Sport;
import com.example.sportradartask.Models.Team;

import java.util.List;

public interface SportService {

    List<Sport> getSportList();
    Sport saveSport(Sport sport);
}
