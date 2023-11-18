package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.SnacksMapper;
import com.baizhi.entity.original.Snacks;
import com.baizhi.entity.original.SnacksExample;
import com.baizhi.entity.vo.SnacksVo;

import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.ObjUtil;
import cn.hutool.core.util.StrUtil;

@Service
@Transactional
public class SnacksServiceImpl  implements  SnacksService{

	@Autowired
    private SnacksMapper mapper;


    @Override
    public List<Snacks> lists(SnacksVo vo) {

    	SnacksExample cond = new SnacksExample();
		SnacksExample.Criteria criteria = cond.createCriteria();


		// 姓名糊糊查询 条件     日语叫曖昧検索
		if( StrUtil.isNotEmpty(vo.getSnacks().getName())) {
			criteria.andNameLike("%" + vo.getUniqlo().getName() + "%" );
		}


		// 价格范围 条件
		if( ObjUtil.isNotNull(vo.getPriceBegin())) {
			criteria.andPriceGreaterThanOrEqualTo(NumberUtil.parseInt(vo.getPriceBegin().toString()));
		}
		if( ObjUtil.isNotNull(vo.getPriceEnd())) {
			criteria.andPriceLessThanOrEqualTo(NumberUtil.parseInt(vo.getPriceEnd().toString()));
		}


        return mapper.selectByExample(cond);
    }
}