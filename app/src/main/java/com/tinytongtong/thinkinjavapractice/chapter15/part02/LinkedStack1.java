package com.tinytongtong.thinkinjavapractice.chapter15.part02;

public class LinkedStack1<T> {

	private class Node {
		T item;
		Node next;

		public Node() {
			this.item = null;
			this.next = null;
		}

		public Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}

		// 末端哨兵
		public boolean end() {
			return item == null && next == null;
		}
	}

	private Node top = new Node();

	public void push(T item) {
		top = new Node(item, top);
	}

	public T pop() {
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
