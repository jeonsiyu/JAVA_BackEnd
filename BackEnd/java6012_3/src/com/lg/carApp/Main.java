package com.lg.carApp;

import java.util.ArrayList;

import com.lg.carApp.car.Car;
import com.lg.carApp.cust.Customer;
import com.lg.carApp.util.RandData;

public class Main {
	// 고객 차량 관리 프로그램을 위한 클래스 정의
	public static void main(String[] args) {
		// 1. 차량 정보는 모델명:model, 색상:color,
		//    제조날짜:date, 제조사:company, 가격:price
		// 2. 매개변수가 있는 Car 클래스 생성자 추가
		// 3. Car 클래스 변수를 위한 getter/setter 추가
		// 4. Car 클래스 정보를 모두 출력하는 printCar() 추가
		// 5. 고객 정보는 고객명:name, 전화:tel, 주소:addr,
		//    고객이 구매한 차량: car
		// 6. Customer 클래스에서 getter/setter 추가
		// 7. 매개변수를 가지는 Customer 클래스 생성자 추가
		// 8. Customer 클래스 정보를 출력하는 printCust() 추가
		// 9. RandData 클래스에 임의의 차량 정보, 고객 정보를
		//    추가하여 사용
		// 10.100명의 고객이 구매한 차량정보를 출력.
		Customer[] cu = new Customer[100];
		RandData rr = new RandData();
		for (int i=0; i<cu.length; i++) {
			cu[i] = new Customer(rr.getName(),
					rr.getTel(), rr.getAddr(), 
					new Car(rr.getModel(), rr.getColor(),
							rr.getDate(), rr.getCompany(),
							rr.getPrice()));
			//System.out.println("번호:" + (i+1));
			//cu[i].printCust();
		}
		
		// ArrayList 컬렉션 클래스: 자료구조를 클래스 구현
		// <타입> 제네릭클래스: <>안에 모든 타입을 사용 가능		
		ArrayList<Customer> custList = new ArrayList<>();
		for (int i=0; i<100; i++) {
			custList.add(new Customer(rr.getName(),
					rr.getTel(), rr.getAddr(), 
					new Car(rr.getModel(), rr.getColor(),
							rr.getDate(), rr.getCompany(),
							rr.getPrice())));
			System.out.println("번호:" + (i+1));
			custList.get(i).printCust();
		}
	}
}
