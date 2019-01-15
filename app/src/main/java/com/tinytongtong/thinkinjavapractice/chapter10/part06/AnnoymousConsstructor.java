package com.tinytongtong.thinkinjavapractice.chapter10.part06;

public class AnnoymousConsstructor {
	
	public static Base getBase(int i){
		return new Base(i) {
			
			{
				System.out.println("Inside instance initializer");
			}
			
			@Override
			public void f() {
				// TODO Auto-generated method stub
				System.out.println("In annoymous f()");
			}
		};
	}
	
	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}
}

abstract class Base{

	public Base(int i) {
		System.out.println("Base constructor, i = " + i);
	}
	
	public abstract void f();
}