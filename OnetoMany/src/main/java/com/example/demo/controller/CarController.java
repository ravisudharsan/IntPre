package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.repo.CarRepo;

@RestController
public class CarController {

	@Autowired
	CarRepo cr;

	@PostMapping("/send")
	public Car sending(@RequestBody Car c) {

		return cr.save(c);

	}
	
	@GetMapping("/get")
	public List<Car> getAll(){
		return cr.getAllCars();
	}

}
