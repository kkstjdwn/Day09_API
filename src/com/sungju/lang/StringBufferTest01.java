package com.sungju.lang;

public class StringBufferTest01 {
	public static void main(String[] args) {
		String str1 = "iu";
		String str2 = "choa";
		str1 = str1 + str2;
		
		StringBuffer sb = new StringBuffer();
		sb.append("iu");
		sb.append("choa");
		
		System.out.println(sb);
		
		str1 = sb.toString();
		System.out.println(str1);
	}

}
