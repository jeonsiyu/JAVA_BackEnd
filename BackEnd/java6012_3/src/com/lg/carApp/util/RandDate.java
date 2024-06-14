package com.lg.carApp.util;

import java.util.Random;

public class RandDate {
	String[] name = {"홍길동", "김길동", "박길동", "이길동", "최길동"};
	String[] tel = {"010-1234-5678", "010-4321-5678", "010-3478-1278", 
	         "010-4523-1978", "010-7890-2134"};
	String[] addr = {"대구시 동구 신암4동", "서울시 동구 신암4동",
	 "부산시 동구 신암4동", "인천시 동구 신암4동", "광주시 동구 신암4동"};
	
	String[] model = {"SM6", "쏘나타", "싼타페", "K7", "그랜져"};
	String[] color = {"검정", "은색", "흰색", "회색", "빨강"};
	String[] date = {"2022", "2023", "2020", "2021", "2024"};
	String[] company = {"르노", "기아", "현대", "벤츠", "BMW"};
	String[] price = {"3천만원", "4천만원", "5천만원", "6천만원", "7천만원"};
	
	Random r = new Random();
	
	public String getName() {
		return name[r.nextInt(name.length)];
	}
	
	public String getTel() {
		return tel[r.nextInt(tel.length)];
	}
	
	public String getAddr() {
		return addr[r.nextInt(addr.length)];
	}
	
	public String getModel() {
		return model[r.nextInt(model.length)];
	}
	
	public String getColor() {
		return color[r.nextInt(5)];
	}
	
	public String getDate() {
		return date[r.nextInt(5)];
	}
	
	public String getPrice() {
		return price[r.nextInt(5)];
	}
	
	public String getCompany() {
		return company[r.nextInt(5)];
	}

}
