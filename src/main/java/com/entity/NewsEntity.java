package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 流浪动物公告
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-07-27 
 */
@TableName("news")
public class NewsEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public NewsEntity() {
		
	}
	
	public NewsEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * Title
	 */
					
	private String title;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：Title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：Title
	 */
	public String getTitle() {
		return title;
	}
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
