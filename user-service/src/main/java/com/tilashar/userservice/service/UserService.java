package com.tilashar.userservice.service;

import com.tilashar.userservice.model.Role;
import com.tilashar.userservice.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
}