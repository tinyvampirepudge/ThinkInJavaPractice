package com.tinytongtong.thinkinjavapractice.chapter21.part02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: 给Thread设置默认的未捕获异常处理器
 * @Author wangjianzhou@qding.me
 * @Date 2019/1/15 4:14 PM
 * @Version
 */
public class SettingDefaultHandler {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new ExceptionThread());
    }
}
