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


import com.dao.DongwuleixingDao;
import com.entity.DongwuleixingEntity;
import com.service.DongwuleixingService;
import com.entity.vo.DongwuleixingVO;
import com.entity.view.DongwuleixingView;

@Service("dongwuleixingService")
public class DongwuleixingServiceImpl extends ServiceImpl<DongwuleixingDao, DongwuleixingEntity> implements DongwuleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DongwuleixingEntity> page = this.selectPage(
                new Query<DongwuleixingEntity>(params).getPage(),
                new EntityWrapper<DongwuleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DongwuleixingEntity> wrapper) {
		  Page<DongwuleixingView> page =new Query<DongwuleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DongwuleixingVO> selectListVO(Wrapper<DongwuleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DongwuleixingVO selectVO(Wrapper<DongwuleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DongwuleixingView> selectListView(Wrapper<DongwuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DongwuleixingView selectView(Wrapper<DongwuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
