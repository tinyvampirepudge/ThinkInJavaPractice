package com.tinytongtong.thinkinjavapractice.chapter11.part11;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// 自然顺序
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		Random random = new Random(47);
		for (int i = 0; i < 10; i++) {
			priorityQueue.offer(random.nextInt(i + 10));
		}
		QueueDemo.printQ(priorityQueue);

		// 添加Integer类型数据
		List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
		priorityQueue = new PriorityQueue<>(ints);
		QueueDemo.printQ(priorityQueue);
		// 排序 自然顺序的倒序
		priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
		priorityQueue.addAll(ints);
		QueueDemo.printQ(priorityQueue);

		// 添加String类型数据
		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> strings = Arrays.asList(fact.split(" "));
		PriorityQueue<String> stringPQ = new PriorityQueue<>(strings);
		QueueDemo.printQ(stringPQ);
		// 排序 自然顺序的倒序
		stringPQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
		stringPQ.addAll(strings);
		QueueDemo.printQ(stringPQ);

		// 添加Character类型数据,使用HashSet去除掉重复数据，默认排序。
		Set<Character> charSet = new HashSet<>();
		for (Character c : fact.toCharArray()) {
			charSet.add(c);// Autoboxing
		}
		PriorityQueue<Character> characterPQ = new PriorityQueue<>(charSet);
		QueueDemo.printQ(characterPQ);
	}

}
