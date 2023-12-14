package com.baizhi.service;
import java.util.List;

import com.baizhi.entity.original.Snacks;
import com.baizhi.entity.vo.SnacksVo;
public interface SnacksService {

	 List<Snacks> lists(SnacksVo vo);

	int addRec(SnacksVo vo);

	int updateRec(SnacksVo vo);

	Snacks getOneRec(int id);

	int deleteOneRec(int id);

	}