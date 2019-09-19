package com.sungju.lang.ex1;

public class Member_Main {

	public static void main(String[] args) {

		Member_Login ml = new Member_Login();
		Member mem = ml.Login();

		if (mem.equals(null)) {
			System.out.println("로그인 실패");
			
		} else{
			System.out.println("로그인 성공");
			System.out.println(mem.getId());
		}
	}
}
