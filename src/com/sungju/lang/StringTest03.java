package com.sungju.lang;

public class StringTest03 {
public static void main(String[] args) {
	String str1 = " iu";
	String str2 = "iu ";
	
	System.out.println(str1.trim().equals(str2.trim()));
	
	
	String n = String.valueOf(true);
	
	System.out.println(n);
	
	n = 10+""; // primitiveType + referenceType 형변환
}
}
