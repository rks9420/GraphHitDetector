package com.web.lab4_back.dao;

import com.web.lab4_back.exception.ServerException;

import java.util.Optional;

public interface TokenDAO {
    void saveRefreshToken(Long userId, String refreshToken) throws ServerException;
    void deleteRefreshTokenByUserId(Long userId);
    Optional<String> findRefreshTokenByUserId(Long userId);
}