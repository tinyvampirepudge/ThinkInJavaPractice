package com.tinytongtong.thinkinjavapractice.chapter08.part03.polymorphism.covariant_return;

public class CovariantReturn {

	public CovariantReturn() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mill mill = new Mill();
		Grain grain = mill.process();
		System.out.println(grain);
		mill = new WheatMill();
		grain = mill.process();
		System.out.println(grain);
	}

}
