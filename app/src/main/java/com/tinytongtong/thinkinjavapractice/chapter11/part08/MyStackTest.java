package com.tinytongtong.thinkinjavapractice.chapter11.part08;


import com.tinytongtong.thinkinjavapractice.util.PrintUtil;

/**
 * MyStack测试
 * @author tiny
 *
 */
public class MyStackTest {

	public static void main(String[] args) {
		MyStack<String> myStack = new MyStack<>();
		for (String string : "My dog has fleas".split(" ")) {
			myStack.push(string);
		}
		PrintUtil.println(myStack.toString());
		
		while (!myStack.empty()) {
			PrintUtil.print(myStack.pop());
		}
	}

}
