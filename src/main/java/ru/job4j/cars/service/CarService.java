package ru.job4j.cars.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.cars.repository.CarRepository;

@Service
@AllArgsConstructor
public class CarService {

    private CarRepository carRepository;
}