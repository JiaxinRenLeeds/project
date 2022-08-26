package com.entity.view;

import com.entity.DiscusszhiyuantuanduihuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 志愿团队活动评论表
 * 后端Return视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要Return使用）
 * @author 
 * @email 
 * @date 2022-07-27 
 */
@TableName("discusszhiyuantuanduihuodong")
public class DiscusszhiyuantuanduihuodongView  extends DiscusszhiyuantuanduihuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszhiyuantuanduihuodongView(){
	}
 
 	public DiscusszhiyuantuanduihuodongView(DiscusszhiyuantuanduihuodongEntity discusszhiyuantuanduihuodongEntity){
 	try {
			BeanUtils.copyProperties(this, discusszhiyuantuanduihuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
