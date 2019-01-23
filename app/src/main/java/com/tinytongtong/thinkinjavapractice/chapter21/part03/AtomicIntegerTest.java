package com.tinytongtong.thinkinjavapractice.chapter21.part03;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description: 使用AtomicInteger重写AtomicityTest
 * {@link AtomicityTest}
 * 这里我们通过使用AtomicInteger而消除了synchronized关键字。
 * 因为这个程序不会失败，所以添加了一个Timer，以便在5秒钟之后自动的终止。
 * @Author wangjianzhou@qding.me
 * @Date 2019/1/23 4:33 PM
 * @Version
 */
public class AtomicIntegerTest implements Runnable {
    private AtomicInteger i = new AtomicInteger(0);

    public int getValue() {
        return i.get();
    }

    private void evenIncrement() {
        i.addAndGet(2);
    }

    @Override
    public void run() {
        while (true) {
            evenIncrement();
        }
    }

    public static void main(String[] args) {
        // 因为这个程序不会失败，所以添加了终止条件
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Aborting");
                System.exit(0);
            }
        }, 5000); // Terminate after 5 seconds
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicIntegerTest ait = new AtomicIntegerTest();
        exec.execute(ait);
        while (true) {
            int val = ait.getValue();
            if (val % 2 != 0) {
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
