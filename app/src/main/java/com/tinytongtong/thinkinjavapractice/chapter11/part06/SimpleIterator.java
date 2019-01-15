package com.tinytongtong.thinkinjavapractice.chapter11.part06;

import com.tinytongtong.thinkinjavapractice.util.ListUtils;
import com.tinytongtong.thinkinjavapractice.util.PrintUtil;

import java.util.Iterator;
import java.util.List;


public class SimpleIterator {

	public static void main(String[] args) {
		List<String> pets = ListUtils.getArrayList(10);
		Iterator<String> it = pets.iterator();
		while (it.hasNext()) {
			String p = it.next();
			PrintUtil.print(p);
		}
		System.out.println();
		//如果你只是向前遍历List，并不打算修改List对象本身，那么你可以看到foreach语法会显得更加简洁。
		for (String string : pets) {
			PrintUtil.print(string);
		}
		System.out.println();
		//迭代器remove
		//Iterator还可以删除由next()方法移动产生的最后一个元素。
		//这意味着在调用remove()之前必须先调用next().
		it = pets.iterator();
		for (int i = 0; i < 6; i++) {
			it.next();
			it.remove();//删除最近获取的那个元素。
		}
		PrintUtil.print(pets.toString());
	}

}
