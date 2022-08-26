package com.dao;

import com.entity.DiscusszhiyuantuanduihuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhiyuantuanduihuodongVO;
import com.entity.view.DiscusszhiyuantuanduihuodongView;


/**
 * 志愿团队活动评论表
 * 
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public interface DiscusszhiyuantuanduihuodongDao extends BaseMapper<DiscusszhiyuantuanduihuodongEntity> {
	
	List<DiscusszhiyuantuanduihuodongVO> selectListVO(@Param("ew") Wrapper<DiscusszhiyuantuanduihuodongEntity> wrapper);
	
	DiscusszhiyuantuanduihuodongVO selectVO(@Param("ew") Wrapper<DiscusszhiyuantuanduihuodongEntity> wrapper);
	
	List<DiscusszhiyuantuanduihuodongView> selectListView(@Param("ew") Wrapper<DiscusszhiyuantuanduihuodongEntity> wrapper);

	List<DiscusszhiyuantuanduihuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhiyuantuanduihuodongEntity> wrapper);
	
	DiscusszhiyuantuanduihuodongView selectView(@Param("ew") Wrapper<DiscusszhiyuantuanduihuodongEntity> wrapper);
	
}
