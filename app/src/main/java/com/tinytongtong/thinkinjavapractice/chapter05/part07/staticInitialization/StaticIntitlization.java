package com.tinytongtong.thinkinjavapractice.chapter05.part07.staticInitialization;

public class StaticIntitlization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table.t1();
		System.out.println("Creating new Cupboard() in main");
		new Cuboard();
		System.out.println("Creating new Cupboard() in main");
		new Cuboard();
		table.f2(1);
		cuboard.f3(1);
		
//		Tiny tiny = new Tiny(2);
//		Tiny.t1(123);
	}
	
//	static String string  = Table.t2("static field in main");
	
	static Table table = new Table();
	static Cuboard cuboard = new Cuboard();
	
	static int i;
	static{
		i = 47;
	}
	
}