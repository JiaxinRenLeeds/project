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


import com.dao.DiscussliulangdongwuxinxiDao;
import com.entity.DiscussliulangdongwuxinxiEntity;
import com.service.DiscussliulangdongwuxinxiService;
import com.entity.vo.DiscussliulangdongwuxinxiVO;
import com.entity.view.DiscussliulangdongwuxinxiView;

@Service("discussliulangdongwuxinxiService")
public class DiscussliulangdongwuxinxiServiceImpl extends ServiceImpl<DiscussliulangdongwuxinxiDao, DiscussliulangdongwuxinxiEntity> implements DiscussliulangdongwuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussliulangdongwuxinxiEntity> page = this.selectPage(
                new Query<DiscussliulangdongwuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussliulangdongwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussliulangdongwuxinxiEntity> wrapper) {
		  Page<DiscussliulangdongwuxinxiView> page =new Query<DiscussliulangdongwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussliulangdongwuxinxiVO> selectListVO(Wrapper<DiscussliulangdongwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussliulangdongwuxinxiVO selectVO(Wrapper<DiscussliulangdongwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussliulangdongwuxinxiView> selectListView(Wrapper<DiscussliulangdongwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussliulangdongwuxinxiView selectView(Wrapper<DiscussliulangdongwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
