package com.tinytongtong.thinkinjavapractice.chapter15.part01;

/**
 * 只能持有Automobile对象，重用性很差。
 * @author tiny
 *
 */
public class Holder1 {
	private Automobile a;

	public Holder1(Automobile a) {
		super();
		this.a = a;
	}

	public Automobile get() {
		return a;
	}
	
}

class Automobile{
	
}
