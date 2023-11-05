package com.api.cars.controller;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.cars.entity.Car;
import com.api.cars.service.CarsService;

@RestController
@RequestMapping("/cars")
public class CarsController {
    @Autowired
    private CarsService carService;
    @Operation(summary = "List Cars", description = "Returns a list of cars")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Car List Successfully Returned"),
            @ApiResponse(responseCode = "500", description = "Internal error on the server")
    })
    @GetMapping
    public List<Car> listCars() {
        return carService.listCars();
    }
}
