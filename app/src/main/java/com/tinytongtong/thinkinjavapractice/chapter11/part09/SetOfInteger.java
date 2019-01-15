package com.tinytongtong.thinkinjavapractice.chapter11.part09;

import java.util.HashSet;
import java.util.Random;

public class SetOfInteger {

	public static void main(String[] args) {
		Random random = new Random(47);
		HashSet<Integer> intset = new HashSet<>();
		for (int i = 0; i < 10000; i++) {
			intset.add(random.nextInt(30));
		}
		System.out.println(intset);
	}

}
