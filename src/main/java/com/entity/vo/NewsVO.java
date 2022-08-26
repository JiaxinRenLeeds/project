package com.entity.vo;

import com.entity.NewsEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 流浪动物公告
 * 手机端接口Return实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public class NewsVO  implements Serializable {
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
