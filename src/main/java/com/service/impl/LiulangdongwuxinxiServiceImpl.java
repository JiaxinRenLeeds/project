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


import com.dao.LiulangdongwuxinxiDao;
import com.entity.LiulangdongwuxinxiEntity;
import com.service.LiulangdongwuxinxiService;
import com.entity.vo.LiulangdongwuxinxiVO;
import com.entity.view.LiulangdongwuxinxiView;

@Service("liulangdongwuxinxiService")
public class LiulangdongwuxinxiServiceImpl extends ServiceImpl<LiulangdongwuxinxiDao, LiulangdongwuxinxiEntity> implements LiulangdongwuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiulangdongwuxinxiEntity> page = this.selectPage(
                new Query<LiulangdongwuxinxiEntity>(params).getPage(),
                new EntityWrapper<LiulangdongwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiulangdongwuxinxiEntity> wrapper) {
		  Page<LiulangdongwuxinxiView> page =new Query<LiulangdongwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiulangdongwuxinxiVO> selectListVO(Wrapper<LiulangdongwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiulangdongwuxinxiVO selectVO(Wrapper<LiulangdongwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiulangdongwuxinxiView> selectListView(Wrapper<LiulangdongwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiulangdongwuxinxiView selectView(Wrapper<LiulangdongwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
