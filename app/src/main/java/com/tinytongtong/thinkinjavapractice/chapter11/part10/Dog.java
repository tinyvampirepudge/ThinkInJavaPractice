package com.tinytongtong.thinkinjavapractice.chapter11.part10;

public class Dog extends Pet {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dog [getName()=" + getName() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
