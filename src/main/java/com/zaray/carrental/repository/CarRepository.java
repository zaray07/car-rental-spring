package com.zaray.carrental.repository;

import org.springframework.data.repository.CrudRepository;
import com.zaray.carrental.domain.Car;

public interface CarRepository extends CrudRepository<Car, Long> {

}
