package com.zaray.carrental.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Order {
	
	@Id
	long orderId;
	
    @ManyToOne
    @JoinColumn(name = "user.userId")
	User ordererUserId;
    
    @ManyToOne
    @JoinColumn(name = "car.carId")
	Car orderedCar;
    
	long orderedDays;	
	long orderedPayment;
	
	public long countOrderedPayment(){
		return orderedDays*orderedCar.getRentPrice();
	}
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public User getOrdererUser() {
		return ordererUserId;
	}
	public void setOrdererUser(User ordererUser) {
		this.ordererUserId = ordererUser;
	}
	public Car getOrderedCar() {
		return orderedCar;
	}
	public void setOrderedCar(Car orderedCar) {
		this.orderedCar = orderedCar;
	}
	public long getOrderedDays() {
		return orderedDays;
	}
	public void setOrderedDays(long orderedDays) {
		this.orderedDays = orderedDays;
	}
	public long getOrderedPayment() {
		return orderedPayment;
	}
	public void setOrderedPayment(long orderedPayment) {
		this.orderedPayment = orderedPayment;
	}

	
}