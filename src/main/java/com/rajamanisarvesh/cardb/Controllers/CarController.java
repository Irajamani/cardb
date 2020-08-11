package com.rajamanisarvesh.cardb.Controllers;


import com.rajamanisarvesh.cardb.domain.Car;
import com.rajamanisarvesh.cardb.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/cars")
    public List<Car> getCars(){
        return (List<Car>) carRepository.findAll();
    }
}
