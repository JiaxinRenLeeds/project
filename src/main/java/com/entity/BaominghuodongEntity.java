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
 * Registration activity
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-07-27 
 */
@TableName("baominghuodong")
public class BaominghuodongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaominghuodongEntity() {
		
	}
	
	public BaominghuodongEntity(T t) {
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
	 * Activity name
	 */
					
	private String huodongmingcheng;
	
	/**
	 * Activity time
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date huodongshijian;
	
	/**
	 * Activity locaton
	 */
					
	private String huodongdidian;
	
	/**
	 * Activity content
	 */
					
	private String huodongneirong;
	
	/**
	 * Photo
	 */
					
	private String tupian;
	
	/**
	 * Volunteer account
	 */
					
	private String zhiyuanzhezhanghao;
	
	/**
	 * Volunteer name
	 */
					
	private String zhiyuanzhexingming;
	
	/**
	 * Volunteer phonenumber
	 */
					
	private String zhiyuanzheshouji;
	
	/**
	 * Registration time
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date baomingshijian;
	
	/**
	 * 是否Check
	 */
					
	private String sfsh;
	
	/**
	 * Reply
	 */
					
	private String shhf;
	
	
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
	 * 设置：Activity name
	 */
	public void setHuodongmingcheng(String huodongmingcheng) {
		this.huodongmingcheng = huodongmingcheng;
	}
	/**
	 * 获取：Activity name
	 */
	public String getHuodongmingcheng() {
		return huodongmingcheng;
	}
	/**
	 * 设置：Activity time
	 */
	public void setHuodongshijian(Date huodongshijian) {
		this.huodongshijian = huodongshijian;
	}
	/**
	 * 获取：Activity time
	 */
	public Date getHuodongshijian() {
		return huodongshijian;
	}
	/**
	 * 设置：Activity locaton
	 */
	public void setHuodongdidian(String huodongdidian) {
		this.huodongdidian = huodongdidian;
	}
	/**
	 * 获取：Activity locaton
	 */
	public String getHuodongdidian() {
		return huodongdidian;
	}
	/**
	 * 设置：Activity content
	 */
	public void setHuodongneirong(String huodongneirong) {
		this.huodongneirong = huodongneirong;
	}
	/**
	 * 获取：Activity content
	 */
	public String getHuodongneirong() {
		return huodongneirong;
	}
	/**
	 * 设置：Photo
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：Photo
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：Volunteer account
	 */
	public void setZhiyuanzhezhanghao(String zhiyuanzhezhanghao) {
		this.zhiyuanzhezhanghao = zhiyuanzhezhanghao;
	}
	/**
	 * 获取：Volunteer account
	 */
	public String getZhiyuanzhezhanghao() {
		return zhiyuanzhezhanghao;
	}
	/**
	 * 设置：Volunteer name
	 */
	public void setZhiyuanzhexingming(String zhiyuanzhexingming) {
		this.zhiyuanzhexingming = zhiyuanzhexingming;
	}
	/**
	 * 获取：Volunteer name
	 */
	public String getZhiyuanzhexingming() {
		return zhiyuanzhexingming;
	}
	/**
	 * 设置：Volunteer phonenumber
	 */
	public void setZhiyuanzheshouji(String zhiyuanzheshouji) {
		this.zhiyuanzheshouji = zhiyuanzheshouji;
	}
	/**
	 * 获取：Volunteer phonenumber
	 */
	public String getZhiyuanzheshouji() {
		return zhiyuanzheshouji;
	}
	/**
	 * 设置：Registration time
	 */
	public void setBaomingshijian(Date baomingshijian) {
		this.baomingshijian = baomingshijian;
	}
	/**
	 * 获取：Registration time
	 */
	public Date getBaomingshijian() {
		return baomingshijian;
	}
	/**
	 * 设置：是否Check
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否Check
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：Reply
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：Reply
	 */
	public String getShhf() {
		return shhf;
	}

}
