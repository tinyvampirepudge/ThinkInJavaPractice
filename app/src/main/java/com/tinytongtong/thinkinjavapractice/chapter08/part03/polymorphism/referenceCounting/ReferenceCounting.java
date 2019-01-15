package com.tinytongtong.thinkinjavapractice.chapter08.part03.polymorphism.referenceCounting;

public class ReferenceCounting {

	public ReferenceCounting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared shared = new Shared();
		Composing[] composings = {
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared)
		};
		
		for(Composing c:composings){
			c.dispose();
		}
	}

}
