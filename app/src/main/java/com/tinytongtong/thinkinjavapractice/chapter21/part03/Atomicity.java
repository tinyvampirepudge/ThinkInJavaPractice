package com.tinytongtong.thinkinjavapractice.chapter21.part03;

/**
 * @Description: 原子操作—— "++"和"+="不是原子操作
 * Exec:
 * ①javac Atomicity.java
 * ②javap -c Atomicity
 * @Author wangjianzhou@qding.me
 * @Date 2019/1/23 10:05 AM
 * @Version
 */
public class Atomicity {
    int i;

    /**
     * ++ 操作
     */
    void f1() {
        i++;
    }

    /**
     * += 操作
     */
    void f2() {
        i += 2;
    }

    /**
     * 赋值操作
     */
    void f3() {
        i = 3;
    }

    /**
     * 返回操作
     */
    int f4() {
        return i;
    }
}
