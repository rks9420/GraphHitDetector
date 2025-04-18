package com.web.lab4_back.service;

import com.web.lab4_back.entity.Point;
import com.web.lab4_back.exception.ServerException;
import com.web.lab4_back.exception.UserNotFoundException;

import java.util.List;

public interface PointService {
    List<Point> getAllPointsById(Long id) throws ServerException, UserNotFoundException;

    List<Point> getAllPointsById(Long id, int page, int size) throws IllegalArgumentException, UserNotFoundException;

    void savePoint(Long userId, double x, double y, double r, boolean inArea) throws ServerException, UserNotFoundException, IllegalArgumentException;

    void deletePointsByUserId(Long id) throws UserNotFoundException;
}
