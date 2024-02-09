package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.UniqloMapper;
import com.baizhi.entity.original.Uniqlo;
import com.baizhi.entity.original.UniqloExample;
import com.baizhi.entity.vo.UniqloVo;

import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.ObjUtil;
import cn.hutool.core.util.StrUtil;

@Service
@Transactional
public class UniqloServiceImpl  implements  UniqloService{

	@Autowired
    private UniqloMapper mapper;


    @Override
    public List<Uniqlo> lists(UniqloVo vo) {
    	
    	UniqloExample cond = new UniqloExample();
		UniqloExample.Criteria criteria = cond.createCriteria();
		
		// 姓名糊糊查询 条件     日语叫曖昧検索
		if( StrUtil.isNotEmpty(vo.getUniqlo().getName())) {
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


	@Override
	public int addRec(UniqloVo vo) {
		
		vo.getUniqlo().setDeleteFlg("0");
		int cnt = mapper.insertSelective(vo.getUniqlo());
		return cnt;
	}


	@Override
	public int updateRec(UniqloVo vo) {
		int cnt = mapper.updateByPrimaryKeySelective(vo.getUniqlo());
		return cnt;	
	}


	@Override
	public Uniqlo getOneRec(int id) {
		// TODO 自動生成されたメソッド・スタブ
		return mapper.selectByPrimaryKey(id);
	}


	@Override
	public int deleteOneRec(int id) {
		int cnt = mapper.deleteByPrimaryKey(id);
		return cnt;	
	}
}
