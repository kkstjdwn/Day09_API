package com.sungju.lang;

public class StringTest {

	public static void main(String[] args) {

		// String str = new String("abc"); //원래는 이게 문법이 맞음
		// String str2 = "abc"; //primitive type처럼 사용 할 수 있게 편의성 패치해준것

		// String str = "hello";

		// System.out.println(str.charAt(4));

//		for (int i = 0; i < str.length(); i++) {
//			System.out.print(i + " : ");
//			System.out.println(str.indexOf('l', 2));
//
//		}
		
		
		
		String str = "Hello Java World Company Low legacy";
		str = str.replace('l', 'L');
		System.out.println(str);
		str = str.replace('L', 'l');
		System.out.println(str);
		
		str = str.replace("Java", "game");
		
		System.out.println(str);
		
		String str2 = str.substring(6,10);
		System.out.println(str2);
		
	}

}
