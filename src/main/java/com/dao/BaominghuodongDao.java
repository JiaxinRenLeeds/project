package com.dao;

import com.entity.BaominghuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaominghuodongVO;
import com.entity.view.BaominghuodongView;


/**
 * Registration activity
 * 
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public interface BaominghuodongDao extends BaseMapper<BaominghuodongEntity> {
	
	List<BaominghuodongVO> selectListVO(@Param("ew") Wrapper<BaominghuodongEntity> wrapper);
	
	BaominghuodongVO selectVO(@Param("ew") Wrapper<BaominghuodongEntity> wrapper);
	
	List<BaominghuodongView> selectListView(@Param("ew") Wrapper<BaominghuodongEntity> wrapper);

	List<BaominghuodongView> selectListView(Pagination page,@Param("ew") Wrapper<BaominghuodongEntity> wrapper);
	
	BaominghuodongView selectView(@Param("ew") Wrapper<BaominghuodongEntity> wrapper);
	
}
