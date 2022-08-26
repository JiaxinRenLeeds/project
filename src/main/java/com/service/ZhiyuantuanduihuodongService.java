package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiyuantuanduihuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiyuantuanduihuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyuantuanduihuodongView;


/**
 * 志愿团队活动
 *
 * @author 
 * @email 
 * @date 2022-07-27 
 */
public interface ZhiyuantuanduihuodongService extends IService<ZhiyuantuanduihuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiyuantuanduihuodongVO> selectListVO(Wrapper<ZhiyuantuanduihuodongEntity> wrapper);
   	
   	ZhiyuantuanduihuodongVO selectVO(@Param("ew") Wrapper<ZhiyuantuanduihuodongEntity> wrapper);
   	
   	List<ZhiyuantuanduihuodongView> selectListView(Wrapper<ZhiyuantuanduihuodongEntity> wrapper);
   	
   	ZhiyuantuanduihuodongView selectView(@Param("ew") Wrapper<ZhiyuantuanduihuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiyuantuanduihuodongEntity> wrapper);
   	
}

