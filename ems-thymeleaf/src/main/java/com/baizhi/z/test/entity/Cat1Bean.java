package com.baizhi.z.test.entity;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cat1Bean {


    private String id;
    
    @Value("${age}")
    private Integer age;
    //set 方法一定要提供
}
