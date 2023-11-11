package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.Uniqlo;
import com.baizhi.entity.vo.UniqloVo;

public interface UniqloService {

    //保存信息
    void save(Uniqlo o);

    //根据id查询一个
    Uniqlo findById(Integer id);

    //更新信息
    void update(Uniqlo o);

    //删除信息
    void delete(Integer id);
    
    //列表方法
    List<Uniqlo> lists(UniqloVo vo);

	int savelists(UniqloVo vo);

}
