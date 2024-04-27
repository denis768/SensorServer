package org.example.spring.controller;

import lombok.RequiredArgsConstructor;
import org.example.spring.domain.Sensor;
import org.example.spring.service.SensorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SensorController {
    private final SensorService sensorService;

    @PostMapping("/sensor")
    public Sensor add(@RequestBody Sensor sensor) {
        return sensorService.add(sensor);
    }

    @GetMapping("/sensor/{id}")
    public Sensor getById(@PathVariable Long id) {
        return sensorService.getById(id);
    }


    @GetMapping("/sensor")
    public List<Sensor> getAll() {
        return sensorService.getAll();
    }

    @DeleteMapping("/sensor/{id}")
    public void deleteById(@PathVariable long id) {
        sensorService.deleteById(id);
    }

    @DeleteMapping("/sensor")
    public void deleteAll() {
        sensorService.deleteAll();
    }
}
