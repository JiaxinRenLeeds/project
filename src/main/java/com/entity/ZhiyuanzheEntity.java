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
 * Volunteer
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-07-27 
 */
@TableName("zhiyuanzhe")
public class ZhiyuanzheEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhiyuanzheEntity() {
		
	}
	
	public ZhiyuanzheEntity(T t) {
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
	 * Volunteer account
	 */
					
	private String zhiyuanzhezhanghao;
	
	/**
	 * Password
	 */
					
	private String mima;
	
	/**
	 * Volunteer name
	 */
					
	private String zhiyuanzhexingming;
	
	/**
	 * Gender
	 */
					
	private String xingbie;
	
	/**
	 * Volunteer phonenumber
	 */
					
	private String zhiyuanzheshouji;
	
	/**
	 * ID number
	 */
					
	private String shenfenzheng;
	
	/**
	 * Email
	 */
					
	private String youxiang;
	
	/**
	 * Photo
	 */
					
	private String touxiang;
	
	
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
	 * 设置：Password
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：Password
	 */
	public String getMima() {
		return mima;
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
	 * 设置：Gender
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：Gender
	 */
	public String getXingbie() {
		return xingbie;
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
	 * 设置：ID number
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：ID number
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	/**
	 * 设置：Email
	 */
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	/**
	 * 获取：Email
	 */
	public String getYouxiang() {
		return youxiang;
	}
	/**
	 * 设置：Photo
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：Photo
	 */
	public String getTouxiang() {
		return touxiang;
	}

}
