package com.tinytongtong.thinkinjavapractice.chapter08.part02.polymorphism;

public class Sub extends Super{
	public int field = 1;
	public int getField(){
		return field;
	}
	public int getSuperField(){
		return super.field;
	}
	public DemoA a = new DemoA();
}
