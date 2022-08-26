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


import com.dao.DiscusszhiyuantuanduihuodongDao;
import com.entity.DiscusszhiyuantuanduihuodongEntity;
import com.service.DiscusszhiyuantuanduihuodongService;
import com.entity.vo.DiscusszhiyuantuanduihuodongVO;
import com.entity.view.DiscusszhiyuantuanduihuodongView;

@Service("discusszhiyuantuanduihuodongService")
public class DiscusszhiyuantuanduihuodongServiceImpl extends ServiceImpl<DiscusszhiyuantuanduihuodongDao, DiscusszhiyuantuanduihuodongEntity> implements DiscusszhiyuantuanduihuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhiyuantuanduihuodongEntity> page = this.selectPage(
                new Query<DiscusszhiyuantuanduihuodongEntity>(params).getPage(),
                new EntityWrapper<DiscusszhiyuantuanduihuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhiyuantuanduihuodongEntity> wrapper) {
		  Page<DiscusszhiyuantuanduihuodongView> page =new Query<DiscusszhiyuantuanduihuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhiyuantuanduihuodongVO> selectListVO(Wrapper<DiscusszhiyuantuanduihuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhiyuantuanduihuodongVO selectVO(Wrapper<DiscusszhiyuantuanduihuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhiyuantuanduihuodongView> selectListView(Wrapper<DiscusszhiyuantuanduihuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhiyuantuanduihuodongView selectView(Wrapper<DiscusszhiyuantuanduihuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
