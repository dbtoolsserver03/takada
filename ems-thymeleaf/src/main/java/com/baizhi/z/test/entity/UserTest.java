package com.baizhi.z.test.entity;

import java.util.Date;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@ConfigurationProperties(prefix = "user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserTest {

    private String id;
    private String name;
    private Integer salary;
    private Date bir;
    //set 方法一定要提供
}
