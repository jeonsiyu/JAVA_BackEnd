package com.lg.carApp.car;

public class Car {
	private String model;
	private String color;
	private String date;
	private String company;
	private String price;
	
	public Car(String model, String color, 
			String date, String company, String price) {
		super();
		this.model = model;
		this.color = color;
		this.date = date;
		this.company = company;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public void printCar() {
		System.out.println("모델:" + model);
		System.out.println("색상:" + color);
		System.out.println("제조날짜:" + date);
		System.out.println("제조사:" + company);
		System.out.println("가격:" + price);
		System.out.println("-------------------");
	}
}


