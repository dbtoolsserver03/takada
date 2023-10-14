package com.baizhi.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("file")
public class FileController {

	/**
	 * 文件下载
	 *
	 */
	@GetMapping("easydownload")
	public void download(String fileName, HttpServletResponse response) throws IOException {
		//根据文件名去指定目录中查找文件
		String realPath = ResourceUtils.getURL("classpath:").getPath() + "static"+File.separator+"files";
		//读取文件
		File file = new File(realPath, fileName);
		//获取文件输入流
		FileInputStream is = new FileInputStream(file);
		//attachment; 附件下载   inline 在线打开(图片 pdf )
		response.setHeader("content-disposition", "attachment;fileName=" + fileName);
		//获取响应输出流
		ServletOutputStream os = response.getOutputStream();
		//文件拷贝
		IOUtils.copy(is, os);

		//关流方式(优雅)
		IOUtils.closeQuietly(is);
		IOUtils.closeQuietly(os);

		//        int len = 0;
		//        byte[] b = new byte[1024];
		//        while(true){
		//            len = is.read(b);
		//            if(len==-1)break;
		//            os.write(b,0,len);
		//        }
		//
		//        //关流
		//        is.close();
		//        os.close();
	}

	/**
	 * 文件上传
	 * @param aaa
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@PostMapping("easyupload")
	public String upload(MultipartFile aaa, HttpServletRequest request) throws IOException {

		//文件上传
		System.out.println("文件名: " + aaa.getOriginalFilename());
		System.out.println("文件类型: " + aaa.getContentType());
		System.out.println("文件大小: " + aaa.getSize());

		//处理文件上传
		//String realPath = request.getServletContext().getRealPath("/files");
		String realPath = ResourceUtils.getURL("classpath:").getPath() + "static"+File.separator+"files";
		//日期目录创建
		String dateDir = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

		File dir = new File(realPath, dateDir);
		if (!dir.exists())
			dir.mkdirs();
		//修改文件名
		String newFileNamePrefix = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())
				+ UUID.randomUUID().toString();
		String extension = FilenameUtils.getExtension(aaa.getOriginalFilename());
		String newFileName = newFileNamePrefix + "." + extension;
		aaa.transferTo(new File(dir, newFileName));
		return "redirect:/upload";
	}
}
