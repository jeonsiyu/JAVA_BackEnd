package com.lg.carApp.cust;

import com.lg.carApp.car.Car;

public class Customer {
	private String name;
	private String tel;
	private String addr;
	private Car car;
	
	public Customer(String name, String tel, 
			String addr, Car car) {
		super();
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	public void printCust() {
		car.printCar();
		System.out.println("고객명:" + name);
		System.out.println("전화:" + tel);
		System.out.println("주소:" + addr);
		System.out.println("#######################");
	}
}

