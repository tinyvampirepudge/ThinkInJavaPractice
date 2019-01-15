package com.tinytongtong.thinkinjavapractice.chapter11.part12;

import java.util.Iterator;

public class NoCollectionSequense extends PetSequence {
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
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args) {
		NoCollectionSequense nc = new NoCollectionSequense();
		InterfaceVsIterator.display(nc.iterator());
	}
}

class PetSequence {
	protected String[] keys = new String[] { "dandan", "dandan", "dandan", "dandan", "dandan", "dandan", "dandan",
			"dandan", "dandan", "dandan" };

}
