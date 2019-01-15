package com.tinytongtong.thinkinjavapractice.chapter15.part04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * 一个工具类，包含各种各样的static方法，专门用来创建各种常用的容器对象
 * 
 * @author tiny
 *
 */
public class New {
	public static <K, V> Map<K, V> map() {
		return new HashMap<K, V>();
	}

	public static <T> List<T> list() {
		return new ArrayList<T>();
	}

	public static <T> LinkedList<T> lList() {
		return new LinkedList<T>();
	}

	public static <T> Set<T> set() {
		return new HashSet<T>();
	}

	public static <T> Queue<T> queue() {
		return new LinkedList<T>();
	}

	public static void main(String[] args) {
		Map<String, List<String>> sls = New.map();
		List<String> ls = New.list();
		LinkedList<String> lls = New.lList();
		Set<String> ss = New.set();
		Queue<String> qs = New.queue();
	}
}
