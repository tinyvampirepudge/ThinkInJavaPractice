package com.tinytongtong.thinkinjavapractice.test.copy.copy1;

public class StrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "This is a test for immutable";
		String str2 = str1.substring(0, 8);
		System.out.println("print str1 : " + str1);
		System.out.println("print str1.hashCode() : " + str1.hashCode());
		System.out.println("print str2 : " + str2);
		System.out.println("print str2.hashCode() : " + str2.hashCode());
	}

}
