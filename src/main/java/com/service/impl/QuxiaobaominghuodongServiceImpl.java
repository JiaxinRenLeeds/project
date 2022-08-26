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


import com.dao.QuxiaobaominghuodongDao;
import com.entity.QuxiaobaominghuodongEntity;
import com.service.QuxiaobaominghuodongService;
import com.entity.vo.QuxiaobaominghuodongVO;
import com.entity.view.QuxiaobaominghuodongView;

@Service("quxiaobaominghuodongService")
public class QuxiaobaominghuodongServiceImpl extends ServiceImpl<QuxiaobaominghuodongDao, QuxiaobaominghuodongEntity> implements QuxiaobaominghuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaobaominghuodongEntity> page = this.selectPage(
                new Query<QuxiaobaominghuodongEntity>(params).getPage(),
                new EntityWrapper<QuxiaobaominghuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuxiaobaominghuodongEntity> wrapper) {
		  Page<QuxiaobaominghuodongView> page =new Query<QuxiaobaominghuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuxiaobaominghuodongVO> selectListVO(Wrapper<QuxiaobaominghuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuxiaobaominghuodongVO selectVO(Wrapper<QuxiaobaominghuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuxiaobaominghuodongView> selectListView(Wrapper<QuxiaobaominghuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaobaominghuodongView selectView(Wrapper<QuxiaobaominghuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
