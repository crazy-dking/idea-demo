package com.cn.zj.template;

/**
 * @Description: test
 * @Author: wangdakai
 * @Date: 2022/1/25 23:02
 */
public interface Test {
    public static void main(String[] args) {
        new Thread(()->{

        },"").start();
        new Thread(() -> {
            System.out.println("");
        }, "t1").start();
    }
}
