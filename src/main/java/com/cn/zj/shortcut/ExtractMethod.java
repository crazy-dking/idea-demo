package com.cn.zj.shortcut;

/**
 * @Description:
 * @Author: wangdakai
 * @Date: 2022/1/20
 */
public class ExtractMethod {
    public void method() {
        int a=1;
        int b=2;
        int c = a + b;
        add(a, b);

    }

    private void add(int a, int b) {
        int c = a + b;
    }
}
