package com.baizhi.constant;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.baizhi.dao.original.MCodeMapper;
import com.baizhi.entity.original.MCode;
import com.baizhi.entity.original.MCodeExample;

@Component
public class MyConponent {
    @Autowired
    private MCodeMapper mapper;
    @Bean //用来将改方法返回值交给springboot管理 在工厂中默认标识:类名首字母小写
    @Scope("singleton")  //prototype  singleton
    MasterInfo getMcode(){
    	
    	MasterInfo masterInfo = new MasterInfo();
		MCodeExample cond = new MCodeExample();
		MCodeExample.Criteria criteria = cond.createCriteria();
		criteria.andDeleteFlgEqualTo("0");
		cond.setOrderByClause("m_order");
    	List<MCode> mCodeLst = mapper.selectByExample(cond);
    	
    	Map<String, Map<String, MCode>> resultMap = new HashMap<>();
        for (MCode obj : mCodeLst) {
            String outerKey = obj.getMKey();
            String innerKey = obj.getMCode();
            String value = obj.getMValue();
            // 检查外层Map是否已经包含了外层键
            if (!resultMap.containsKey(outerKey)) {
                resultMap.put(outerKey, new LinkedHashMap<>());
            }

            // 将内层键值对放入内层Map
            resultMap.get(outerKey).put(innerKey, obj);
        }
        masterInfo.setCodeMap(resultMap);
        return masterInfo;
    }
}
