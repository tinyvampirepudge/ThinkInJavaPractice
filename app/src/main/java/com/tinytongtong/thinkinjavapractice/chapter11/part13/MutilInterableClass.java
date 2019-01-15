package com.tinytongtong.thinkinjavapractice.chapter11.part13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MutilInterableClass extends IterableClass {

	public Iterable<String> reversed() {
		return new Iterable<String>() {

			@Override
			public Iterator<String> iterator() {
				return new Iterator<String>() {
					private int current = words.length - 1;

					@Override
					public boolean hasNext() {
						return current > -1;
					}

					@Override
					public String next() {
						return words[current--];
					}

					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}

	public Iterable<String> randomed() {
		return new Iterable<String>() {

			@Override
			public Iterator<String> iterator() {
				List<String> shuffled = new ArrayList<>(Arrays.asList(words));
				// 随机打乱一个数组
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}

	public static void main(String[] args) {
		MutilInterableClass mic = new MutilInterableClass();
		for (String s : mic.reversed()) {
			System.out.print(s + " ");
		}
		System.out.println();
		for (String string : mic.randomed()) {
			System.out.print(string+ " ");
		}
		System.out.println();
		for (String string : mic) {
			System.out.print(string + " ");
		}
		System.out.println();
	}

}
