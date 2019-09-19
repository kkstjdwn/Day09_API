package com.sungju.lang;

public class StringTest02 {
	
	public static void main(String[] args) {
		String str = "아이유 수지 설리 박보검";
		
		String[] name = str.split(" "); // 자르려고 하는 문자열
		
		for (int i = 0; i < name.length; i++) {
			//System.out.println(name[i]);
		}
		
		str = "AAWmdwDWPDAZSD";
		
		str = str.toLowerCase();
		
		System.out.println(str);
		
		str = str.toUpperCase();
		
		System.out.println(str);
		
		
		
	}
	
	

}
