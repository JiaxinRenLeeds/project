package com.entity.model;

import com.entity.ZhiyuanzheshenqingbiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * Volunteer application form
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的modelPicture name
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public class ZhiyuanzheshenqingbiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 是否Check
	 */
	
	private String sfsh;
		
	/**
	 * Reply
	 */
	
	private String shhf;
				
	
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
