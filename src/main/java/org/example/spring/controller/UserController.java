package org.example.spring.controller;

import lombok.RequiredArgsConstructor;
import org.example.spring.domain.User;
import org.example.spring.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public User add(@RequestBody User user) {
        return userService.add(user);
    }

    @GetMapping("/user")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/user/{id}")
    public User getById(@PathVariable long id) {
        return userService.getById(id);
    }

    @PutMapping("/user")
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteById(@PathVariable long id) {
        userService.deleteById(id);
    }

    @DeleteMapping("/user")
    public void deleteAll() {
        userService.deleteAll();
    }
}
// email, name, phone, photoUrl