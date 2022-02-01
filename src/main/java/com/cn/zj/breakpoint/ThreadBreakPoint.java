package com.cn.zj.breakpoint;

import ch.qos.logback.core.util.TimeUtil;

import java.util.concurrent.TimeUnit;

/**
 * @Description: 多线程断点调试
 * 多线程调试，以及代码的安全退出。
 * @Author: wangdakai
 * @Date: 2022/1/11
 */
public class ThreadBreakPoint {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("执行线程t1");
        },"t1").start();
        new Thread(() -> {
            System.out.println("执行线程Ît2");
        },"t2").start();

        System.out.println("执行主线程");
    }
}
