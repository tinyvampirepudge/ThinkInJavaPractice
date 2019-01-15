package com.tinytongtong.thinkinjavapractice.chapter11.part13;

import java.util.Arrays;

public class AdapterMethodIdiom {

	public static void main(String[] args) {
		ReversibleArrayList<String> reversibleArrayList = new ReversibleArrayList<>(Arrays.asList("I am a student".split(" ")));
		for (String string : reversibleArrayList) {
			System.out.print(string + " ");
		}
		System.out.println();
		for (String string : reversibleArrayList.reversed()) {
			System.out.print(string +" ");
		}
	}

}
