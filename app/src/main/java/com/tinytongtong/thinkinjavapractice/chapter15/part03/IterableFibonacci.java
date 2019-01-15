package com.tinytongtong.thinkinjavapractice.chapter15.part03;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
	private int n;

	public IterableFibonacci(int count) {
		this.n = count;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				return n > 0;
			}

			@Override
			public Integer next() {
				n--;
				return IterableFibonacci.this.next();
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		// 如果要在循环语句中使用IterableFibonacci，必须向IterableFibonacci的构造器提供一个边界值，然后hasNext()方法才能知道何时该返回false.
		for (int i : new IterableFibonacci(18)) {
			System.out.println(i);
		}
	}

}
