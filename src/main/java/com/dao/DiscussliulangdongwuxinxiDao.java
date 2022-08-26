package com.dao;

import com.entity.DiscussliulangdongwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussliulangdongwuxinxiVO;
import com.entity.view.DiscussliulangdongwuxinxiView;


/**
 * 流浪动物信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public interface DiscussliulangdongwuxinxiDao extends BaseMapper<DiscussliulangdongwuxinxiEntity> {
	
	List<DiscussliulangdongwuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);
	
	DiscussliulangdongwuxinxiVO selectVO(@Param("ew") Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);
	
	List<DiscussliulangdongwuxinxiView> selectListView(@Param("ew") Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);

	List<DiscussliulangdongwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);
	
	DiscussliulangdongwuxinxiView selectView(@Param("ew") Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);
	
}
