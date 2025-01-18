package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.Senmongakusei;

public interface SenmonService {

	/**
	 * 専門学生検索一覧
	 * 
	 * @param contionVo
	 * @return
	 */
	List<Senmongakusei> searchList(Senmongakusei contionVo);

	void addRec(Senmongakusei obj);

}
