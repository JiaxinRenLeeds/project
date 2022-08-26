package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussliulangdongwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussliulangdongwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussliulangdongwuxinxiView;


/**
 * 流浪动物信息评论表
 *
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public interface DiscussliulangdongwuxinxiService extends IService<DiscussliulangdongwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussliulangdongwuxinxiVO> selectListVO(Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);
   	
   	DiscussliulangdongwuxinxiVO selectVO(@Param("ew") Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);
   	
   	List<DiscussliulangdongwuxinxiView> selectListView(Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);
   	
   	DiscussliulangdongwuxinxiView selectView(@Param("ew") Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);
   	
}

