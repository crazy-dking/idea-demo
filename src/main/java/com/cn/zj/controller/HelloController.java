package com.cn.zj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:l
 * 1.创建远程配置
 * 2.打包，上传到服务器。
 * 3.使用指定参数启动服务器
 * 4.启动本地配置项目
 * @Author: wangdakai
 * @Date: 2022/1/11
 */
@RestController("/hello")
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        System.out.println("此处执行代码逻辑");
        return "hello 兵长";
    }
}
