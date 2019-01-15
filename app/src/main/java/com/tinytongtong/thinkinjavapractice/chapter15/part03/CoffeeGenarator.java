package com.tinytongtong.thinkinjavapractice.chapter15.part03;

import com.tinytongtong.thinkinjavapractice.chapter15.part03.bean.Americano;
import com.tinytongtong.thinkinjavapractice.chapter15.part03.bean.Breve;
import com.tinytongtong.thinkinjavapractice.chapter15.part03.bean.Cappuccino;
import com.tinytongtong.thinkinjavapractice.chapter15.part03.bean.Coffee;
import com.tinytongtong.thinkinjavapractice.chapter15.part03.bean.Latte;
import com.tinytongtong.thinkinjavapractice.chapter15.part03.bean.Mocha;
import com.tinytongtong.thinkinjavapractice.util.Generator;

import java.util.Iterator;
import java.util.Random;


public class CoffeeGenarator implements Generator<Coffee>, Iterable<Coffee> {

	private Class[] types = { Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class };

	private static Random random = new Random(47);

	public CoffeeGenarator() {

	}

	// for iteration:
	private int size = 0;

	public CoffeeGenarator(int size) {
		this.size = size;
	}

	@Override
	public Coffee next() {
		try {
			return (Coffee) types[random.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	class CoffeeIterator implements Iterator<Coffee> {
		int count = size;

		@Override
		public boolean hasNext() {
			return count > 0;
		}

		@Override
		public Coffee next() {
			count--;
			return CoffeeGenarator.this.next();
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}

	public static void main(String[] args) {
		CoffeeGenarator gen = new CoffeeGenarator();
		for (int i = 0; i < 5; i++) {
			System.out.println(gen.next());
		}

		for (Coffee coffee : new CoffeeGenarator(5)) {
			System.out.println(coffee);
		}
	}

}
