package com.sungju.lang02;

import java.util.Scanner;

public class WrapperTest02 {

	public static void main(String[] args) {
		/**
		 * 회원가입 pw스캐너 입력 
		 * 최소8글자 이상 
		 * 대문자2개 이상 
		 * 소문자2개 이상 
		 * 숫자1개이상 
		 * 공백은 없어야함
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("비밀번호 정하셈");
		String pw = sc.next();
		boolean check = false;
		int da = 0;
		int so = 0;
		int su = 0;
		int ws = 0;

		for (int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
			da = Character.isUpperCase(ch) ? da++ : da;
			so = Character.isLowerCase(ch) ? so++ : so;
			su = Character.isDigit(ch) ? su++ : su;
			ws = Character.isWhitespace(ch) ? ws++ : ws;

		}

		if (pw.length() > 7 && da > 1 && so > 1 && su > 0 && ws == 0) {
			check = true;
		}

		if (check) {
			System.out.println("비밀번호생성");
		} else {
			System.out.println("다시설정");
		}

	}

}
