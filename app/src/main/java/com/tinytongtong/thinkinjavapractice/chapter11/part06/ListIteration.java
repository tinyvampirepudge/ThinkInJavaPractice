package com.tinytongtong.thinkinjavapractice.chapter11.part06;

import com.tinytongtong.thinkinjavapractice.util.ListUtils;
import com.tinytongtong.thinkinjavapractice.util.PrintUtil;

import java.util.List;
import java.util.ListIterator;


public class ListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> pets = ListUtils.getArrayList(10);
		PrintUtil.println(pets.toString());
		ListIterator<String> li = pets.listIterator();
		// 向前
		while (li.hasNext()) {
			PrintUtil.println(li.next() + "," + li.nextIndex() + "," + li.previousIndex());
		}

		// 向后
		while (li.hasPrevious()) {
			PrintUtil.println("li.previous() --> " + li.previous());
		}
		
		PrintUtil.println(pets.toString());
		//从3开始获取迭代器
		li = pets.listIterator(3);
		while (li.hasNext()) {
			li.next();
			li.set("tiny random");//替换元素。
		}
		PrintUtil.println(pets.toString());
	}

}
