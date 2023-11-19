package com.baizhi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.entity.original.Snacks;
import com.baizhi.entity.vo.SnacksVo;

@Service
@Transactional
public interface SnacksService  {

	


    
    public List<Snacks> lists(SnacksVo vo) ;

}