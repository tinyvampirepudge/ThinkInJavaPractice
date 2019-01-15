package com.tinytongtong.thinkinjavapractice.chapter08.part03.polymorphism.covariant_return;

public class WheatMill extends Mill{
	Wheat process(){
		return new Wheat();
	}
}
