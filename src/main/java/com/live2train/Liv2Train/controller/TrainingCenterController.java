package com.live2train.Liv2Train.controller;

import com.live2train.Liv2Train.model.TrainingCenter;
import com.live2train.Liv2Train.repository.TrainingCenterRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/trainingcenters")
public class TrainingCenterController {

    @Autowired
    private TrainingCenterRepository trainingCenterRepository;

    @PostMapping("/create")
    public ResponseEntity<String> createTrainingCenter(@RequestBody TrainingCenter trainingCenter) {
        trainingCenterRepository.save(trainingCenter);
        return ResponseEntity.ok("Training center created successfully");
    }
    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> trainingCenters = trainingCenterRepository.findAll();
        return ResponseEntity.ok(trainingCenters);
    }
}
