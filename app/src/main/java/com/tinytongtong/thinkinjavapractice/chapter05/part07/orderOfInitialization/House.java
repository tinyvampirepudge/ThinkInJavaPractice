package com.tinytongtong.thinkinjavapractice.chapter05.part07.orderOfInitialization;

public class House {
	Window w1 = new Window(1);

	House() {
		// show that we are in the constructor
		System.out.println("House Constructor no params");
		w3 = new Window(33);
	}

	House(int i) {
		System.out.println("House Constructor with params");
		w2 = new Window(22);
	}

	Window w2 = new Window(2);// After constructor

	void f() {
		System.out.println("f()");
	}

	Window w3 = new Window(3);// At end
}
