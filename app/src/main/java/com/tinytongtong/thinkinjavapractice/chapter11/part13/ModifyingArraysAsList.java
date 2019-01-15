package com.tinytongtong.thinkinjavapractice.chapter11.part13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ModifyingArraysAsList {
	public static void main(String[] args) {
		Random random = new Random(47);
		Integer[] ia1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list1 = new ArrayList<>(Arrays.asList(ia1));
		System.out.println("Before shuffling: " + list1);
		Collections.shuffle(list1, random);
		System.out.println("After shuffling: " + list1);
		System.out.println("arrays: " + Arrays.asList(ia1).toString());
		System.out.println();

		// 修改了底层数组的顺序
		Integer[] ia2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list2 = Arrays.asList(ia2);
		System.out.println("Before shuffling: " + list2);
		Collections.shuffle(list2, random);
		System.out.println("After shuffling: " + list2);
		System.out.println("arrays: " + Arrays.asList(ia2).toString());

	}
}
