package com.cn.zj;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description: 人员类
 * @Author: wangdakai
 * @Date: 2022/2/12
 */
@Data
public class Person {
    private int age;
    private String name;
}
@Slf4j
class Test{
    public static void main(String[] args) {
        Person p = new Person();
        log.warn("我是warn");
        log.error("我是error");
    }
}
