package com.tinytongtong.thinkinjavapractice.chapter11.part13;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForeachCillections {
	public static void main(String[] args) {
		Collection<String> cs = new LinkedList<>();
		Collections.addAll(cs, "Take the long way home!".split(" "));
		for (String string : cs) {
			System.out.print("'" + string + "' ");
		}
	}
}
