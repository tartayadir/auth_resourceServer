package com.auth2.auth2_recourceserver.service.impl;

import com.auth2.auth2_recourceserver.domain.entity.Car;
import com.auth2.auth2_recourceserver.domain.repository.CarRepository;
import com.auth2.auth2_recourceserver.exceptions.ResourceNotFoundException;
import com.auth2.auth2_recourceserver.service.CarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(Long id) {
        return carRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Car", "id", id));
    }

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}

