package com.tinytongtong.thinkinjavapractice.chapter19.part01;

public enum OzWitch {
	// Instance must be defined first, before methods:
	earth(), south("猫了个咪"), west("猫了个咪", 28), north("猫了个咪", 28, true);

	private String name;
	private int age;
	private boolean isMale;

	private OzWitch() {
	}

	private OzWitch(String name) {
		this.name = name;
	}

	private OzWitch(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private OzWitch(String name, int age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isMale() {
		return isMale;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name() + ": " + "name=" + getName() + ",age=" + getAge() + ",isMale=" + isMale();
	}

	public static void main(String[] args) {
		for (OzWitch o : OzWitch.values()) {
			System.out.println(o);
		}
	}
}
