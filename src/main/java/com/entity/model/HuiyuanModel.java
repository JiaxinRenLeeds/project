package com.entity.model;

import com.entity.HuiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * User
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的modelPicture name
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public class HuiyuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
