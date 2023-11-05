package com.baizhi.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("uniqlo")
@Slf4j
public class UniqloController {

    /**
     * uniqlo列表
     *
     * @return
     */
    @RequestMapping("searchByCondition")
    public String lists(@RequestParam String name ,
    		@RequestParam String type,
    		@RequestParam(defaultValue = "") String size,
    		@RequestParam String priceBegin,
    		@RequestParam String priceEnd,
    		@RequestParam String saleBegin,
    		
    		Model model) {
        log.debug("查询所有uniqlo信息");
       
        log.debug(name);
        log.debug(type);
        log.debug(size);
        log.debug(priceBegin);
        log.debug(priceEnd);
        
        // model里的数据，可以显示在画面上。
        model.addAttribute("namexxx", name);
        model.addAttribute("priceBegin", priceBegin);
        
        // date回显
        model.addAttribute("saleBegin",getDate(saleBegin,"yyyy-MM-dd") );
        
        // 检索数据库
        return "uniqlo/uniqlolist";
    }
    
    

	private static Date getDate(String ymd,String format) {
		SimpleDateFormat sdFormat = new SimpleDateFormat(format);
		Date date=null;
		try {
			date = sdFormat.parse(ymd);
			
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return date;
	}
}
