package org.example.spring.service;

import org.example.spring.domain.Sensor;
import org.example.spring.repository.LastMeas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LastMeasService {
    @Autowired
    private LastMeas repository;

    public Sensor getLastData() {
        return repository.findTop1ByOrderByIdDesc().orElse(null);
    }
}
