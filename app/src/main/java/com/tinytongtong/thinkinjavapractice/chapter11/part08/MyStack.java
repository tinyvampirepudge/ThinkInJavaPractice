package com.tinytongtong.thinkinjavapractice.chapter11.part08;
/**
 * 
 * @author tiny
 *
 * @param <T>
 * 使用LinkedList实现stack的LIFO
 */

import java.util.LinkedList;

public class MyStack<T> {
	private LinkedList<T> storage = new LinkedList<>();
	public void push(T v){
		storage.add(v);
	}
	public T peek(){
		return storage.getFirst();
	}
	public T pop(){
		return storage.removeFirst();
	}
	
	public boolean empty(){
		return storage.isEmpty();
	}
	
	public String toString(){
		return storage.toString();
	}
}
