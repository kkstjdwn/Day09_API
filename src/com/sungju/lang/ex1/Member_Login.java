package com.sungju.lang.ex1;

import java.util.Scanner;

public class Member_Login {

	public Member Login() {
		Scanner sc = new Scanner(System.in);
		Member_Maker mk = new Member_Maker();
		Member[] ar = mk.getMembers();
		Member ar2 = new Member();

		System.out.println("아이디를 입력하세요");
		String id = sc.next();
		System.out.println("패스워드를 입력하세요");
		String pw = sc.next();

		for (int i = 0; i < ar.length; i++) {

			if (id == ar[i].getId() && pw == ar[i].getPw()) {
				ar2.setId(id);
				ar2.setPw(pw);
				break;
			}
			System.out.println(ar[i].getId());
			System.out.println(ar2.getId());
			System.out.println(ar[i].getPw());
			System.out.println(ar2.getPw());
		}
		return ar2;
	}

}
