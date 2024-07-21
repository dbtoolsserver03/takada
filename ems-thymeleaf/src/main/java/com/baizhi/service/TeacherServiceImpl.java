package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.TTeacherMapper;
import com.baizhi.entity.original.TTeacher;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TTeacherMapper mapper;

    @Override
    public List<TTeacher> lists() {
        return mapper.selectByExample(null);
    }

    @Override
    public void save(TTeacher obj) {
        mapper.insert(obj);

    }

    @Override
    public TTeacher findRecByPk(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(TTeacher obj) {

        mapper.updateByPrimaryKey(obj);
    }

    @Override
    public void delete(int id) {
        mapper.deleteByPrimaryKey(id);

    }


}
