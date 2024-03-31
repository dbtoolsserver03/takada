package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.THakoneEkidenRankingMapper;
//import com.baizhi.entity.original.THakoneEkidenRanking;
//import com.baizhi.entity.original.THakoneEkidenRanking objExample;
//import com.baizhi.entity.vo.EmployeeVo;
import com.baizhi.entity.original.THakoneEkidenRanking;

@Service
@Transactional
public class HakoneEkidenRankingServiceImpl  implements  HakoneEkidenRankingService{

    private THakoneEkidenRankingMapper mapper;

    @Autowired
    public HakoneEkidenRankingServiceImpl(THakoneEkidenRankingMapper mapper) {
        this.mapper = mapper;
    }

    @Override	
    public void delete(Integer id) {
    	mapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(THakoneEkidenRanking obj) {
    	mapper.updateByPrimaryKeySelective(obj);
    }

    @Override
    public THakoneEkidenRanking findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void save(THakoneEkidenRanking obj) {
    	mapper.insertSelective(obj);
    }


	@Override
	public List<THakoneEkidenRanking> list() {
		// TODO 自動生成されたメソッド・スタブ
		return mapper.selectByExample(null);
	}



	
}