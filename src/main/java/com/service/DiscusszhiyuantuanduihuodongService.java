package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhiyuantuanduihuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhiyuantuanduihuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhiyuantuanduihuodongView;


/**
 * 志愿团队活动评论表
 *
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public interface DiscusszhiyuantuanduihuodongService extends IService<DiscusszhiyuantuanduihuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhiyuantuanduihuodongVO> selectListVO(Wrapper<DiscusszhiyuantuanduihuodongEntity> wrapper);
   	
   	DiscusszhiyuantuanduihuodongVO selectVO(@Param("ew") Wrapper<DiscusszhiyuantuanduihuodongEntity> wrapper);
   	
   	List<DiscusszhiyuantuanduihuodongView> selectListView(Wrapper<DiscusszhiyuantuanduihuodongEntity> wrapper);
   	
   	DiscusszhiyuantuanduihuodongView selectView(@Param("ew") Wrapper<DiscusszhiyuantuanduihuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhiyuantuanduihuodongEntity> wrapper);
   	
}

