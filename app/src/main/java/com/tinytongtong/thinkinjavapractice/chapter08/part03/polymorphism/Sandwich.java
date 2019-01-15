package com.tinytongtong.thinkinjavapractice.chapter08.part03.polymorphism;

public class Sandwich extends Portable {
	private Bread bread = new Bread();
	private Cheese cheese = new Cheese();
	private Lettuce lettuce = new Lettuce();

	public Sandwich() {
		// TODO Auto-generated constructor stub
		System.out.println("Sandwich()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sandwich();
	}

}
