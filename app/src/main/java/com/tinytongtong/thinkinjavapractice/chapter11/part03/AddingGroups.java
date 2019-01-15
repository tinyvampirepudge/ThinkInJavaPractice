package com.tinytongtong.thinkinjavapractice.chapter11.part03;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddingGroups {

	public static void main(String[] args) {
		//Arrays.asList()
		Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));//可变参数
		Integer[] moreInts = {6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));//数组
		
		//Collections.addAll()
		Collections.addAll(collection, 11,12,13,14,15);//可变参数
		Collections.addAll(collection, moreInts);//数组
		
		List<Integer> list = Arrays.asList(16,17,18,19,20);
		list.set(1, 99);//修改一个元素
		/**
		 * 	Exception in thread "main" java.lang.UnsupportedOperationException	
			at java.util.AbstractList.add(AbstractList.java:148)
			at java.util.AbstractList.add(AbstractList.java:108)
			at com.tiny.thinkinjava.chapter11.part03.AddingGroups.main(AddingGroups.java:22)
		 */
//		list.add(21);//会报运行时异常，cannot be resized.
	}

}
