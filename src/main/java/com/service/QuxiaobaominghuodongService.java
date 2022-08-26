package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuxiaobaominghuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuxiaobaominghuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuxiaobaominghuodongView;


/**
 * Cancel registration activity
 *
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public interface QuxiaobaominghuodongService extends IService<QuxiaobaominghuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaobaominghuodongVO> selectListVO(Wrapper<QuxiaobaominghuodongEntity> wrapper);
   	
   	QuxiaobaominghuodongVO selectVO(@Param("ew") Wrapper<QuxiaobaominghuodongEntity> wrapper);
   	
   	List<QuxiaobaominghuodongView> selectListView(Wrapper<QuxiaobaominghuodongEntity> wrapper);
   	
   	QuxiaobaominghuodongView selectView(@Param("ew") Wrapper<QuxiaobaominghuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuxiaobaominghuodongEntity> wrapper);
   	
}

