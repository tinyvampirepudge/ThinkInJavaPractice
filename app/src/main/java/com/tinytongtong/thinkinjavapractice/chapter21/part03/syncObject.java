package com.tinytongtong.thinkinjavapractice.chapter21.part03;

/**
 * @Description: synchronized
 * 这里的两个同步是相互独立的。
 * @Author wangjianzhou@qding.me
 * @Date 2019/1/24 2:11 PM
 * @Version
 */
public class syncObject {
    public static void main(String[] args) {
        final DualSync ds = new DualSync();
        new Thread() {
            @Override
            public void run() {
                ds.f();
            }
        }.start();
        ds.g();
    }
}

class DualSync {
    private Object syncObject = new Object();

    public synchronized void f() {
        for (int i = 0; i < 5; i++) {
            System.out.println("f()");
            Thread.yield();
        }
    }

    public void g() {
        synchronized (syncObject) {
            for (int i = 0; i < 5; i++) {
                System.out.println("g()");
                Thread.yield();
            }
        }
    }
}
