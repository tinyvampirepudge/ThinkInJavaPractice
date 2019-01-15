package com.tinytongtong.thinkinjavapractice.chapter11.part10;

public class Pet {
	private String name;

	public Pet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + "]";
	}
	
}
