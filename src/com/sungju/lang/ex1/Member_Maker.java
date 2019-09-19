package com.sungju.lang.ex1;

public class Member_Maker {

	private Member[] members;

	public Member_Maker() {
		members = new Member[3];
		members[0] = new Member();
		members[0].setId("id1");
		members[0].setPw("pw1");

		members[1] = new Member();
		members[1].setId("id2");
		members[1].setPw("pw2");

		members[2] = new Member();
		members[2].setId("id3");
		members[2].setPw("pw3");
	}

	public Member[] getMembers() {
		return members;
	}

}
