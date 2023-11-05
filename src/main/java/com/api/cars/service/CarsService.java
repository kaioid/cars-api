package com.api.cars.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.cars.entity.Car;

@Service
public class CarsService {

    private List<Car> cars = new ArrayList<>();

    public CarsService() {
        cars.add(new Car(1L, "Toyota", "Corolla", 2022));
        cars.add(new Car(2L, "Honda", "Civic", 2022));
    }

    public List<Car> listCars() {
        return cars;
    }
}
