package com.tinytongtong.thinkinjavapractice.chapter21.part03;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description: 使用AtomicInteger重写MutexEvenGenerator
 * {@link MutexEvenGenerator}
 * @Author wangjianzhou@qding.me
 * @Date 2019/1/23 5:17 PM
 * @Version
 */
public class AtomicEvenGenerator extends IntGenerator {
    private AtomicInteger currentEvenValue = new AtomicInteger(0);

    @Override
    public int next() {
        return currentEvenValue.addAndGet(2);
    }

    public static void main(String[] args) {
        EvenChecker.test(new AtomicEvenGenerator());
    }
}
