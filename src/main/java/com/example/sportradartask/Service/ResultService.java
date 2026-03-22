package com.example.sportradartask.Service;

import com.example.sportradartask.Models.Result;
import com.example.sportradartask.Models.Sport;

import java.util.List;

public interface ResultService {

    List<Result> getResultList();
    Result saveResult(Result result);
}
