package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;
import com.example.demo.model.User;

@RestController
@RequestMapping("/api/entities")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService service) {
        this.userService = service;
    }

    @GetMapping
    public List<User> getAllEntities() {
        return userService.getAllEntities();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getEntityById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User entity) {
        return userService.createEntity(entity);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User entity) {
        return userService.updateEntity(id, entity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.deleteEntity(id);
    }
}
