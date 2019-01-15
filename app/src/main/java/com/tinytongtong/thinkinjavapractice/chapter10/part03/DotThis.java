package com.tinytongtong.thinkinjavapractice.chapter10.part03;

public class DotThis {
	void f(){
		System.out.println("DotThis.f()");
	}
	public class Inner {
		public DotThis outer() {
			/**
			 * 在非静态内部类中生成外部类对象的引用
			 */
			return DotThis.this;
		}
	}
	
	public Inner inner(){
		return new Inner();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotThis dt = new DotThis();
		Inner dti = dt.inner();
		dti.outer().f();
	}

}
