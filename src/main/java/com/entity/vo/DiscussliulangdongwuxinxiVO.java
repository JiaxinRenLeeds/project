package com.entity.vo;

import com.entity.DiscussliulangdongwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 流浪动物信息评论表
 * 手机端接口Return实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public class DiscussliulangdongwuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户id
	 */
	
	private Long userid;
		
	/**
	 * User name
	 */
	
	private String nickname;
		
	/**
	 * Comment content
	 */
	
	private String content;
		
	/**
	 * Reply content
	 */
	
	private String reply;
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
				
	
	/**
	 * 设置：User name
	 */
	 
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	/**
	 * 获取：User name
	 */
	public String getNickname() {
		return nickname;
	}
				
	
	/**
	 * 设置：Comment content
	 */
	 
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * 获取：Comment content
	 */
	public String getContent() {
		return content;
	}
				
	
	/**
	 * 设置：Reply content
	 */
	 
	public void setReply(String reply) {
		this.reply = reply;
	}
	
	/**
	 * 获取：Reply content
	 */
	public String getReply() {
		return reply;
	}
			
}
