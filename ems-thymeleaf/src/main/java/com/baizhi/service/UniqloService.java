package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.Uniqlo;
import com.baizhi.entity.vo.UniqloVo;

public interface UniqloService {

    List<Uniqlo> lists(UniqloVo vo);

	int addRec(UniqloVo vo);

	int updateRec(UniqloVo vo);

	Uniqlo getOneRec(int id);

	int deleteOneRec(int id);

}
