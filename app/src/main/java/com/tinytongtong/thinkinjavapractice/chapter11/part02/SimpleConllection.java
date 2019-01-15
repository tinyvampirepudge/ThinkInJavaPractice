package com.tinytongtong.thinkinjavapractice.chapter11.part02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class SimpleConllection {

	public static void main(String[] args) {
		// ArrayList
		Collection<Integer> c = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			c.add(i);
		}
		System.out.println("ArrayList start");
		for (Integer integer : c) {
			System.out.println(integer);
		}
		System.out.println("ArrayList end");
		//TreeSet
		c = new TreeSet<>();
		for (int i = 0; i < 10; i++) {
			c.add(i);
		}
		System.out.println("TreeSet start");
		for (Integer integer : c) {
			System.out.println(integer);
		}
		System.out.println("TreeSet end");
	}

}
