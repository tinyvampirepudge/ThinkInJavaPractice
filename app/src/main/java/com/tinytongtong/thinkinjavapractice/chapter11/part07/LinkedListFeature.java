package com.tinytongtong.thinkinjavapractice.chapter11.part07;

import com.tinytongtong.thinkinjavapractice.util.ListUtils;
import com.tinytongtong.thinkinjavapractice.util.PrintUtil;

import java.util.LinkedList;


public class LinkedListFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> pets = new LinkedList<>(ListUtils.getRandomArrayList(10));
		PrintUtil.println(pets.toString());
		//返回第一个元素，不移除:
		PrintUtil.println("pets.getFirst() --> " + pets.getFirst());
		PrintUtil.println("pets.element() --> " + pets.element());
		//在列表size为0时表现不同
		PrintUtil.println("pets.peek() --> " + pets.peek());
		pets = new LinkedList<>();
		PrintUtil.println("pets.peek() --> " + pets.peek());
		
		pets = new LinkedList<>(ListUtils.getRandomArrayList(10));
		PrintUtil.println(pets.toString());
		//移除并返回第一个元素：
		PrintUtil.println("pets.remove() --> " + pets.remove());
		PrintUtil.println("pets.removeFirst() --> " + pets.removeFirst());
		//在列表size为0时表现不同
		PrintUtil.println("pets.poll() --> " + pets.poll());
		PrintUtil.println(pets.toString());
		pets = new LinkedList<>();
		PrintUtil.println("pets.poll() --> " + pets.poll());
		
		pets = new LinkedList<>(ListUtils.getRandomArrayList(10));
		PrintUtil.println(pets.toString());
		pets.addFirst("addFirst()");//addFirst()
		PrintUtil.println(pets.toString());
		pets.offer("offer()");//offer()
		PrintUtil.println(pets.toString());
		pets.add("add()");//add()
		PrintUtil.println(pets.toString());
		pets.addLast("addLast()");//addLast()
		PrintUtil.println(pets.toString());
		PrintUtil.println("pets.removeLast() --> " + pets.removeLast());//removeLast()
		PrintUtil.println(pets.toString());
	}

}
