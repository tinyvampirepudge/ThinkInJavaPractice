package com.tinytongtong.thinkinjavapractice.test.copy.copy1;

public class StrClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloneC c1 = new CloneC();
		c1.str = new String("initializeStr");
		c1.strBuffer = new StringBuffer("initializeStrBuff");
		System.out.println("before clone, c1.str = " + c1.str);
		System.out.println("before clone, c1.strBuffer = " + c1.strBuffer);

		CloneC c2 = (CloneC) c1.clone();
		c2.str = c2.str.substring(0, 5);
		c2.strBuffer = c2.strBuffer.append("change strBuffer clone");
		System.out.println("-------------------------------");
		System.out.println("after clone, c1.str = " + c1.str);
		System.out.println("after clone, c1.strBuffer = " + c1.strBuffer);
		System.out.println("-------------------------------");
		System.out.println("after clone, c2.str = " + c2.str);
		System.out.println("after clone, c2.strBuffer = " + c2.strBuffer);
		System.out.println("-------------------------------");
	}

}
