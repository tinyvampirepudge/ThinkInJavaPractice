package com.tinytongtong.thinkinjavapractice.chapter05.part07.staticInitialization;

public class Table {
	static Bowl bowl1 = new Bowl(1);

	Table() {
		System.out.println("Table()");
		bowl2.f1(1);
	}

	void f2(int marker) {
		System.out.println("f2 (" + marker + ")");
	}

	static Bowl bowl2 = new Bowl(2);

	static void t1() {
		System.out.println("Table static method");
	}

	static String t2(String string) {
		System.out.println("Table static field --> " + string);
		return string;
	}
}
