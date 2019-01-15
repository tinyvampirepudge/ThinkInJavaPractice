package com.tinytongtong.thinkinjavapractice.chapter05.part07.explicitStatic;

public class ExplicitStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside main");
//		Cups.c1.f(99);
//		Cups.u(110);
		System.out.println("Long.MIN_VALUE --> "+Long.MIN_VALUE);
		System.out.println("Long.MAX_VALUE --> "+Long.MAX_VALUE);
		System.out.println("Float.MIN_VALUE --> "+Float.MIN_VALUE);
		System.out.println("Float.MAX_VALUE --> "+Float.MAX_VALUE);
		
		if (Float.MAX_VALUE > Long.MAX_VALUE) {
			System.out.println("Float.MAX_VALUE > Long.MAX_VALUE");
		}else{
			System.out.println("Float.MAX_VALUE < Long.MAX_VALUE");
		}
	}

	static Cups xCups = new Cups();
//	static Cups yCups = new Cups();
}
