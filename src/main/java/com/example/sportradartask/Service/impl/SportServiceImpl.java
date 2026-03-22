package com.example.sportradartask.Service.impl;

import com.example.sportradartask.Models.Sport;
import com.example.sportradartask.Repository.SportRepository;
import com.example.sportradartask.Service.SportService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class SportServiceImpl  implements SportService {

    private SportRepository sportRepository;
    @Override
    public List<Sport> getSportList() {
        return sportRepository.findAll();
    }

    @Override
    public Sport saveSport(Sport sport) {
        return sportRepository.save(sport);
    }
}
