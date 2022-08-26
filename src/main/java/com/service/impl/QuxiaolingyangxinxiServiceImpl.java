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


import com.dao.QuxiaolingyangxinxiDao;
import com.entity.QuxiaolingyangxinxiEntity;
import com.service.QuxiaolingyangxinxiService;
import com.entity.vo.QuxiaolingyangxinxiVO;
import com.entity.view.QuxiaolingyangxinxiView;

@Service("quxiaolingyangxinxiService")
public class QuxiaolingyangxinxiServiceImpl extends ServiceImpl<QuxiaolingyangxinxiDao, QuxiaolingyangxinxiEntity> implements QuxiaolingyangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaolingyangxinxiEntity> page = this.selectPage(
                new Query<QuxiaolingyangxinxiEntity>(params).getPage(),
                new EntityWrapper<QuxiaolingyangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuxiaolingyangxinxiEntity> wrapper) {
		  Page<QuxiaolingyangxinxiView> page =new Query<QuxiaolingyangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuxiaolingyangxinxiVO> selectListVO(Wrapper<QuxiaolingyangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuxiaolingyangxinxiVO selectVO(Wrapper<QuxiaolingyangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuxiaolingyangxinxiView> selectListView(Wrapper<QuxiaolingyangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaolingyangxinxiView selectView(Wrapper<QuxiaolingyangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
