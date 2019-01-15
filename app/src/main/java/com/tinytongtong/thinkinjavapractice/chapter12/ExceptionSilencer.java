package com.tinytongtong.thinkinjavapractice.chapter12;

public class ExceptionSilencer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new RuntimeException();
		} finally {
			//Using 'return' inside the finally block
			//will silence any thrown exception.
			return;
		}
	}

}
