package com.tinytongtong.thinkinjavapractice.chapter11.part01;

import java.util.ArrayList;

/**
 * 通过使用泛型，就可以再编译期防止将错误类型的对象放置到容器中。
 * 比如说声明ArrayList<Apple>，其中尖括号括起来的事参数类型（可以有多个），
 * 它指定了这个容器实例可以保存的类型。
 * @author huaying
 *
 */
public class ApplesAndOrangesWithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Apple> apples = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			apples.add(new Apple());
		}
		//编译时异常：
		/**
		 * 编译器阻止你将Orange放置到apples中，因此它变成了一个编译期错误，而不再是运行时错误。
		 */
//		apples.add(new Orange());

		for (int i = 0; i < apples.size(); i++) {
			System.out.println("apples.get(i).id() --> "+apples.get(i).id());
		}
		for (Apple apple : apples) {
			System.out.println("apple.id() --> "+apple.id());
		}
	}

}
