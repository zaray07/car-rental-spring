package com.zaray.carrental.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
	
	public Car () {
		this.carIsAvailable = true;
	}
	
	@GeneratedValue
	@Id
	private int carId;
	
	@Column
	private String carName;
	
	@Column
	private int carProductionYear;	
	
	@Column
	private double rentPrice;
	
	@Column
	private Boolean carIsAvailable;


	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarProductionYear() {
		return carProductionYear;
	}

	public void setCarProductionYear(int carProductionYear) {
		this.carProductionYear = carProductionYear;
	}

	public double getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}

	public Boolean getCarIsAvailable() {
		return carIsAvailable;
	}

	public void setCarIsAvailable(Boolean carIsAvailable) {
		this.carIsAvailable = carIsAvailable;
	}


	
	
	
	
	

}
