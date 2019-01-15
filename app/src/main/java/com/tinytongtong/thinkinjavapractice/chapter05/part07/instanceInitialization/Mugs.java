package com.tinytongtong.thinkinjavapractice.chapter05.part07.instanceInitialization;

public class Mugs {
	Mug c1;
	Mug c2;
	{
		c1 = new Mug(1);
		c2 = new Mug(2);
		System.out.println("c1 & c2 initialized");
	}

	public Mugs() {
		// TODO Auto-generated constructor stub
		System.out.println("Mugs()");
	}

	public static void main(String[] args) {
		System.out.println("inside main");
		m();
//		Mugs xMugs = new Mugs();
	}
	
	static void m(){
		System.out.println("mmm");
	}

}
