package com.tinytongtong.thinkinjavapractice.chapter21.part02;

import javax.net.ssl.SSLEngineResult.Status;

/**
 * 显示发射之前的倒计时
 * 
 * @author tiny
 *
 */
public class LiftOff implements Runnable {
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;

	public LiftOff() {
		super();
	}

	public LiftOff(int countDown) {
		super();
		this.countDown = countDown;
	}

	public String status() {
		return "CurrentThread:" + Thread.currentThread().getName() + "#" + id + "("
				+ (countDown > 0 ? countDown : "ListOff!") + "). ";
	}

	@Override
	public void run() {
		while (countDown-- > 0) {
			System.out.println(status());
			Thread.yield();
		}
	}

}
