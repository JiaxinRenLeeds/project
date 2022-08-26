package com.entity.model;

import com.entity.QuxiaolingyangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * Cancel adoption information
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的modelPicture name
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public class QuxiaolingyangxinxiModel  implements Serializable {
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
	
	private String jiuzhushijian;
		
	/**
	 * Rescue location
	 */
	
	private String jiuzhudidian;
		
	/**
	 * Photo
	 */
	
	private String tupian;
		
	/**
	 * User account
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * User name
	 */
	
	private String yonghuxingming;
		
	/**
	 * Contact number
	 */
	
	private String lianxifangshi;
		
	/**
	 * Adoption time
	 */
	
	private String lingyangshijian;
		
	/**
	 * Cancel adoption time
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date quxiaolingyangshijian;
		
	/**
	 * Cancel reason
	 */
	
	private String quxiaoyuanyin;
		
	/**
	 * 是否Check
	 */
	
	private String sfsh;
		
	/**
	 * Reply
	 */
	
	private String shhf;
				
	
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
	 
	public void setJiuzhushijian(String jiuzhushijian) {
		this.jiuzhushijian = jiuzhushijian;
	}
	
	/**
	 * 获取：Rescue time
	 */
	public String getJiuzhushijian() {
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
	 * 设置：Adoption time
	 */
	 
	public void setLingyangshijian(String lingyangshijian) {
		this.lingyangshijian = lingyangshijian;
	}
	
	/**
	 * 获取：Adoption time
	 */
	public String getLingyangshijian() {
		return lingyangshijian;
	}
				
	
	/**
	 * 设置：Cancel adoption time
	 */
	 
	public void setQuxiaolingyangshijian(Date quxiaolingyangshijian) {
		this.quxiaolingyangshijian = quxiaolingyangshijian;
	}
	
	/**
	 * 获取：Cancel adoption time
	 */
	public Date getQuxiaolingyangshijian() {
		return quxiaolingyangshijian;
	}
				
	
	/**
	 * 设置：Cancel reason
	 */
	 
	public void setQuxiaoyuanyin(String quxiaoyuanyin) {
		this.quxiaoyuanyin = quxiaoyuanyin;
	}
	
	/**
	 * 获取：Cancel reason
	 */
	public String getQuxiaoyuanyin() {
		return quxiaoyuanyin;
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
