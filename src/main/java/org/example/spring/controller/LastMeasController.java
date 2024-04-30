package org.example.spring.controller;

import org.example.spring.domain.Sensor;
import org.example.spring.service.LastMeasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LastMeasController {
    @Autowired
    private LastMeasService service;

    @GetMapping("/last-data")
    public ResponseEntity<Sensor> getLastData() {
        Sensor entity = service.getLastData();
        return ResponseEntity.ok(entity);
    }
}
