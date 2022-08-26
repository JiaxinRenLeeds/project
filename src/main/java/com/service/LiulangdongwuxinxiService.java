package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiulangdongwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiulangdongwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiulangdongwuxinxiView;

/**
 * 流浪动物信息
 * Stray Animal Information
 */
public interface LiulangdongwuxinxiService extends IService<LiulangdongwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiulangdongwuxinxiVO> selectListVO(Wrapper<LiulangdongwuxinxiEntity> wrapper);
   	
   	LiulangdongwuxinxiVO selectVO(@Param("ew") Wrapper<LiulangdongwuxinxiEntity> wrapper);
   	
   	List<LiulangdongwuxinxiView> selectListView(Wrapper<LiulangdongwuxinxiEntity> wrapper);
   	
   	LiulangdongwuxinxiView selectView(@Param("ew") Wrapper<LiulangdongwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiulangdongwuxinxiEntity> wrapper);
   	
}

