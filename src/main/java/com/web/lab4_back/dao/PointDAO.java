package com.web.lab4_back.dao;


import com.web.lab4_back.entity.Point;
import com.web.lab4_back.exception.ServerException;

import java.util.List;

public interface PointDAO {
     void savePoint(Point point) throws ServerException;

     List<Point> getPointsByUserId(Long userId);

     void deletePointsByUserId(Long userId);

     List<Point> getPointsByUserId(Long userId, int page, int size);
}