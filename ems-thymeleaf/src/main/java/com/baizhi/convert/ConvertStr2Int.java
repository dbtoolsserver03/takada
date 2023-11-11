package com.baizhi.convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import cn.hutool.core.convert.Convert;

@Component
public class ConvertStr2Int implements Converter<String, Integer> {
 @Override
 public Integer convert(String value) {
  return Convert.toInt(value.trim());
 }
}