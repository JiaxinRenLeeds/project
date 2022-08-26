package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DongwuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DongwuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DongwuleixingView;


/**
 * Animal type
 *
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public interface DongwuleixingService extends IService<DongwuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DongwuleixingVO> selectListVO(Wrapper<DongwuleixingEntity> wrapper);
   	
   	DongwuleixingVO selectVO(@Param("ew") Wrapper<DongwuleixingEntity> wrapper);
   	
   	List<DongwuleixingView> selectListView(Wrapper<DongwuleixingEntity> wrapper);
   	
   	DongwuleixingView selectView(@Param("ew") Wrapper<DongwuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DongwuleixingEntity> wrapper);
   	
}

