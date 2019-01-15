package com.tinytongtong.thinkinjavapractice.chapter11.part10;

public class Cat extends Pet {

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cat [getName()=" + getName() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
