package com.example.sportradartask.Service.impl;

import com.example.sportradartask.Models.Result;
import com.example.sportradartask.Repository.ResultRepository;
import com.example.sportradartask.Service.ResultService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class ResultServiceImpl implements ResultService {

    private ResultRepository resultRepository;
    @Override
    public List<Result> getResultList() {
        return resultRepository.findAll();
    }

    @Override
    public Result saveResult(Result result) {
        return resultRepository.save(result);
    }
}
