package com.live2train.Liv2Train.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.live2train.Liv2Train.model.TrainingCenter;
import com.live2train.Liv2Train.repository.TrainingCenterRepository;

import java.util.List;

@Service
public class TrainingCenterService {

	@Autowired
    private TrainingCenterRepository repository;

    public TrainingCenter createTrainingCenter(TrainingCenter trainingCenter) {
        return repository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
