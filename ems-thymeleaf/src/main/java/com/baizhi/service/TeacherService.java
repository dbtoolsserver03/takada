package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.TTeacher;

public interface TeacherService {

    //列表方法
    List<TTeacher> lists();

    void save(TTeacher obj);

    TTeacher findRecByPk(int id);

    void update(TTeacher obj);

    void delete(int id);

}
