package com.tinytongtong.thinkinjavapractice.chapter11.part10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOfList {
	public static Map<Person, List<? extends Pet>> petPeople = new HashMap<>();
	static {
		petPeople.put(new Person("abc"), getArrayList(10));
		petPeople.put(new Person("def"), getArrayList(10));
		petPeople.put(new Person("ghi"), getArrayList(10));
	}

	public static void main(String[] args) {
		System.out.println("People: " + petPeople.keySet());
		System.out.println("Pets: " + petPeople.values());
		for (Person person : petPeople.keySet()) {
			System.out.print(person + " has:");
			for (Pet pet : petPeople.get(person)) {
				System.out.print("    " + pet);
			}
			System.out.println();
		}
		
		String str1 = "20171208";
		String str2 = "20171108";
		System.out.println("str1.compareTo(str2) --> "+str1.compareTo(str2));
	}

	public static ArrayList<Pet> getArrayList(int size) {
		ArrayList<Pet> arrayList = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				arrayList.add(new Cat("dandan --> " + i));
			} else {
				arrayList.add(new Dog("kaqi --> " + i));
			}
		}
		return arrayList;
	}

}
