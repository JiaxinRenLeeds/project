package com.entity.view;

import com.entity.ZhiyuanzheshenqingbiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * Volunteer application form
 * 后端Return视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要Return使用）
 * @author 
 * @email 
 * @date 2022-07-27 
 */
@TableName("zhiyuanzheshenqingbiao")
public class ZhiyuanzheshenqingbiaoView  extends ZhiyuanzheshenqingbiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiyuanzheshenqingbiaoView(){
	}
 
 	public ZhiyuanzheshenqingbiaoView(ZhiyuanzheshenqingbiaoEntity zhiyuanzheshenqingbiaoEntity){
 	try {
			BeanUtils.copyProperties(this, zhiyuanzheshenqingbiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
