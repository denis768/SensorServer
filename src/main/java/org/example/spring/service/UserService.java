package org.example.spring.service;

import org.example.spring.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User add(User user);

    List<User> getAll();

    Optional<User> getByEmail(String email);

    User update(User user);

    void deleteById(long id);

    void deleteAll();
}