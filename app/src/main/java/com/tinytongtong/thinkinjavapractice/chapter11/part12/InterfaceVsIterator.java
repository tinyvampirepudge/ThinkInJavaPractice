package com.tinytongtong.thinkinjavapractice.chapter11.part12;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InterfaceVsIterator {

	public static void display(Iterator<String> it) {
		System.out.println("display(Iterator<String> it) start");
		while (it.hasNext()) {
			String s = it.next();
			System.out.println("Iterator s: " + s);
		}
		System.out.println("display(Iterator<String> it) end");
	}

	public static void display(Collection<String> strs) {
		System.out.println("display(Collection<String> strs) start");
		for (String string : strs) {
			System.out.println("Collection s: " + string);
		}
		System.out.println("display(Collection<String> strs) end");
	}

	public static void main(String[] args) {
		String[] keys = new String[10];
		for (int i = 0; i < keys.length; i++) {
			keys[i] = "dandan" + i;
		}
		String[] values = new String[10];
		for (int i = 0; i < values.length; i++) {
			values[i] = "tongtong" + i;
		}
		List<String> petList = Arrays.asList(keys);
		Set<String> petSet = new HashSet<>(petList);
		Map<String, String> petMap = new LinkedHashMap<>();
		for (int i = 0; i < keys.length; i++) {
			petMap.put(keys[i], values[i]);
		}
		
		display(petList);
		display(petSet);
		display(petList.iterator());
		display(petSet.iterator());
		System.out.println(petMap);
		System.out.println(petMap.keySet());
		display(petMap.keySet());
		display(petMap.keySet().iterator());
		display(petMap.values());
		display(petMap.values().iterator());
	}
}
