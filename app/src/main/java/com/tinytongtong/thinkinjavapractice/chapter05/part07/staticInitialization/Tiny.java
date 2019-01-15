package com.tinytongtong.thinkinjavapractice.chapter05.part07.staticInitialization;

public class Tiny {
	static String string = "tiny";

	public Tiny() {
		// TODO Auto-generated constructor stub
		System.out.println("Tiny constructor");
		showStr(string);
	}

	public Tiny(int marker) {
		System.out.println("Tiny constructor with marker --> " + marker);
		showStr(string);
	}

	void showStr(String str) {
		System.out.println("tiny string --> " + str);
	}

	static void t1(int marker) {
		System.out.println("t1 (" + marker + ")");
	}
}
