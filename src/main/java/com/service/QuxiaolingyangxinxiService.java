package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuxiaolingyangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuxiaolingyangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuxiaolingyangxinxiView;


/**
 * Cancel adoption information
 *
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public interface QuxiaolingyangxinxiService extends IService<QuxiaolingyangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaolingyangxinxiVO> selectListVO(Wrapper<QuxiaolingyangxinxiEntity> wrapper);
   	
   	QuxiaolingyangxinxiVO selectVO(@Param("ew") Wrapper<QuxiaolingyangxinxiEntity> wrapper);
   	
   	List<QuxiaolingyangxinxiView> selectListView(Wrapper<QuxiaolingyangxinxiEntity> wrapper);
   	
   	QuxiaolingyangxinxiView selectView(@Param("ew") Wrapper<QuxiaolingyangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuxiaolingyangxinxiEntity> wrapper);
   	
}

