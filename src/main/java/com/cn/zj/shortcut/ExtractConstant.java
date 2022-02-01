package com.cn.zj.shortcut;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: wangdakai
 * @Date: 2022/1/20
 */
public class ExtractConstant {

    public static final String STRING = "string";

    public void method() {
        ArrayList list = new ArrayList();
        list.add(STRING);
        anotherMethod(STRING);
    }
    private void anotherMethod(String string) {
    }
}
