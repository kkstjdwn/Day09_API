package com.sungju.lang.ex3;

public class CarMaker {
	
	private String carinfo;
	
	public CarMaker() {
		carinfo = "Kia,K7,Black,Audi,Q3,Silver,Benz,S300,Red,Bmw,E-class,HotPink";
	
	}
	
	/**
	 * makeCar()
	 * carinfo 문자열 --> Car 객체 리턴
	 */
	
	
	public Car makeCar( ) {
		// CarMaker c1 = new CarMaker();  this 쓰면됨 제발
		Car newcar = new Car();
		
		String[] carr = new String[3];
		carr = this.getCarinfo().split(",");
		newcar.setCompany(carr[0]);
		newcar.setModel(carr[1]);
		newcar.setColor(carr[2]);
		
		return newcar;
	}
	
	/**
	 * makeCars
	 * Car들을 리턴
	 */
	
	public Car[] makeCars() {
		
		String[] ar = this.carinfo.split(",");
		
		Car[] cars = new Car[ar.length/3];
		int count=0;
		
		for (int i = 0; i < ar.length; i++) {
//			cars[i].setCompany(ar[i]);
//			cars[i].setModel(ar[i+1]);
//			cars[i].setColor(ar[i+2]); 이렇게 하면 nullpointerexception 뜸. if("abc".equals(String abc)) 기억할것
			
			Car car = new Car();
			car.setCompany(ar[i]); 
			car.setModel(ar[i+1]); 
			car.setColor(ar[i+2]); 
			i+=2; // i = i+2;
			cars[/*count*/ i/3 ] = car;  // 2/3 = 0, 5/3 = 1, 8/3 = 2 int값이니까
			//count++;
		}
		
		return cars;
	}

	public String getCarinfo() {
		return carinfo;
	}

	public void setCarinfo(String carinfo) {
		this.carinfo = carinfo;
	}

}
