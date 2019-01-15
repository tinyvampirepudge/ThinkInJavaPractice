package com.tinytongtong.thinkinjavapractice.chapter15.part02;

import java.util.ArrayList;
import java.util.Random;

/**
 * 每次调用select()方法时，都会随机的返回List中的某个元素。
 * 
 * @author tiny
 *
 */
public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<>();
	private Random rand = new Random(47);

	public void add(T t) {
		storage.add(t);
	}

	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}

	public static void main(String[] args) {
		RandomList<String> randomList = new RandomList<>();
		for (String string : "The quick brown fox jumped over the lazy brown dow".split(" ")) {
			randomList.add(string);
		}

		for (int i = 0; i < 11; i++) {
			System.out.println(randomList.select());
		}
	}

}
