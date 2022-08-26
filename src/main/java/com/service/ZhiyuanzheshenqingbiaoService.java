package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiyuanzheshenqingbiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiyuanzheshenqingbiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyuanzheshenqingbiaoView;


/**
 * Volunteer application form
 *
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public interface ZhiyuanzheshenqingbiaoService extends IService<ZhiyuanzheshenqingbiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiyuanzheshenqingbiaoVO> selectListVO(Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper);
   	
   	ZhiyuanzheshenqingbiaoVO selectVO(@Param("ew") Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper);
   	
   	List<ZhiyuanzheshenqingbiaoView> selectListView(Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper);
   	
   	ZhiyuanzheshenqingbiaoView selectView(@Param("ew") Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper);
   	
}

