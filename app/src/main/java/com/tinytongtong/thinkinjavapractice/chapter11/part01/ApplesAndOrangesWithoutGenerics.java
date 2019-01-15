package com.tinytongtong.thinkinjavapractice.chapter11.part01;

import java.util.ArrayList;

/**
 * ArrayList容器，不使用泛型来约束，会将Object类型的对象都存储进去。
 * 在取出数据的时候容易报错。
 * 
 * @author huaying
 *
 */
public class ApplesAndOrangesWithoutGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList apples = new ArrayList();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		//
		apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++) {
			((Apple)apples.get(i)).id();
			/**
			 * Exception in thread "main" java.lang.ClassCastException: com.tiny.thinkinjava.chapter11.part01.Orange cannot be cast to com.tiny.thinkinjava.chapter11.part01.Apple
	at com.tiny.thinkinjava.chapter11.part01.ApplesAndOrangesWithoutGenerics.main(ApplesAndOrangesWithoutGenerics.java:22)
			 */
		}
	}

}

class Apple{
	//计数器
	private static long counter;
	private final long id = counter++;
	public long id(){
		return id;
	}
}

class Orange{
	
}
