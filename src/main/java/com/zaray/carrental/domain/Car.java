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
	
	@Id
	private Long carId;
	
	@Column
	private String carName;
	
	@Column
	private int carProductionYear;	
	
	@Column
	private long rentPrice;
	
	@Column
	private Boolean carIsAvailable;


	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
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

	public long getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(long rentPrice) {
		this.rentPrice = rentPrice;
	}

	public Boolean getCarIsAvailable() {
		return carIsAvailable;
	}

	public void setCarIsAvailable(Boolean carIsAvailable) {
		this.carIsAvailable = carIsAvailable;
	}


	
	
	
	
	

}
