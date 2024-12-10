package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.MDensya;
import com.baizhi.entity.original.TBuken;
import com.baizhi.entity.original.TBukenIcon;
import com.baizhi.entity.vo.BukenContidionVo;

public interface BukenService {

	
	/**
	 * 物件検索一覧
	 * 
	 * @param contionVo
	 * @return
	 */
	 List<TBuken> searchList(BukenContidionVo contionVo);

	/**
	 * 物件テーブルにレコードを追加する。
	 * @param rec
	 * @return
	 */
	int addBuken(TBuken rec);

	/**
	 * 物件アイコンんテーブルにレコードを追加する。
	 * 
	 * @param bukenId
	 * @param username
	 * @param urlsLst
	 * @return
	 */
	int addBukenIcon(Integer bukenId, String username, List<String> urlsLst);

	/**
	 * 物件テーブルからレコードを取得する。
	 * @param bukenId 物件ID
	 * @return
	 */
	TBuken getOneRec(Integer bukenId);

	/**
	 * 物件IDにより、物件に関するアイコンレコードを取得する。
	 * @param id 物件ID
	 * @return
	 */
	List<TBukenIcon> getAllIcon(Integer id);

	/**
	 * 物件を更新する。
	 * @param rec 物件レコード
	 * @return
	 */
	int updateBuken(TBuken rec);

	/**
	 * 物件アイコンを更新する。
	 * @param bukenId 物件ID
	 * @param username　ユーザ名
	 * @param urlsLst　画像リスト
	 * @return
	 */
	int updateBukenIcon(Integer bukenId, String username, List<String> urlsLst);

	/**
	 * 物件IDを一件ずつ削除する。
	 * @param bukenIds
	 * @return
	 */
	int deleteAll(Integer[] bukenIds);

	/**
	 * 電車類型より、電車リストを取得する。
	 * @param densyaType
	 * @return
	 */
	List<MDensya> findDensyaLst(String densyaType);

}
