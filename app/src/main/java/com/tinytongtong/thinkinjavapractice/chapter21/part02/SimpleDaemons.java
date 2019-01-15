package com.tinytongtong.thinkinjavapractice.chapter21.part02;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable {

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(Thread.currentThread() + "  " + this + " ——start");
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + "  " + this);
			}
		} catch (InterruptedException e) {
			System.out.println("sleep() interrupted");
		}
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10; i++) {
			Thread daemon = new Thread(new SimpleDaemons());
			daemon.setDaemon(true);// Must call before start()
			daemon.start();
		}
		System.out.println("All daemons started");
		TimeUnit.MILLISECONDS.sleep(175);
	}
}
