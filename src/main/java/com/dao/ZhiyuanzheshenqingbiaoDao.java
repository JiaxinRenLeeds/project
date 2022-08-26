package com.dao;

import com.entity.ZhiyuanzheshenqingbiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiyuanzheshenqingbiaoVO;
import com.entity.view.ZhiyuanzheshenqingbiaoView;


/**
 * Volunteer application form
 * 
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public interface ZhiyuanzheshenqingbiaoDao extends BaseMapper<ZhiyuanzheshenqingbiaoEntity> {
	
	List<ZhiyuanzheshenqingbiaoVO> selectListVO(@Param("ew") Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper);
	
	ZhiyuanzheshenqingbiaoVO selectVO(@Param("ew") Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper);
	
	List<ZhiyuanzheshenqingbiaoView> selectListView(@Param("ew") Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper);

	List<ZhiyuanzheshenqingbiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper);
	
	ZhiyuanzheshenqingbiaoView selectView(@Param("ew") Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper);
	
}
