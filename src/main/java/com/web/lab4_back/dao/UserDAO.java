package com.web.lab4_back.dao;

import com.web.lab4_back.entity.User;
import com.web.lab4_back.exception.ServerException;

import java.util.Optional;

public interface UserDAO {
    Optional<User> findUserByUsername(String username);

    Optional<User> findUserById(long id);

    void saveUser(User user) throws ServerException;
}