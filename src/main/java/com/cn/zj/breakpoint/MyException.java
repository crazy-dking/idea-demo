package com.cn.zj.breakpoint;

/**
 * @Description:
 * @Author: wangdakai
 * @Date: 2022/1/12
 */
public class MyException extends RuntimeException{
    private String code;
    private String message;

    public MyException(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
