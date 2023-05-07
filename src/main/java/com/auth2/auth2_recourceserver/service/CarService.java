package com.auth2.auth2_recourceserver.service;

import com.auth2.auth2_recourceserver.domain.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();

    Car getCarById(Long id);

    Car saveCar(Car car);

    void deleteCar(Long id);
}