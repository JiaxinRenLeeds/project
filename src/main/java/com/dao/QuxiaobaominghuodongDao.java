package com.dao;

import com.entity.QuxiaobaominghuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuxiaobaominghuodongVO;
import com.entity.view.QuxiaobaominghuodongView;


/**
 * Cancel registration activity
 * 
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public interface QuxiaobaominghuodongDao extends BaseMapper<QuxiaobaominghuodongEntity> {
	
	List<QuxiaobaominghuodongVO> selectListVO(@Param("ew") Wrapper<QuxiaobaominghuodongEntity> wrapper);
	
	QuxiaobaominghuodongVO selectVO(@Param("ew") Wrapper<QuxiaobaominghuodongEntity> wrapper);
	
	List<QuxiaobaominghuodongView> selectListView(@Param("ew") Wrapper<QuxiaobaominghuodongEntity> wrapper);

	List<QuxiaobaominghuodongView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaobaominghuodongEntity> wrapper);
	
	QuxiaobaominghuodongView selectView(@Param("ew") Wrapper<QuxiaobaominghuodongEntity> wrapper);
	
}
