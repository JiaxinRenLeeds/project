package com.entity.view;

import com.entity.QuxiaolingyangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * Cancel adoption information
 * 后端Return视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要Return使用）
 * @author 
 * @email 
 * @date 2022-07-27 
 */
@TableName("quxiaolingyangxinxi")
public class QuxiaolingyangxinxiView  extends QuxiaolingyangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuxiaolingyangxinxiView(){
	}
 
 	public QuxiaolingyangxinxiView(QuxiaolingyangxinxiEntity quxiaolingyangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, quxiaolingyangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
