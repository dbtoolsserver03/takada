package com.baizhi.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.baizhi.entity.User;
import com.baizhi.entity.original.UserFile;
import com.baizhi.service.UserFileService;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("file")
@Slf4j
public class UserFileController {

    private UserFileService service;

    @Value("${upload.dir}")
    private String uploadPath;
    
    @Autowired
    public UserFileController(UserFileService service) {
        this.service = service;
    }

	/**
	 * 文件删除
	 * @param aaa
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@GetMapping("delete")
	public String delete(String id) throws IOException {
		int idInt = Integer.valueOf(id);

		// 获取文件信息
		UserFile userFile = service.findById(idInt);
		//根据文件名去指定目录中查找文件
		String dateDir = uploadPath + File.separator + userFile.getPath();
		//读取文件
		File file = new File(dateDir, userFile.getNewFileName());
		// 删除文件
		if (file.exists()) file.delete();
		
		// 删除数据库
		service.delete(idInt);
		return "redirect:/upload";
	}
	
    /**
     * 初期检索
     */
    @GetMapping("showAll")
    public String findAll(HttpSession session, Model model){
    	User user =(User) session.getAttribute("user");
    	List<UserFile> lst = service.findByUserName(user.getUsername());
    	
    	// 存入作用域中
    	model.addAttribute("files", lst);
    	
        return "upload/showAll";
    }

	/**
	 * 文件下载
	 *
	 */
	@GetMapping("download")
	public void download(String openStyle, String id, HttpSession session, HttpServletResponse response) throws IOException { 
		
		// 获取打开方式
		openStyle = openStyle==null?"atachment":openStyle;
		int idInt = Integer.valueOf(id);

		// 获取文件信息
		UserFile userFile = service.findById(idInt);
		
		if ("atachment".equals(openStyle)) {
			User user = (User) session.getAttribute("user");

			// 更新下载次数
			service.update(UserFile.builder().id(idInt).downcounts(userFile.getDowncounts() + 1)
					.updateTime(new Date()).updateUserId(user.getUsername()).build());

		}

		//根据文件名去指定目录中查找文件
		String dateDir = uploadPath + File.separator + userFile.getPath();

		//读取文件
		File file = new File(dateDir, userFile.getNewFileName());
		//获取文件输入流
		FileInputStream is = new FileInputStream(file);
		//attachment; 附件下载   inline 在线打开(图片 pdf )
		response.setHeader("content-disposition",
				openStyle+";fileName=" + URLEncoder.encode(userFile.getOldFileName(), "UTF-8"));
		//获取响应输出流
		ServletOutputStream os = response.getOutputStream();
		//文件拷贝
		IOUtils.copy(is, os);

		//关流方式(优雅)
		IOUtils.closeQuietly(is);
		IOUtils.closeQuietly(os);
	}

	/**
	 * 文件上传
	 * @param aaa
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@PostMapping("upload")
	public String upload(MultipartFile aaa, HttpServletRequest request,HttpSession session, Model model) throws IOException {

		//文件上传
		System.out.println("文件名: " + aaa.getOriginalFilename());
		System.out.println("文件类型: " + aaa.getContentType());
		System.out.println("文件大小: " + aaa.getSize());

		//处理文件上传
		//日期目录创建
		String dateDir =  new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		
		File dir = new File(uploadPath + File.separator + dateDir);
		if (!dir.exists())
			dir.mkdirs();
		//修改文件名
		String dateFormat =  new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		String newFileNamePrefix =dateFormat
				+ UUID.randomUUID().toString();
		String extension = FilenameUtils.getExtension(aaa.getOriginalFilename());
		String newFileName = newFileNamePrefix + "." + extension;
		
		// 将文件上传
		aaa.transferTo(new File(dir, newFileName));
		
	 	User user =(User) session.getAttribute("user");
    	
		// 将文件信息放入数据库保存
		service.save(UserFile.builder().oldFileName(aaa.getOriginalFilename()).newFileName(newFileName).ext(extension).username(user.getUsername())
				.size(String.valueOf(aaa.getSize())).type(aaa.getContentType()).path(dateDir)
				.createUserId(user.getUsername()).updateUserId(user.getUsername()).build());
		return "redirect:/upload";
	}
	
    /**
     * 初期检索
     */
    @GetMapping("findAllJson")
    @ResponseBody
    public List<UserFile> findAllJson(HttpSession session, Model model){
    	User user =(User) session.getAttribute("user");
    	List<UserFile> lst = service.findByUserName(user.getUsername());
    	
    	// 存入作用域中
    	model.addAttribute("files", lst);
    	
        return lst;
    }
    
}
