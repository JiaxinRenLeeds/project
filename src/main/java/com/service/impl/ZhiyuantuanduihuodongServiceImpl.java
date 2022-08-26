package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhiyuantuanduihuodongDao;
import com.entity.ZhiyuantuanduihuodongEntity;
import com.service.ZhiyuantuanduihuodongService;
import com.entity.vo.ZhiyuantuanduihuodongVO;
import com.entity.view.ZhiyuantuanduihuodongView;

@Service("zhiyuantuanduihuodongService")
public class ZhiyuantuanduihuodongServiceImpl extends ServiceImpl<ZhiyuantuanduihuodongDao, ZhiyuantuanduihuodongEntity> implements ZhiyuantuanduihuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiyuantuanduihuodongEntity> page = this.selectPage(
                new Query<ZhiyuantuanduihuodongEntity>(params).getPage(),
                new EntityWrapper<ZhiyuantuanduihuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiyuantuanduihuodongEntity> wrapper) {
		  Page<ZhiyuantuanduihuodongView> page =new Query<ZhiyuantuanduihuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiyuantuanduihuodongVO> selectListVO(Wrapper<ZhiyuantuanduihuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiyuantuanduihuodongVO selectVO(Wrapper<ZhiyuantuanduihuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiyuantuanduihuodongView> selectListView(Wrapper<ZhiyuantuanduihuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiyuantuanduihuodongView selectView(Wrapper<ZhiyuantuanduihuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
