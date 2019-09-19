package com.sungju.lang;

public class Member {
	
	int age;
	int num;
	
	@Override
	public String toString() {
		System.out.println(this.age);
		System.out.println(this.num);
		return "";
	}
	
	@Override
	public boolean equals(Object obj) {

//		Member m1 = new Member();
//		m1=(Member)obj;
//		m1.age == this.age;
		
		boolean check = this.age==((Member)obj).age && this.num == ((Member)obj).num; // 연산자의 우선순위 . > 형변환
		return check;
	}

}
