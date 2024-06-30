package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.TMymessageMapper;
import com.baizhi.entity.original.TMymessage;

@Service
@Transactional
public class MymessageServiceImpl implements MymessageService {

    @Autowired
    TMymessageMapper mapper;

    @Override
    public List<TMymessage> lists() {
        return mapper.selectByExample(null);
    }

//
//    @Override
//    public void save(TStudent obj) {
//        mapper.insertSelective(obj);
//
//    }
//
//    @Override
//    public TStudent findRecByPk(int id) {
//        return mapper.selectByPrimaryKey(id);
//
//    }
//
//    @Override
//    public void update(TStudent obj) {
//        mapper.updateByPrimaryKeySelective(obj);
//    }
//
//    @Override
//    public void delete(Integer id) {
//        mapper.deleteByPrimaryKey(id);
//    }

}
