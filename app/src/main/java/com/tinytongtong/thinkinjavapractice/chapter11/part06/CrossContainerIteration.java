package com.tinytongtong.thinkinjavapractice.chapter11.part06;

import com.tinytongtong.thinkinjavapractice.util.ListUtils;
import com.tinytongtong.thinkinjavapractice.util.PrintUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;


/**
 * 不必知道容器的确切类型。
 * @author tiny
 *
 */
public class CrossContainerIteration {
	
	
	public static void display(Iterator<String> it){
		while (it.hasNext()) {
			String p = it.next();
			PrintUtil.print(p);
		}
		PrintUtil.println("");
	}

	public static void main(String[] args) {
		ArrayList<String> pets = ListUtils.getRandomArrayList(10);
		LinkedList<String> linkedList = new LinkedList<>(pets);
		HashSet<String> hashSet = new HashSet<>(pets);
		TreeSet<String> treeSet = new TreeSet<>(pets);
		display(pets.iterator());
		display(linkedList.iterator());
		display(hashSet.iterator());
		display(treeSet.iterator());
	}

}
