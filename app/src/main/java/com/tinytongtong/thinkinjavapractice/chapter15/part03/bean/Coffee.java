package com.tinytongtong.thinkinjavapractice.chapter15.part03.bean;

public class Coffee {
	private static long counter = 0;
	private final long id = counter++;

	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}
}
