package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
    List<User> getAllEntities();

    User getEntityById(Long id);

    User createEntity(User entity);

    User updateEntity(Long id, User entity);

    void deleteEntity(Long id);
}