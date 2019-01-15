package com.tinytongtong.thinkinjavapractice.chapter15.part07;

import java.util.ArrayList;

public class ErasedTypeEquivalence {

	public static void main(String[] args) {
		// ArrayList<T> 中的泛型被擦除了，变为ArrayList了
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1.getSimpleName());
		System.out.println(c2.getSimpleName());
		System.out.println(c1 == c2);

		Class<? extends ArrayList> c3 = new ArrayList<String>().getClass();
		Class<? extends ArrayList> c4 = new ArrayList<Integer>().getClass();
		System.out.println(c3.getSimpleName());
		System.out.println(c4.getSimpleName());
		System.out.println(c3 == c4);
	}

}
