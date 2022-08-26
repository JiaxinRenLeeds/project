package com.dao;

import com.entity.ZhiyuantuanduihuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiyuantuanduihuodongVO;
import com.entity.view.ZhiyuantuanduihuodongView;


/**
 * 志愿团队活动
 * 
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public interface ZhiyuantuanduihuodongDao extends BaseMapper<ZhiyuantuanduihuodongEntity> {
	
	List<ZhiyuantuanduihuodongVO> selectListVO(@Param("ew") Wrapper<ZhiyuantuanduihuodongEntity> wrapper);
	
	ZhiyuantuanduihuodongVO selectVO(@Param("ew") Wrapper<ZhiyuantuanduihuodongEntity> wrapper);
	
	List<ZhiyuantuanduihuodongView> selectListView(@Param("ew") Wrapper<ZhiyuantuanduihuodongEntity> wrapper);

	List<ZhiyuantuanduihuodongView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiyuantuanduihuodongEntity> wrapper);
	
	ZhiyuantuanduihuodongView selectView(@Param("ew") Wrapper<ZhiyuantuanduihuodongEntity> wrapper);
	
}
