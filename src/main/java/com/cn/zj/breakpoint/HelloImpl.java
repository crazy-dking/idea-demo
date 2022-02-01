package com.cn.zj.breakpoint;

/**
 * @Description: 接口断点可以快速的找到方法的具体实现类。
 * @Author: wangdakai
 * @Date: 2022/1/11
 */
public class HelloImpl implements Hello{
    @Override
    public String sayHello(String name) {
        System.out.println("接口实现");
        return "hello"+name;
    }
}
