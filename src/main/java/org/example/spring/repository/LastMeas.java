package org.example.spring.repository;

import org.example.spring.domain.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LastMeas extends JpaRepository<Sensor, Long> {
    Optional<Sensor> findTop1ByOrderByIdDesc();
}
