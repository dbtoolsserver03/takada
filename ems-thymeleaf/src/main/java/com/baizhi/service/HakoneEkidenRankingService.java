package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.THakoneEkidenRanking;


public interface HakoneEkidenRankingService {

    //队伍列表方法
    List<THakoneEkidenRanking> list();
    
    //保存列表方法
    void save(THakoneEkidenRanking obj);

    //根据id查询一个
    THakoneEkidenRanking findById(Integer id);

    //更新队伍信息
    void update(THakoneEkidenRanking obj);

    //删除队伍信息
    void delete(Integer id);

	





}