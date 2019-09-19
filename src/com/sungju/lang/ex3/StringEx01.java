package com.sungju.lang.ex3;

public class StringEx01 {

	public static void main(String[] args) {
		
		String s1 = "나연,정연-모모-사나.미나%다현";  // , - . %
		
		s1 = s1.replace(',', '-');
		s1 = s1.replace('.', '-');
		s1 = s1.replace('%', '-');
		
		String[] names = s1.split("-");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
