package com.tinytongtong.thinkinjavapractice.chapter08.part02.polymorphism;

public class FieldAccess {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super sup = new Sub();
		System.out.println("sup.a = "+sup.a
				+",sup.getField() = "+sup.getField());
	}
}
