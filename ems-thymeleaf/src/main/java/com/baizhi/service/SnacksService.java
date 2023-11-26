package com.baizhi.service;
import java.util.List;

import com.baizhi.entity.original.Snacks;
import com.baizhi.entity.vo.SnacksVo;
public interface SnacksService {

	 List<Snacks> lists(SnacksVo vo);

	}