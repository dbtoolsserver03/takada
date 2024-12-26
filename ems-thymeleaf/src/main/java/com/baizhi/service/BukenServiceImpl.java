package com.baizhi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.MDensyaEkiMapper;
import com.baizhi.dao.original.MDensyaMapper;
import com.baizhi.dao.original.TBukenIconMapper;
import com.baizhi.dao.original.TBukenMapper;
import com.baizhi.entity.original.MDensya;
import com.baizhi.entity.original.MDensyaEki;
import com.baizhi.entity.original.MDensyaEkiExample;
import com.baizhi.entity.original.MDensyaExample;
import com.baizhi.entity.original.TBuken;
import com.baizhi.entity.original.TBukenExample;
import com.baizhi.entity.original.TBukenExample.Criteria;
import com.baizhi.entity.original.TBukenIcon;
import com.baizhi.entity.original.TBukenIconExample;
import com.baizhi.entity.vo.BukenContidionVo;
import com.baizhi.entity.vo.BukenRec;

@Service
@Transactional
public class BukenServiceImpl implements BukenService {

	@Autowired
	TBukenMapper mapper;

	@Autowired
	TBukenIconMapper iconMapper;

	@Autowired
	MDensyaMapper densyaMapper;

	@Autowired
	MDensyaEkiMapper densyaEkiMapper;

	@Override
	public List<BukenRec> searchList(BukenContidionVo contionVo) {

		TBukenExample example = new TBukenExample();

		Criteria criteria = example.createCriteria();
		if (contionVo.getMoneyRentMax() != null) {
			criteria.andMoneyRentLessThanOrEqualTo(contionVo.getMoneyRentMax());
		}
		if (contionVo.getMoneyRentMin() != null) {
			criteria.andMoneyRentGreaterThanOrEqualTo(contionVo.getMoneyRentMin());
		}

		if (StringUtils.isNotEmpty(contionVo.getLocation())) {
			criteria.andLocationLike("%" + contionVo.getLocation() + "%");
		}

		if (StringUtils.isNotEmpty(contionVo.getMadori())) {

			criteria.andMadoriIn(Arrays.asList(contionVo.getMadori().split(",")));
		}

		if (StringUtils.isNotEmpty(contionVo.getDensyaType()) && StringUtils.isNotEmpty(contionVo.getDensyaNo())
				&& StringUtils.isNotEmpty(contionVo.getEkiNo())) {

			criteria.andDensyaTypeEqualTo(contionVo.getDensyaType());
			criteria.andDensyaNoEqualTo(Integer.valueOf(contionVo.getDensyaNo()));
			criteria.andEkiNoEqualTo(Integer.valueOf(contionVo.getEkiNo()));
		}

		List<TBuken> bukenLst =  mapper.selectByExample(example);
		
		List<BukenRec> retLst = new ArrayList<BukenRec>();
		
		for (TBuken rec : bukenLst) {
			
			BukenRec recVo = new BukenRec();

			recVo.setBuken(rec);

			if (StringUtils.isNotEmpty(rec.getDensyaType())) {
				MDensyaEki key = new MDensyaEki();
				key.setDensyaType(rec.getDensyaType());
				key.setDensyaNo(rec.getDensyaNo());
				key.setEkiNo(rec.getEkiNo());
				
				recVo.setEkiNm(densyaEkiMapper.selectByPrimaryKey(key).getEkiName());
			}
			
			retLst.add(recVo);
		}
		
		return  retLst;
	}

	@Override
	public int addBuken(TBuken rec) {
		int ret = mapper.insertSelective(rec);

		return ret;
	}

	@Override
	public int addBukenIcon(Integer bukenId, String username, List<String> urlsLst) {

		int ret = 0;

		for (int i = 0; i < urlsLst.size(); i++) {
			TBukenIcon icon = new TBukenIcon();

			icon.setBukenId(bukenId).setSubId(i);
			icon.setUrl(urlsLst.get(i));
			icon.setCreateUserId(username);

			// retに累加する
			ret += iconMapper.insertSelective(icon);
		}

		return ret;
	}

	@Override
	public TBuken getOneRec(Integer bukenId) {
		TBuken rec = mapper.selectByPrimaryKey(bukenId);

		return rec;
	}

	@Override
	public List<TBukenIcon> getAllIcon(Integer id) {

		TBukenIconExample example = new TBukenIconExample();
		example.createCriteria().andBukenIdEqualTo(id);

		List<TBukenIcon> iconLst = iconMapper.selectByExample(example);

		return iconLst;
	}

	@Override
	public int updateBuken(TBuken rec) {
		int ret = mapper.updateByPrimaryKeySelective(rec);

		return ret;
	}

	@Override
	public int updateBukenIcon(Integer bukenId, String username, List<String> urlsLst) {

		TBukenIconExample example = new TBukenIconExample();
		example.createCriteria().andBukenIdEqualTo(bukenId);

		iconMapper.deleteByExample(example);

		int ret = 0;

		for (int i = 0; i < urlsLst.size(); i++) {
			TBukenIcon icon = new TBukenIcon();

			icon.setBukenId(bukenId).setSubId(i);
			icon.setUrl(urlsLst.get(i));
			icon.setCreateUserId(username);

			// retに累加する
			ret += iconMapper.insertSelective(icon);
		}

		return ret;
	}

	@Override
	public int deleteAll(Integer[] bukenIds) {

		int ret = 0;
		for (Integer bukenId : bukenIds) {

			//物件テーブルの削除を行う
			ret += mapper.deleteByPrimaryKey(bukenId);

			//物件アイコンテーブルの削除を行う
			TBukenIconExample example = new TBukenIconExample();
			example.createCriteria().andBukenIdEqualTo(bukenId);

			ret += iconMapper.deleteByExample(example);

		}

		return ret;
	}

	@Override
	public List<MDensya> findDensyaLst(String densyaType) {

		MDensyaExample example = new MDensyaExample();

		com.baizhi.entity.original.MDensyaExample.Criteria criteria = example.createCriteria();

		criteria.andDensyaTypeEqualTo(densyaType);

		return densyaMapper.selectByExample(example);

	}

	@Override
	public List<MDensyaEki> findEkiInfoLst(String densyaType, int densyaNo) {

		MDensyaEkiExample example = new MDensyaEkiExample();

		com.baizhi.entity.original.MDensyaEkiExample.Criteria criteria = example.createCriteria();

		criteria.andDensyaTypeEqualTo(densyaType);
		criteria.andDensyaNoEqualTo(densyaNo);

		return densyaEkiMapper.selectByExample(example);

	}

}
