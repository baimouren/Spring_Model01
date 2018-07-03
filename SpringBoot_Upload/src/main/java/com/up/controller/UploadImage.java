package com.up.controller;

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/uploadController")
public class UploadImage {

	@RequestMapping("/uploadImg")
	@ResponseBody
	public void uploadImg(MultipartFile file[], String areaName) throws Exception {
		System.out.println("得到的areaName:"+areaName);
		// 设置上传的路径是D盘下的picture
        String imgPath = "E:/picture/";
		
		for (MultipartFile f : file) {
			// 图片的名字用毫秒数+图片原来的名字拼接
			System.out.println(f.getSize());
			System.out.println(f.getBytes());
			String imgName = System.currentTimeMillis() + f.getOriginalFilename();
			//上传文件
			uploadFileUtil(f.getBytes(), imgPath, imgName);
		}
	}

	/**
	 * 上传文件的方法
	 * @param file：文件的字节
	 * @param imgPath：文件的路径
	 * @param imgName：文件的名字
	 * @throws Exception
	 */
	public void uploadFileUtil(byte[] file, String imgPath, String imgName) throws Exception {
		File targetFile = new File(imgPath);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		FileOutputStream out = new FileOutputStream(imgPath + imgName);
		out.write(file);
		out.flush();
		out.close();
	}
}
