package com.web.lab4_back.service;

import com.web.lab4_back.exception.InvalidCredentialsException;
import com.web.lab4_back.exception.ServerException;
import com.web.lab4_back.exception.UserExistsException;
import com.web.lab4_back.exception.UserNotFoundException;

public interface AuthService {
    String[] signupUser(String username, String password, String email) throws UserExistsException, ServerException, UserNotFoundException;

    String[] loginUser(String username, String password)
            throws UserNotFoundException, InvalidCredentialsException, ServerException;

    void logoutUser(String username, String password)
            throws UserNotFoundException, InvalidCredentialsException, ServerException;
}
