package com.tinytongtong.thinkinjavapractice.chapter21.part03;

/**
 * @Description: 一个产生序列数字的类，非线程安全的。
 * 真正的问题在于在没有同步的情况下对共享可变值进行了访问。
 * @Author wangjianzhou@qding.me
 * @Date 2019/1/23 11:25 AM
 * @Version
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    public static int nextSerialNumber() {
        return serialNumber++;// Not thread-safe
    }
}
