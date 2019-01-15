package com.tinytongtong.thinkinjavapractice.chapter21.part02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: TODO
 *
 * @Author wangjianzhou@qding.me
 * @Date 2019/1/15 4:00 PM
 * @Version
 */
public class NaiveExceptionHandling {
    public static void main(String[] args) {
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            exec.execute(new ExceptionThread());
        } catch (Exception e) {
            // This statement will NOT execute!
            System.out.println("Exception has been handled!");
        }
    }
}
