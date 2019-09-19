package com.sungju.lang02;

public class WrapperTest01 {
	public static void main(String[] args) {
		int num = 10;
		
		
		System.out.println(Integer.BYTES); //할당
		System.out.println(Long.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE); // 4x8 = 32bit
		System.out.println(Long.MAX_VALUE);
		//Integer integer = new Integer(); default 생성자가 없음
		Integer integer = new Integer(10);
		Integer integer2 = new Integer("10");
		// integer = new Integer("one"); 숫자형태의 문자열만 가능
		System.out.println("구분선구분선구분구분구분선");
		int n1 = integer.intValue();
		int n2 = integer2.intValue();
		
		System.out.println(n1+n2); 
		
		n1 = integer; //됨;;		AutoUnBoxing
		integer = n1; //얘도됨;; primitive-->reference 포장 AutoBoxing
		
		double a = 3.14;
		// integer = a; 얘는 안됨 ㅎ
		Double b = a;	// AutoBoxing
		b = (double)n1;	// UnBoxing
		
		int n = Integer.parseInt("10");
		String s = "2.456";
		double d = Double.parseDouble(s);

	}

}
