package com.tinytongtong.thinkinjavapractice.chapter21.part03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MutexEvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;
    private Lock lock = new ReentrantLock();

    @Override
    public int next() {
        lock.lock();
        try {
            ++currentEvenValue;
            Thread.yield(); // Cause failure faster
            ++currentEvenValue;
            // 自行顺序 1
            System.out.println("before return currentEvenValue:" + currentEvenValue);
            return currentEvenValue;// 执行顺序 3
        } finally {
            // 执行顺序 2
            System.out.println("finally currentEvenValue:" + currentEvenValue);
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        EvenChecker.test(new MutexEvenGenerator());
    }
}
