package com.cn.zj;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: xx
 * @Author: wangdakai
 * @Date: 2022/2/13
 */
@NoArgsConstructor
@Data
public class Man {
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("name")
    private String name;
}
