package com.tinytongtong.thinkinjavapractice.util;

import java.util.ArrayList;
import java.util.Random;

public class ListUtils {
	public static ArrayList<String> getArrayList(int size){
		ArrayList<String> arrayList = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			arrayList.add("tiny"+ i);
		}
		return arrayList;
	}
	
	public static ArrayList<String> getRandomArrayList(int size){
		Random random = new Random(47);
		ArrayList<String> arrayList = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			arrayList.add("tiny"+ (random.nextInt(size) +1));
		}
		return arrayList;
	}
}
