package com.dao;

import com.entity.LiulangdongwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiulangdongwuxinxiVO;
import com.entity.view.LiulangdongwuxinxiView;


/**
 * 流浪动物信息
 * Stray Animal Information
 */
public interface LiulangdongwuxinxiDao extends BaseMapper<LiulangdongwuxinxiEntity> {
	
	List<LiulangdongwuxinxiVO> selectListVO(@Param("ew") Wrapper<LiulangdongwuxinxiEntity> wrapper);
	
	LiulangdongwuxinxiVO selectVO(@Param("ew") Wrapper<LiulangdongwuxinxiEntity> wrapper);
	
	List<LiulangdongwuxinxiView> selectListView(@Param("ew") Wrapper<LiulangdongwuxinxiEntity> wrapper);

	List<LiulangdongwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LiulangdongwuxinxiEntity> wrapper);
	
	LiulangdongwuxinxiView selectView(@Param("ew") Wrapper<LiulangdongwuxinxiEntity> wrapper);
	
}
