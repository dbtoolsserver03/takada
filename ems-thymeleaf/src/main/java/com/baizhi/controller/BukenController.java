package com.baizhi.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.baizhi.constant.MasterInfo;
import com.baizhi.entity.User;
import com.baizhi.entity.original.MCode;
import com.baizhi.entity.original.MDensya;
import com.baizhi.entity.original.MDensyaEki;
import com.baizhi.entity.original.TBuken;
import com.baizhi.entity.original.TBukenIcon;
import com.baizhi.entity.vo.BukenAddVo;
import com.baizhi.entity.vo.BukenContidionVo;
import com.baizhi.entity.vo.BukenRec;
import com.baizhi.entity.vo.BukenUpdateVo;
import com.baizhi.service.BukenService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("buken")
@Slf4j
public class BukenController {

	@Autowired
	BukenService service;

	@Autowired
	private MasterInfo masterInfo;

	@Value("${upload.dir}")
	private String realpath;

	/**
	 * 物件検索一覧
	 *
	 * @return
	 */
	@RequestMapping("searchLst")
	public String searchLst(Model model, BukenContidionVo contionVo) {

		log.debug("画面のパラメーターは：" + contionVo.toString());

		List<BukenRec> objList = service.searchList(contionVo);
		Map<String, MCode> masterMadoriMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_MADORI);
		contionVo.setMasterMadoriMap(masterMadoriMap);

		Map<String, MCode> masterDirectionMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_DIRECTION);
		contionVo.setMasterDirectionMap(masterDirectionMap);

		Map<String, MCode> masterPointMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_POINT);
		contionVo.setMasterPointMap(masterPointMap);

		Map<String, MCode> masterTypeMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_TYPE);
		contionVo.setMasterTypeMap(masterTypeMap);
		

		Map<String, MCode> masterDensyaTypeMap = masterInfo.getCodeMap().get(MasterInfo.DENSYA_TYPE);
		contionVo.setMasterDensyaTypeMap(masterDensyaTypeMap);
		

		model.addAttribute("vo", contionVo);
		model.addAttribute("objLst", objList);

		return "buken/bukenSearchLst";
	}

	/**
	 * 物件画面初期化
	 *
	 * @return
	 */
	@RequestMapping("manageBuken")
	public String init(Model model) {

		BukenContidionVo contionVo = new BukenContidionVo();

		Map<String, MCode> masterMadoriMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_MADORI);
		contionVo.setMasterMadoriMap(masterMadoriMap);

		Map<String, MCode> masterDensyaTypeMap = masterInfo.getCodeMap().get(MasterInfo.DENSYA_TYPE);
		contionVo.setMasterDensyaTypeMap(masterDensyaTypeMap);
		
		model.addAttribute("vo", contionVo);

		return "buken/bukenSearchLst";
	}

	/**
	 * 物件新規画面初期化
	 *
	 * @return
	 */
	@RequestMapping("addInit")
	public String addInit(Model model) {

		log.debug("新規画面に、必要なデータをロードする");

		BukenAddVo addVo = new BukenAddVo();

		Map<String, MCode> masterMadoriMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_MADORI);
		addVo.setMasterMadoriMap(masterMadoriMap);

		Map<String, MCode> masterDirectionMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_DIRECTION);
		addVo.setMasterDirectionMap(masterDirectionMap);

		Map<String, MCode> masterPointMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_POINT);
		addVo.setMasterPointMap(masterPointMap);

		Map<String, MCode> masterTypeMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_TYPE);
		addVo.setMasterTypeMap(masterTypeMap);

		Map<String, MCode> masterDensyaTypeMap = masterInfo.getCodeMap().get(MasterInfo.DENSYA_TYPE);
		addVo.setMasterDensyaTypeMap(masterDensyaTypeMap);
		
		model.addAttribute("vo", addVo);

		return "buken/bukenAdd";
	}

	/**
	 * ファイルアップロード共通メソッド
	 * 
	 * @param img
	 * @param originalFilename
	 * @return
	 * @throws IOException
	 */
	private String uploadPhoto(MultipartFile img, String originalFilename) throws IOException {
		String fileNamePrefix = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())
				+ "_" + UUID.randomUUID().toString();
		String fileNameSuffix = originalFilename.substring(originalFilename.lastIndexOf("."));
		String newFileName = fileNamePrefix + fileNameSuffix;
		img.transferTo(new File(realpath, newFileName));
		return newFileName;
	}

	/**
	 * 物件新規画面の追加処理
	 *
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("addExecute")
	public String addExecute(BukenAddVo addVo, MultipartFile[] urls, HttpSession session) throws IOException {

		log.debug("新規画面の追加処理を行う");

		User user = (User) session.getAttribute("user");
		addVo.getRec().setCreateUserId(user.getUsername());

		service.addBuken(addVo.getRec());

		List<String> urlsLst = new ArrayList<String>();

		if (urls != null && urls[0].getOriginalFilename().length()!=0) {
			for (MultipartFile img : urls) {
				// 画像のアップロード処理を行う。
				String originalFilename = img.getOriginalFilename();
				
				
				String newFileName = uploadPhoto(img, originalFilename);
				urlsLst.add(newFileName);
			}

			service.addBukenIcon(addVo.getRec().getBukenId(), user.getUsername(), urlsLst);
		}

		return "redirect:searchLst";
	}

	/**
	 * 物件更新画面初期化
	 *
	 * @return
	 */
	@RequestMapping("updateInit")
	public String updateInit(Model model, Integer id) {

		log.debug("更新画面に、必要なデータをロードする");

		BukenUpdateVo vo = new BukenUpdateVo();

		Map<String, MCode> masterMadoriMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_MADORI);
		vo.setMasterMadoriMap(masterMadoriMap);

		Map<String, MCode> masterDirectionMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_DIRECTION);
		vo.setMasterDirectionMap(masterDirectionMap);

		Map<String, MCode> masterPointMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_POINT);
		vo.setMasterPointMap(masterPointMap);

		Map<String, MCode> masterTypeMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_TYPE);
		vo.setMasterTypeMap(masterTypeMap);

		TBuken rec = service.getOneRec(id);
		vo.setRec(rec);

		List<TBukenIcon> icons = service.getAllIcon(id);
		vo.setIcons(icons);

		model.addAttribute("vo", vo);

		return "buken/bukenUpdate";
	}

	/**
	 * 物件更新画面の更新処理
	 *
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("updateExecute")
	public String updateExecute(BukenUpdateVo vo, MultipartFile[] urls, HttpSession session) throws IOException {

		log.debug("更新画面の更新処理を行う");

		User user = (User) session.getAttribute("user");
		vo.getRec().setCreateUserId(user.getUsername());

		service.updateBuken(vo.getRec());

		List<String> urlsLst = new ArrayList<String>();

		if (urls != null) {
			for (MultipartFile img : urls) {
				// 画像のアップロード処理を行う。
				String originalFilename = img.getOriginalFilename();
				String newFileName = uploadPhoto(img, originalFilename);
				urlsLst.add(newFileName);

			}

			List<TBukenIcon> icons = service.getAllIcon(vo.getRec().getBukenId());

			// ファイルを削除する。
			for (TBukenIcon icon : icons) {
				String iconPath = realpath + File.separator + icon.getUrl();

				File f = new File(iconPath);
				f.delete();
			}

			service.updateBukenIcon(vo.getRec().getBukenId(), user.getUsername(), urlsLst);
		}

		return "redirect:searchLst";
	}

	/**
	 * 物件の削除処理
	 *
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("deleteAllExecute")
	public String deleteAllExecute(Integer[] bukenIds, HttpSession session) throws IOException {

		log.debug("物件の削除処理を行う");

		// DISK容量を考慮し、ファイルサーバーからゴミ画像を削除する。
		for (Integer bukenId : bukenIds) {

			List<TBukenIcon> icons = service.getAllIcon(bukenId);

			for (TBukenIcon icon : icons) {
				String iconPath = realpath + File.separator + icon.getUrl();

				File f = new File(iconPath);
				f.delete();
			}

		}

		service.deleteAll(bukenIds);

		return "redirect:searchLst";
	}


	/**
	 * 物件詳細画面初期化
	 *
	 * @return
	 */
	@RequestMapping("detailInit")
	public String detailInit(Model model, Integer id) {

		log.debug("更新画面に、必要なデータをロードする");

		BukenUpdateVo vo = new BukenUpdateVo();

		Map<String, MCode> masterMadoriMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_MADORI);
		vo.setMasterMadoriMap(masterMadoriMap);

		Map<String, MCode> masterDirectionMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_DIRECTION);
		vo.setMasterDirectionMap(masterDirectionMap);

		Map<String, MCode> masterPointMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_POINT);
		vo.setMasterPointMap(masterPointMap);

		Map<String, MCode> masterTypeMap = masterInfo.getCodeMap().get(MasterInfo.BUKEN_TYPE);
		vo.setMasterTypeMap(masterTypeMap);

		TBuken rec = service.getOneRec(id);
		vo.setRec(rec);

		List<TBukenIcon> icons = service.getAllIcon(id);
		vo.setIcons(icons);

		model.addAttribute("vo", vo);

		return "buken/bukenDetail";
	}

	
	@RequestMapping("downloadCsv")
	@ResponseBody
	public void downloadCsv(BukenContidionVo contionVo, HttpServletResponse response) throws IOException {

		log.debug("画面のパラメーターは：" + contionVo.toString());

		List<BukenRec> objList = service.searchList(contionVo);

		// リスポンスにCSVの属性を設定する
		response.setContentType("text/csv");
		response.setHeader("Content-Disposition", "attachment; filename=bukenlst.csv");

		Writer writer = new OutputStreamWriter(response.getOutputStream());

		String[] header = { "bukenId", "location", "nearStationTime", "bukenYear" };
		
		writer.write(String.join(",", header));
		
		// システムより改行する
		writer.write(System.lineSeparator());
		for (BukenRec rec : objList) {
			
			 writer.write(
					 rec.getBuken().getBukenId()+","+
					 rec.getBuken().getLocation()+","+
					 rec.getBuken().getNearStationTime()+","+
					 rec.getBuken().getBukenYear());
			 writer.write(System.lineSeparator());
		}
		
		writer.close();

	}
	

	/**
	 * AJAXを利用し、電車名データを取得する。
	 *
	 * @return
	 */
	@RequestMapping("ajaxGetDensyaName")
	public @ResponseBody Map<String, Object> handleAjaxRequest(@RequestBody Map<String, Object> requestParams) {

		Map<String, Object> responseData = new HashMap<>();

		List<MDensya> lst = service.findDensyaLst((String) requestParams.get("densyaType"));

		responseData.put("densyaLst", lst);
		

		// リスポンスを戻ります。
		return responseData;
	}

	
	
	/**
	 * AJAXを利用し、駅名データを取得する。
	 *
	 * @return
	 */
	@RequestMapping("ajaxGetDensyaName02")
	public @ResponseBody Map<String, Object> handleAjaxRequest02(@RequestBody Map<String, Object> requestParams) {

		Map<String, Object> responseData = new HashMap<>();

		List<MDensyaEki> lst = service.findEkiInfoLst((String) requestParams.get("densyaType"),Integer.valueOf((String)requestParams.get("densyaNo")) );

		responseData.put("densyaEkiLst", lst);
		

		// リスポンスを戻ります。
		return responseData;
	}

	
}
