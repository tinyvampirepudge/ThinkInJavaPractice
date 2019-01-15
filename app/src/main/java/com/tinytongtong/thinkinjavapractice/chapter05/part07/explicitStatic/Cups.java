package com.tinytongtong.thinkinjavapractice.chapter05.part07.explicitStatic;

public class Cups {
	Cup c5 = new Cup(5);
	Cup c7;
	Cup c8;
	{
		c7 = new Cup(7);
		c8 = new Cup(8);
	}
	Cup c6 = new Cup(6);
	
	static Cup c3 = new Cup(3);
	
	static Cup c1;
	static Cup c2;
	

	public Cups() {
		// TODO Auto-generated constructor stub
		System.out.println("Cups()");
	}
	
	static Cup c4 = new Cup(4);
	
	static {
		c1 = new Cup(1);
		c2 = new Cup(2);
	}

	static void u(int marker) {
		System.out.println("u(" + marker + ")");
	}
}
