package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.TCarMapper;
import com.baizhi.entity.original.TCar;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    TCarMapper mapper;

    @Override
    public List<TCar> lists() {
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
