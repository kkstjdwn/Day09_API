package com.sungju.lang.ex3;

public class StringEx02 {
	public static void main(String[] args) {
		CarView carView = new CarView();
		CarMaker carMaker = new CarMaker();
		
		
		Car car = carMaker.makeCar();
		// carView.carView(car);
		
		
		Car[] cars = carMaker.makeCars();
		
		carView.carView(cars);
		
		

	}
}
