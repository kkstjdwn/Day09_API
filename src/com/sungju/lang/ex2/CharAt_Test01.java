package com.sungju.lang.ex2;

import java.util.Scanner;

public class CharAt_Test01 {

	public void t3() {
		String str = "Hello Java World Company Low legacy";
		/**
		 * 소문자 'l' 이 몇개 있나요
		 */
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.lastIndexOf('l', i) == str.indexOf('l', i)) {
				count++;
			}

		}

		System.out.println("l의 갯수는 : " + count);
	}

	public void t3_while() {
		String str = "Hello Java World Company Low legacy";

		int index = 0;
		int count = 0;
		boolean check = true;

		while (check) {
			// (str.lastIndexOf('l', index)!=str.lastIndexOf('l', index+1))
			if (str.indexOf('l', index) != str.indexOf('l', index + 1)) {

				count++;
			}

			index++;

			if (index > str.length()) {

				check = false;
			}

		}

		System.out.println("l의 갯수는 : " + count);
	}

	public void t3_teacher() {
		String str = "Hello Java World Company Low legacy";

		int index = 0;
		int count = 0;
		boolean check = true;

		while (check) {
			System.out.println(index);
			index = str.indexOf('l', index);
			if (index == -1) {
				System.out.println(index);
				break;
			}

			index++;
			count++;

		}
		System.out.println("l의 갯수는 : " + count);

	}

	public void t4() {
		/**
		 * 파일명을입력 
		 * 이미지파일 : .jpg, .gif, .png, jpeg 
		 * 이미지 파일이다 / 아닙니다
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String file = sc.nextLine();
		// String subs = file.substring((file.lastIndexOf('.', file.length())+1),
		// file.length());
		// 처음에 length-4 부터 length 까지 ".jpg"로 찾았었음 그런데 그냥 substring(begin) 만 쓰면됨
		String subs = file.substring(file.lastIndexOf('.', file.length()) + 1);

		if (subs.equals("jpg") || subs.equals("gif") || subs.equals("png") || subs.equals("jpeg")) {

			System.out.println("이미지 파일입니다");

		} else {
			System.out.println("이미지 파일이 아닙니다");
		}

	}

	public void t2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("때려넣으세요");
		String input = sc.nextLine();
		int[] ar = new int[input.length()];
		for (int i = 0; i < input.length(); i++) {

			ar[i] = (int) (input.charAt(i)) + 2;
			System.out.print((char) ar[i]);
		}
	}

	public void t1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("때려넣으세요");
		String input = sc.nextLine();

		for (int i = 0; i < input.length(); i++) {

			System.out.println(input.charAt(i));

		}

	}

}
