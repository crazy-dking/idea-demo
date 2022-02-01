package com.cn.zj.shortcut;

/**
 * @Description:
 * @Author: wangdakai
 * @Date: 2022/1/20
 */
public class ExtractVariable {

    public void method() {
        int a = 1;
        int b = a + AnotherClass.intValue(2);
        int c = b + AnotherClass.intValue(2);
    }
}
class AnotherClass {
    public static int intValue(int num) {
        return 1;
    }
}


