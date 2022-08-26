package com.entity.model;

import com.entity.StoreupEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 收藏表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的modelPicture name
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public class StoreupModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 收藏id
	 */
	
	private Long refid;
		
	/**
	 * 表名
	 */
	
	private String tablename;
		
	/**
	 * 收藏Picture name
	 */
	
	private String name;
		
	/**
	 * 收藏Photo
	 */
	
	private String picture;
				
	
	/**
	 * 设置：收藏id
	 */
	 
	public void setRefid(Long refid) {
		this.refid = refid;
	}
	
	/**
	 * 获取：收藏id
	 */
	public Long getRefid() {
		return refid;
	}
				
	
	/**
	 * 设置：表名
	 */
	 
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	
	/**
	 * 获取：表名
	 */
	public String getTablename() {
		return tablename;
	}
				
	
	/**
	 * 设置：收藏Picture name
	 */
	 
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 获取：收藏Picture name
	 */
	public String getName() {
		return name;
	}
				
	
	/**
	 * 设置：收藏Photo
	 */
	 
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	/**
	 * 获取：收藏Photo
	 */
	public String getPicture() {
		return picture;
	}
			
}
