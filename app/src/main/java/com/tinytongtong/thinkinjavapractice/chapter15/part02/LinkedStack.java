package com.tinytongtong.thinkinjavapractice.chapter15.part02;

/**
 * 自己实现内部链式存储机制
 * 后进先出
 * 
 * @author tiny
 *
 * @param <T>
 */
public class LinkedStack<T> {
	private static class Node<U> {
		U item;
		Node<U> next;
		// 第一次初始化时会调用空参构造方法。
		public Node() {
			item = null;
			next = null;
		}

		// 真实给链表赋值时会调用这个方法。
		public Node(U item, Node<U> next) {
			super();
			this.item = item;
			this.next = next;
		}

		public boolean end() {
			return item == null && next == null;
		}

	}

	private Node<T> top = new Node<>();// 初始化
	
	// 链式存储的核心。
	public void push(T t) {
		top = new Node<>(t, top);
	}

	public T pop() {
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}
		return result;
	}

	public static void main(String[] args) {
		LinkedStack<String> linkedStack = new LinkedStack<>();
		for (String string : "Phasers on stun!".split(" ")) {
			linkedStack.push(string);
		}
		String string;
		while ((string = linkedStack.pop()) != null) {
			System.out.println(string);
		}
	}

}
