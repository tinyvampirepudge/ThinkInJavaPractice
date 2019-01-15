package com.tinytongtong.thinkinjavapractice.chapter08.part03.polymorphism.referenceCounting;

public class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;

	public Composing(Shared shared) {
		// TODO Auto-generated constructor stub
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	
	protected void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}
	
	public String toString(){
		return "Composing def " + id;
	}

}
