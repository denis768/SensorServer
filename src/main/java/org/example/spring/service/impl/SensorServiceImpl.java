package org.example.spring.service.impl;

import org.example.spring.domain.Sensor;
import org.example.spring.repository.SensorRepository;
import org.example.spring.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SensorServiceImpl implements SensorService {

    private final SensorRepository repository;

    @Autowired
    public SensorServiceImpl(SensorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Sensor add(Sensor sensor) {
        return repository.save(sensor);
    }

    @Override
    public Sensor getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Sensor> getAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
