package com.tinytongtong.thinkinjavapractice.chapter21.part02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NaiveExceptionHandling {
	public static void main(String[] args) {
		try {
			ExecutorService exec = Executors.newCachedThreadPool();
			exec.execute(new ExceptionThread());
		} catch (RuntimeException e) {
			// This statement will NOT execute!
			System.out.println("Ececution has been handled!");
		}
	}
}
