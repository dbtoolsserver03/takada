package com.baizhi.z.test.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cat2Bean {

    private String id;
    private Integer age;
    //set 方法一定要提供
}
