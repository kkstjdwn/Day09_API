package com.sungju.lang.ex3;

public class CarView {
	
	/**
	 * carView() 생성
	 * Car 하나 받아서 모든 정보 출력
	 */
	
	public void carView(Car car) {
		System.out.println("구분선구분선구분구분구분선");
		System.out.println("제조사\t: " + car.getCompany());
		System.out.println("모델\t: " + car.getModel());
		System.out.println("컬러\t: " + car.getColor());
		
	}
	
	public void carView(Car[] car ) {
		
		for (int i = 0; i < car.length; i++) {
			this.carView(car[i]);
		}
	}

}
