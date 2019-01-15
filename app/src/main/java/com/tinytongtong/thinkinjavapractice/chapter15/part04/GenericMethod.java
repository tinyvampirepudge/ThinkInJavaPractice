package com.tinytongtong.thinkinjavapractice.chapter15.part04;

public class GenericMethod {

	public <T> void f(T t) {
		System.out.println(t.getClass().getName());
	}

	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		gm.f((byte) 1);
		gm.f((short) 1);
		gm.f(1);
		gm.f(123123L);
		gm.f(1.1f);
		gm.f(1.1D);
		gm.f("String");
		gm.f('c');
		gm.f(gm);
		gm.f(new Object());

		String string = "sfa";
		string = null;
		System.out.println(string instanceof String);

	}

}
