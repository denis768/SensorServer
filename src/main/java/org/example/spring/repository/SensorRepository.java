package org.example.spring.repository;

import org.example.spring.domain.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {
}
