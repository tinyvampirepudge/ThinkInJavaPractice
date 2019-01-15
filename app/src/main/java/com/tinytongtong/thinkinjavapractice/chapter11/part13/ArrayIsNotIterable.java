package com.tinytongtong.thinkinjavapractice.chapter11.part13;

import java.util.Arrays;
/**
 * 
 * @author tiny
 *
 */
public class ArrayIsNotIterable {
	static <T> void test(Iterable<T> ib) {
		for (T t : ib) {
			System.out.print(t + " ");
		}
	}

	public static void main(String[] args) {
		test(Arrays.asList(1, 2, 3));
		System.out.println();
		String[] strings = { "A", "B", "C" };
		//数组可以使用foreach循环遍历，但是不是Iterable类型。
//		test(strings);
		//你必须显式的转换为Iterable类型。
		test(Arrays.asList(strings));
	}
}
