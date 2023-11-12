package com.baizhi.convert;

import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import cn.hutool.core.date.DateUtil;
@Component
public class ConvertStr2Date implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		return DateUtil.parse(source);
	}
}