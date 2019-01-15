package com.tinytongtong.thinkinjavapractice.chapter11.part12;

import java.util.AbstractCollection;
import java.util.Iterator;

public class CollectionSequence extends AbstractCollection<String> {
	static String[] keys = new String[10];
	static {
		for (int i = 0; i < keys.length; i++) {
			keys[i] = "一无所有" + i;
		}
	}

	@Override
	public Iterator<String> iterator() {

		return new Iterator<String>() {
			private int index = 0;

			@Override
			public String next() {
				return keys[index++];
			}

			@Override
			public boolean hasNext() {

				return index < keys.length;
			}

			@Override
			public void remove() {//Not Implemented
				throw new UnsupportedOperationException();
			}
		};
	}

	@Override
	public int size() {
		return keys.length;
	}

	public static void main(String[] args) {
		CollectionSequence c = new CollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}
}
