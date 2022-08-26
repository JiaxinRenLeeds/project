package com.entity.model;

import com.entity.NewsEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 流浪动物公告
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的modelPicture name
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public class NewsModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Introduction
	 */
	
	private String introduction;
		
	/**
	 * Photo
	 */
	
	private String picture;
		
	/**
	 * Content
	 */
	
	private String content;
				
	
	/**
	 * 设置：Introduction
	 */
	 
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	/**
	 * 获取：Introduction
	 */
	public String getIntroduction() {
		return introduction;
	}
				
	
	/**
	 * 设置：Photo
	 */
	 
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	/**
	 * 获取：Photo
	 */
	public String getPicture() {
		return picture;
	}
				
	
	/**
	 * 设置：Content
	 */
	 
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * 获取：Content
	 */
	public String getContent() {
		return content;
	}
			
}
