package com.cn.zj.shortcut;

/**
 * @Description:
 * 1.抽取方法
 * 2.Delegate via method overloading。复选框 抽取成一个方法，向外暴露。
 * @Author: wangdakai
 * @Date: 2022/1/20
 */
public class ExtractParameter {
    public static void print() {
        System.out.println(generateText("Hello, World!"));


    }


    private static String generateText(String s) {
        return s.toUpperCase();

    }
}
