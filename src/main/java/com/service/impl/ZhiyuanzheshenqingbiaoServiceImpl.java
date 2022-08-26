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


import com.dao.ZhiyuanzheshenqingbiaoDao;
import com.entity.ZhiyuanzheshenqingbiaoEntity;
import com.service.ZhiyuanzheshenqingbiaoService;
import com.entity.vo.ZhiyuanzheshenqingbiaoVO;
import com.entity.view.ZhiyuanzheshenqingbiaoView;

@Service("zhiyuanzheshenqingbiaoService")
public class ZhiyuanzheshenqingbiaoServiceImpl extends ServiceImpl<ZhiyuanzheshenqingbiaoDao, ZhiyuanzheshenqingbiaoEntity> implements ZhiyuanzheshenqingbiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiyuanzheshenqingbiaoEntity> page = this.selectPage(
                new Query<ZhiyuanzheshenqingbiaoEntity>(params).getPage(),
                new EntityWrapper<ZhiyuanzheshenqingbiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper) {
		  Page<ZhiyuanzheshenqingbiaoView> page =new Query<ZhiyuanzheshenqingbiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiyuanzheshenqingbiaoVO> selectListVO(Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiyuanzheshenqingbiaoVO selectVO(Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiyuanzheshenqingbiaoView> selectListView(Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiyuanzheshenqingbiaoView selectView(Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
