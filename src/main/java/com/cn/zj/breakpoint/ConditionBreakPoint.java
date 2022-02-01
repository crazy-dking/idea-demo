package com.cn.zj.breakpoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 条件断点
 * 使用场景：在一个大循环中想找到一个指定条件停止。
 * @Author: wangdakai
 * @Date: 2022/1/11
 */
public class ConditionBreakPoint {
    public static void main(String[] args) {
        // 正常的断点在循环中每次都会停止;除非你有麒麟臂；
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum = sum+ i;
        }
        System.out.println(sum);

        List<String> list = new ArrayList<>(Arrays.asList("回龙观","泷泽","西二旗"));
        for (String s : list) {
            System.out.println("一些列复杂操作"+s);
        }
    }
}
