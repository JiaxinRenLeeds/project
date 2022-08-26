package com.entity.view;

import com.entity.ZhiyuantuanduihuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 志愿团队活动
 * 后端Return视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要Return使用）
 * @author 
 * @email 
 * @date 2022-07-27 
 */
@TableName("zhiyuantuanduihuodong")
public class ZhiyuantuanduihuodongView  extends ZhiyuantuanduihuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiyuantuanduihuodongView(){
	}
 
 	public ZhiyuantuanduihuodongView(ZhiyuantuanduihuodongEntity zhiyuantuanduihuodongEntity){
 	try {
			BeanUtils.copyProperties(this, zhiyuantuanduihuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
