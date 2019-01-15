package com.tinytongtong.thinkinjavapractice.chapter08.part03.polymorphism.referenceCounting;

public class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	public Shared() {
		// TODO Auto-generated constructor stub
		System.out.println("Creating "+this);
	}
	public void addRef(){
		refcount++;
	}
	protected void dispose() {
		if (--refcount == 0) {
			System.out.println("Disposing " + this);
		}
	}
	
	public String toString(){
		return "Shared abc "+id;
	}

}
