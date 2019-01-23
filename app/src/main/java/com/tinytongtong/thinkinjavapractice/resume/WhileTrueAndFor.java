package com.tinytongtong.thinkinjavapractice.resume;

/**
 * @Description: while(true)和for(; ;)的区别
 * @Author wangjianzhou@qding.me
 * @Date 2019/1/23 4:46 PM
 * @Version TODO
 */
public class WhileTrueAndFor {

    void f1() {
        while (true) {
            System.out.println("f1");
        }
    }

    void f2() {
        for (; ; ) {
            System.out.println("f2");
        }
    }
}
