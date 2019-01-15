package com.tinytongtong.thinkinjavapractice.chapter05.part07.staticInitialization;

public class Cuboard {
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);

	public Cuboard() {
		// TODO Auto-generated constructor stub
		System.out.println("Cuboard");
		bowl4.f1(2);
	}

	void f3(int marker) {
		System.out.println("f3 (" + marker + ")");
	}
	static Bowl bowl5 = new Bowl(5);
}
