package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Car;

public interface CarRepo extends JpaRepository<Car, Integer> {
	
	@Query(value = "select * from car inner join engine on car.id=engine.id", nativeQuery = true)
	public List<Car> getAllCars();
	

}
