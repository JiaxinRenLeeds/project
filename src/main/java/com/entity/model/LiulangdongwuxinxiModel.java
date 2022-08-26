package com.entity.model;

import com.entity.LiulangdongwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 流浪动物信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的modelPicture name
 * @author 
 * @email 
 * @date 2021-04-27 17:02:34
 */
public class LiulangdongwuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Animal characteristics
	 */
	
	private String dongwutezheng;
		
	/**
	 * Animal details
	 */
	
	private String dongwuxiangqing;
		
	/**
	 * Rescue time
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiuzhushijian;
		
	/**
	 * Rescue location
	 */
	
	private String jiuzhudidian;
		
	/**
	 * Photo
	 */
	
	private String tupian;
		
	/**
	 * Adopted or not
	 */
	
	private String shifouyijinglingyang;
				
	
	/**
	 * 设置：Animal characteristics
	 */
	 
	public void setDongwutezheng(String dongwutezheng) {
		this.dongwutezheng = dongwutezheng;
	}
	
	/**
	 * 获取：Animal characteristics
	 */
	public String getDongwutezheng() {
		return dongwutezheng;
	}
				
	
	/**
	 * 设置：Animal details
	 */
	 
	public void setDongwuxiangqing(String dongwuxiangqing) {
		this.dongwuxiangqing = dongwuxiangqing;
	}
	
	/**
	 * 获取：Animal details
	 */
	public String getDongwuxiangqing() {
		return dongwuxiangqing;
	}
				
	
	/**
	 * 设置：Rescue time
	 */
	 
	public void setJiuzhushijian(Date jiuzhushijian) {
		this.jiuzhushijian = jiuzhushijian;
	}
	
	/**
	 * 获取：Rescue time
	 */
	public Date getJiuzhushijian() {
		return jiuzhushijian;
	}
				
	
	/**
	 * 设置：Rescue location
	 */
	 
	public void setJiuzhudidian(String jiuzhudidian) {
		this.jiuzhudidian = jiuzhudidian;
	}
	
	/**
	 * 获取：Rescue location
	 */
	public String getJiuzhudidian() {
		return jiuzhudidian;
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
	 * 设置：Adopted or not
	 */
	 
	public void setShifouyijinglingyang(String shifouyijinglingyang) {
		this.shifouyijinglingyang = shifouyijinglingyang;
	}
	
	/**
	 * 获取：Adopted or not
	 */
	public String getShifouyijinglingyang() {
		return shifouyijinglingyang;
	}
			
}
