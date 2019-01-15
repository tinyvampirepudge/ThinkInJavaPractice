package com.tinytongtong.thinkinjavapractice.test.copy.copy1;

public class ObjPassvalue {
	public static void main(String[] args) {
		PassObj objA = new PassObj();
		PassObj objB = objA;
		objA.string = "changed in objA";
		System.out.println("Print objB.string value:" + objB.string);
	}
}
