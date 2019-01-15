package com.tinytongtong.thinkinjavapractice.test;

public class ClassCastClassTest {

	public static void main(String[] args) {
		CastClass1 class1 = new CastClass1();

		CastClass1 class2 = new CastClass2();
		CastClass2 castClass2 = (CastClass2) class2;
		System.out.println(castClass2);//com.tiny.thinkinjava.test.CastClass2@7852e922

		/**
		 * Exception in thread "main" java.lang.ClassCastException:
		 * com.tiny.thinkinjava.test.CastClass1 cannot be cast to
		 * com.tiny.thinkinjava.test.CastClass2 at
		 * com.tiny.thinkinjava.test.ClassCastClassTest.main(ClassCastClassTest.java:7)
		 * 
		 */
		CastClass2 class3 = (CastClass2) class1;// 运行时异常

	}

}

class CastClass1 {

}

class CastClass2 extends CastClass1 {

}
