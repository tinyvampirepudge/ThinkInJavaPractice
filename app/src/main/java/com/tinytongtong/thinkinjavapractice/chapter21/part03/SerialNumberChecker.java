package com.tinytongtong.thinkinjavapractice.chapter21.part03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Description: 测试SerialNumberGenerator
 * {@link SerialNumberChecker}包含一个静态的{@link CircularSet},它持有所产生的所有序列数；
 * 另外还包含一个内嵌的{@link SerialChecker}类，它可以确保序列数是惟一的。
 * 通过创建多个任务来竞争序列数，如果你运行的时间够长的话,你将发现这些任务最终会得到重复的序列数。
 * 如果要解决这个问题，在{@link SerialNumberGenerator#nextSerialNumber()}前面添加synchronized关键字。
 * @Author wangjianzhou@qding.me
 * @Date 2019/1/23 2:02 PM
 * @Version
 */
public class SerialNumberChecker {
    private static final int SIZE = 10;
    private static CircularSet serials = new CircularSet(1000);
    private static ExecutorService exec = Executors.newCachedThreadPool();

    static class SerialChecker implements Runnable {
        @Override
        public void run() {
            while (true) {
                int serial = SerialNumberGenerator.nextSerialNumber();
                if (serials.contains(serial)) {
                    System.out.println("Duplicate: " + serial);
                    System.exit(0);
                }
                serials.add(serial);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < SIZE; i++) {
            exec.execute(new SerialChecker());
            // Stop after n seconds if there's an argument:
            if (args.length > 0) {
                TimeUnit.SECONDS.sleep(new Integer(args[0]));
                System.out.println("No duplicates detected");
                System.exit(0);
            }
        }
    }
}

// Reuses storage so we don't run out of memory:
class CircularSet {
    private int[] array;
    private int len;
    private int index = 0;

    public CircularSet(int size) {
        array = new int[size];
        len = size;
        // Initialize to a value not produced
        // by the SerialNumberGenerator:
        for (int i = 0; i < size; i++) {
            array[i] = -1;
        }
    }

    public synchronized void add(int i) {
        array[index] = i;
        // wrap index and write over old elements:
        index = ++index % len;
    }

    public synchronized boolean contains(int val) {
        for (int i = 0; i < len; i++) {
            if (array[i] == val) {
                return true;
            }
        }
        return false;
    }
}
