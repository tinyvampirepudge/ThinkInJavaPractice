package com.tinytongtong.thinkinjavapractice.chapter11.part05;

import com.tinytongtong.thinkinjavapractice.util.PrintUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * List的特性
 * @author huaying
 * Desc:
 * 基本的ArrayList,它长于随机访问元素，但是在List的中间插入和移除元素时较慢。
 * LinkdedList,它通过代价较低的在List中间进行的插入和删除操作，提供了优化的顺序访问。
 * LinkedList在随机访问方面相对比较慢，但是它的特性集较ArrayList更大。
 *
 */
public class ListFeatures {
	static String[] pets;
	static{
		pets = new String[10];
		for (int i = 0; i < 10; i++) {
			pets[i] = "tiny"+ i;
		}
	}
	static List<String> getPets(int size){
		ArrayList<String> arrayList = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			arrayList.add("tiny"+ i);
		}
		return arrayList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> pets = getPets(10);
		System.out.println("1: " + pets);
		pets.add("resize");
		System.out.println("2: " + pets);
		System.out.println("3: " + pets.contains("resize"));
		pets.remove("resize");
		String s4 = pets.get(2);
		System.out.println("4: " + s4 + " "+pets.indexOf(s4));
		String s5 = "tiny0";
		System.out.println("5: "+ pets.indexOf(s5));
		System.out.println("6: "+ pets.remove(s5));
		//必须是确定的对象
		System.out.println("7: "+ pets.indexOf(s4));
		System.out.println("8: "+ pets);
		pets.add(3,"Mouse");//insert
		System.out.println("9: "+ pets);
		List<String> subList = pets.subList(1, 4);
		System.out.println("subList: "+ subList);
		System.out.println("10: "+ pets.containsAll(subList));
		Collections.sort(subList);//In-place sort
		PrintUtil.println("sorted subList: "+ subList);
		//顺序对contains=All()方法并不重要。
		
	}

}
