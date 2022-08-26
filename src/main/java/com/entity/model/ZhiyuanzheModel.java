package com.entity.model;

import com.entity.ZhiyuanzheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * Volunteer
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的modelPicture name
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public class ZhiyuanzheModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
