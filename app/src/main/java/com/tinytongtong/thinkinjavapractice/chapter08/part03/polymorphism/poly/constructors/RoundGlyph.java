package com.tinytongtong.thinkinjavapractice.chapter08.part03.polymorphism.poly.constructors;

public class RoundGlyph extends Glyph {

	private int radius = 1;

	public RoundGlyph(int r) {
		// TODO Auto-generated constructor stub
		this.radius = r;
		System.out.println("RoundGlyph.RoundGltph(), radius = " + radius);
	}

	void draw() {
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}
