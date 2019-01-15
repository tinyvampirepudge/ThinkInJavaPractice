package com.tinytongtong.thinkinjavapractice.chapter13.part02;

public class WhitherStringBuilder {
	
	/**
	 * 隐式，使用重载操作符拼接字符串，编译器会隐式的使用StringBuilder来链接字符串
	 * @param fields
	 * @return
	 */
	public String implicit(String[] fields){
		String result = "";
		for (int i = 0; i < fields.length; i++) {
			result += fields[i];
		}
		return result;
	}

	/**
	 * 显式，这里使用StringBuilder直接拼接字符串。
	 * @param fields
	 * @return
	 */
	public String explicit(String[] fields){
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < fields.length; i++) {
			result.append(fields[i]);
		}
		return result.toString();
	}
}
