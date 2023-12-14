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
public class SnacksServicelmpl  implements  SnacksService{
	@Autowired
    private SnacksMapper mapper;
    @Override
    public List<Snacks> lists(SnacksVo vo) {
    	
    	SnacksExample cond = new SnacksExample();
    	SnacksExample.Criteria criteria = cond.createCriteria();
		
		
		// 姓名糊糊查询 条件     日语叫曖昧検索
		if( StrUtil.isNotEmpty(vo.getSnacks().getName())) {
			criteria.andNameLike("%" + vo.getSnacks().getName() + "%" );
		}


		// 价格范围 条件
		if( ObjUtil.isNotNull(vo.getPriceBegin())) {
			criteria.andSalaryGreaterThanOrEqualTo(NumberUtil.parseDouble(vo.getPriceBegin().toString()));
		}
		if( ObjUtil.isNotNull(vo.getPriceEnd())) {
			criteria.andSalaryLessThanOrEqualTo(NumberUtil.parseDouble(vo.getPriceEnd().toString()));
		}


        return mapper.selectByExample(cond);
    }

	public int addRec(SnacksVo vo) {

		
		int cnt = mapper.insertSelective(vo.getSnacks());
		return cnt;
	}


	
	public int updateRec(SnacksVo vo) {
		int cnt = mapper.updateByPrimaryKeySelective(vo.getSnacks());
		return cnt;	
	}


	
	public Snacks getOneRec(int id) {
		// TODO 自動生成されたメソッド・スタブ
		return mapper.selectByPrimaryKey(id);
	}
	@Override
	public int deleteOneRec(int id) {
		int cnt = mapper.deleteByPrimaryKey(id);
		return cnt;	
	}
}