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
 * User
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-07-27 
 */
@TableName("huiyuan")
public class HuiyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyuanEntity() {
		
	}
	
	public HuiyuanEntity(T t) {
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
	 * User account
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * Password
	 */
					
	private String mima;
	
	/**
	 * User name
	 */
					
	private String yonghuxingming;
	
	/**
	 * Gender
	 */
					
	private String xingbie;
	
	/**
	 * Contact number
	 */
					
	private String lianxifangshi;
	
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
	 * 设置：User account
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：User account
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
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
	 * 设置：User name
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：User name
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
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
	 * 设置：Contact number
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：Contact number
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
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
