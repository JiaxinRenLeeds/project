package com.dao;

import com.entity.DongwuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DongwuleixingVO;
import com.entity.view.DongwuleixingView;


/**
 * Animal type
 * 
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public interface DongwuleixingDao extends BaseMapper<DongwuleixingEntity> {
	
	List<DongwuleixingVO> selectListVO(@Param("ew") Wrapper<DongwuleixingEntity> wrapper);
	
	DongwuleixingVO selectVO(@Param("ew") Wrapper<DongwuleixingEntity> wrapper);
	
	List<DongwuleixingView> selectListView(@Param("ew") Wrapper<DongwuleixingEntity> wrapper);

	List<DongwuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<DongwuleixingEntity> wrapper);
	
	DongwuleixingView selectView(@Param("ew") Wrapper<DongwuleixingEntity> wrapper);
	
}
