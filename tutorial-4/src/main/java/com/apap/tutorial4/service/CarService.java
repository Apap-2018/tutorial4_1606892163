package com.apap.tutorial4.service;

import java.util.List;
import java.util.Optional;

import com.apap.tutorial4.model.CarModel;

/**
 * CarService
 * @author rico.putra
 * @version 2/10/18
 */
public interface CarService {
	Optional<CarModel> getDetailCarById(Long id);
	
	void addCar(CarModel car);
	
	void deleteCarById(Long id);
	
	void updateCar(Long carId, CarModel carNew);
}
