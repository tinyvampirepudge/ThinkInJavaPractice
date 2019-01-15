package com.tinytongtong.thinkinjavapractice.chapter15.part03;


import com.tinytongtong.thinkinjavapractice.util.Generator;

public class Fibonacci implements Generator<Integer> {
	private int count = 0;

	private int fib(int n) {
		if (n < 2) {
			return 1;
		}
		return fib(n - 2) + fib(n - 1);
	}

	@Override
	public Integer next() {
		return fib(count++);
	}

	public static void main(String[] args) {
		Fibonacci gen = new Fibonacci();
		for (int i = 0; i < 20; i++) {
			System.out.println(gen.next());
		}
	}

}
