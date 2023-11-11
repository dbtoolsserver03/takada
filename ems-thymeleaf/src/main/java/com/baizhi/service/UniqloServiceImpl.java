package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.UniqloMapper;
import com.baizhi.entity.original.Uniqlo;
import com.baizhi.entity.original.UniqloExample;
import com.baizhi.entity.vo.UniqloVo;

import cn.hutool.core.util.ObjUtil;
import cn.hutool.core.util.StrUtil;

@Service
@Transactional
public class UniqloServiceImpl  implements  UniqloService{

    @Autowired
    private UniqloMapper mapper;


    @Override
    public void delete(Integer id) {
    	mapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Uniqlo o) {
    	mapper.updateByPrimaryKeySelective(o);
    }

    @Override
    public Uniqlo findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void save(Uniqlo o) {
    	mapper.insertSelective(o);
    }

    @Override
    public List<Uniqlo> lists(UniqloVo vo) {
    	
		UniqloExample cond = new UniqloExample();
		UniqloExample.Criteria criteria = cond.createCriteria();
		if (StrUtil.isNotEmpty(vo.getUniqlo().getSex()) && !StrUtil.equals(vo.getUniqlo().getSex(), "2")) criteria.andSexEqualTo(vo.getUniqlo().getSex());
		
		if (StrUtil.isNotEmpty(vo.getUniqlo().getName())) criteria.andNameLike("%"+vo.getUniqlo().getName()+"%");
		if (StrUtil.isNotEmpty(vo.getUniqlo().getType())) criteria.andTypeEqualTo(vo.getUniqlo().getType());
		if (ObjUtil.isNotEmpty(vo.getSizeLst())) criteria.andSizeIn(vo.getSizeLst());
		if (ObjUtil.isNotNull(vo.getPriceBegin())) criteria.andPriceGreaterThanOrEqualTo(vo.getPriceBegin());
		if (ObjUtil.isNotNull(vo.getPriceEnd())) criteria.andPriceLessThanOrEqualTo(vo.getPriceEnd());
		if (ObjUtil.isNotNull(vo.getUniqlo().getSaleBegin())) criteria.andSaleBeginGreaterThanOrEqualTo(vo.getUniqlo().getSaleBegin());
		if (ObjUtil.isNotNull(vo.getUniqlo().getSaleEnd())) criteria.andSaleBeginGreaterThanOrEqualTo(vo.getUniqlo().getSaleEnd());
		
        return mapper.selectByExample(cond);
    }

	@Override
	public int savelists(UniqloVo vo) {
		
		int cnt = 0;
		for (Uniqlo o: vo.getUniqloLst()) {
			if (ObjUtil.isNotEmpty(o.getId())) {
				cnt += mapper.updateByPrimaryKeySelective(o);
			}
		}
		
		return  cnt;
	}
}
