package com.sungju.lang;

public class Object_Test01 {

	public static void main(String[] args) {
		/**
		 * 클래스명(데이터타입) 변수명 = new 생성자호출;
		 * 
		 * 메서드 선언 공식
		 * 접근지정자 [그외지정자] 리턴타입 메서드명(매개변수,상수) { 콘솔 } 
		 */
		
		Object obj = new Object();
		
		obj.toString();
		
		// System.out.println(obj.toString());
		
		
		Member m1 = new Member();
		Member m2 = new Member();
		
		
		m1.age = 10;
		m1.num = 1;
		
		m2.age = 10;
		m2.num = 1;
		
//		System.out.println(m1);
//		System.out.println(m2);
		
		 System.out.println(m1.equals(m2));
		 
		 m1.toString();
		 System.out.println(m1);
		 
		 
		 int n1 = m1.hashCode();
		 
		 System.out.println(n1);
		 
		 System.out.println(String.CASE_INSENSITIVE_ORDER);
		

	}

}
