package com.tinytongtong.thinkinjavapractice.chapter08.part03.polymorphism.covariant_return;

public class Mill {
	Grain process(){
		return new Grain();
	}
}
