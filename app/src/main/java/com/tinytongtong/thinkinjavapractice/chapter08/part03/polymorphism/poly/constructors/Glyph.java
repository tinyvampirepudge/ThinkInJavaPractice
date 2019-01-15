package com.tinytongtong.thinkinjavapractice.chapter08.part03.polymorphism.poly.constructors;

public class Glyph {

	public Glyph() {
		// TODO Auto-generated constructor stub
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}

	void draw() {
		System.out.println("Glyph.draw()");
	}

}
