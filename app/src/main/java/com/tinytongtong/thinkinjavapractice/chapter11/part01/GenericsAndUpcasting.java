package com.tinytongtong.thinkinjavapractice.chapter11.part01;

import java.util.ArrayList;

/**
 * 泛型和向上转型
 * @author huaying
 *
 */
public class GenericsAndUpcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Apple> apples = new ArrayList<>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());
		for (Apple apple : apples) {
			System.out.println(apple);
		}
	}

}

class GrannySmith extends Apple{
	
}
class Gala extends Apple{
	
}
class Fuji extends Apple{
	
}
class Braeburn extends Apple{
	
}
