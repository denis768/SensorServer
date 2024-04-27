package org.example.spring.service;

import org.example.spring.domain.Sensor;
import java.util.List;

public interface SensorService {

    Sensor add(Sensor sensor);

    Sensor getById(long id);

    List<Sensor> getAll();

    void deleteById(long id);

    void deleteAll();
}
