package com.entity.view;

import com.entity.DiscussliulangdongwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 流浪动物信息评论表
 * 后端Return视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要Return使用）
 * @author 
 * @email 
 * @date 2022-07-27 
 */
@TableName("discussliulangdongwuxinxi")
public class DiscussliulangdongwuxinxiView  extends DiscussliulangdongwuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussliulangdongwuxinxiView(){
	}
 
 	public DiscussliulangdongwuxinxiView(DiscussliulangdongwuxinxiEntity discussliulangdongwuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussliulangdongwuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
