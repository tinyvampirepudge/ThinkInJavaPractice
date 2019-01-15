package com.tinytongtong.thinkinjavapractice.chapter11.part10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 100万个100以内的随机数，统计它们出现的次数。
 * 
 * @author tiny
 *
 */
public class Statistics {

	public static void main(String[] args) {
		Random random = new Random(47);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < 1000000; i++) {
			int r = random.nextInt(100);
			Integer freq = map.get(r);
			map.put(r, freq == null ? 1 : freq + 1);
		}
		System.out.println(map);
	}

}
