package com.tinytongtong.thinkinjavapractice.test;

import java.util.ArrayList;
import java.util.List;

public class TestClass1 {

	public static void main(String[] args) {
		// Integer
		// 未改变
		int i1 = 10;
		System.out.println("integer before --> " + i1);
		changeInteger(i1);
		System.out.println("integer after --> " + i1);

		// List<Integer>容器
		List<Integer> iList1 = new ArrayList<>();
		for (int j = 0; j < 5; j++) {
			iList1.add(j + 1);
		}
		System.out.println("integerList before --> " + iList1.toString());
		changeIntegerList(iList1);
		System.out.println("integerList after --> " + iList1.toString());

		// String
		String s1 = "王蛋蛋";
		System.out.println("string before --> " + s1);
		changeString(s1);
		System.out.println("string after --> " + s1);

		// List<Integer>容器
		List<String> sList1 = new ArrayList<>();
		for (int j = 0; j < 5; j++) {
			sList1.add(String.valueOf(j+i1));
		}
		System.out.println("stringList before --> " + sList1.toString());
		changeStringList(sList1);
		System.out.println("stringList after --> " + sList1.toString());
	}

	private static void changeInteger(int i) {
		i += (i + 1) * 100;
	}

	private static void changeIntegerList(List<Integer> iList) {
		for (int j = 0; j < 5; j++) {
			iList.add(j + 5);
		}
	}

	private static void changeString(String s) {
		s = "猫了个咪";
	}

	private static void changeStringList(List<String> sList) {
		for (int j = 0; j < 5; j++) {
			sList.add(String.valueOf(j + 5));
		}
	}
}
