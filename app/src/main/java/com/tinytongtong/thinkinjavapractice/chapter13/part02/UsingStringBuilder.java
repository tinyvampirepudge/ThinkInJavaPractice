package com.tinytongtong.thinkinjavapractice.chapter13.part02;

import java.util.Random;

/**
 * toString方法中使用循环，自己创建一个StringBuilder
 * @author tiny
 *
 */
public class UsingStringBuilder {
	public static Random random = new Random(47);
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		for (int i = 0; i < 25; i++) {
			result.append(random.nextInt(100));
			result.append(", ");
		}
		result.delete(result.length()-2, result.length());
		result.append("]");
		return result.toString();
	}
	
	public static void main(String[] args) {
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);

	}

}
