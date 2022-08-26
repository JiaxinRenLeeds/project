package com.dao;

import com.entity.QuxiaolingyangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuxiaolingyangxinxiVO;
import com.entity.view.QuxiaolingyangxinxiView;


/**
 * Cancel adoption information
 * 
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public interface QuxiaolingyangxinxiDao extends BaseMapper<QuxiaolingyangxinxiEntity> {
	
	List<QuxiaolingyangxinxiVO> selectListVO(@Param("ew") Wrapper<QuxiaolingyangxinxiEntity> wrapper);
	
	QuxiaolingyangxinxiVO selectVO(@Param("ew") Wrapper<QuxiaolingyangxinxiEntity> wrapper);
	
	List<QuxiaolingyangxinxiView> selectListView(@Param("ew") Wrapper<QuxiaolingyangxinxiEntity> wrapper);

	List<QuxiaolingyangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaolingyangxinxiEntity> wrapper);
	
	QuxiaolingyangxinxiView selectView(@Param("ew") Wrapper<QuxiaolingyangxinxiEntity> wrapper);
	
}
