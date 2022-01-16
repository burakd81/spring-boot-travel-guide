package com.ttg.turkeytravelguide.service;

import com.ttg.turkeytravelguide.model.User;

import java.util.Optional;

public interface IUserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
