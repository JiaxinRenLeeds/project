package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.QuxiaobaominghuodongEntity;
import com.entity.view.QuxiaobaominghuodongView;

import com.service.QuxiaobaominghuodongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * Cancel registration activity
 * 后端接口
 * @author 
 * @email 
 * @date 2022-07-27 
 */
@RestController
@RequestMapping("/quxiaobaominghuodong")
public class QuxiaobaominghuodongController {
    @Autowired
    private QuxiaobaominghuodongService quxiaobaominghuodongService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QuxiaobaominghuodongEntity quxiaobaominghuodong,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhiyuanzhe")) {
			quxiaobaominghuodong.setZhiyuanzhezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QuxiaobaominghuodongEntity> ew = new EntityWrapper<QuxiaobaominghuodongEntity>();
		PageUtils page = quxiaobaominghuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaobaominghuodong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QuxiaobaominghuodongEntity quxiaobaominghuodong, 
		HttpServletRequest request){
        EntityWrapper<QuxiaobaominghuodongEntity> ew = new EntityWrapper<QuxiaobaominghuodongEntity>();
		PageUtils page = quxiaobaominghuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaobaominghuodong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QuxiaobaominghuodongEntity quxiaobaominghuodong){
       	EntityWrapper<QuxiaobaominghuodongEntity> ew = new EntityWrapper<QuxiaobaominghuodongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( quxiaobaominghuodong, "quxiaobaominghuodong")); 
        return R.ok().put("data", quxiaobaominghuodongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QuxiaobaominghuodongEntity quxiaobaominghuodong){
        EntityWrapper< QuxiaobaominghuodongEntity> ew = new EntityWrapper< QuxiaobaominghuodongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( quxiaobaominghuodong, "quxiaobaominghuodong")); 
		QuxiaobaominghuodongView quxiaobaominghuodongView =  quxiaobaominghuodongService.selectView(ew);
		return R.ok("查询Cancel registration activity成功").put("data", quxiaobaominghuodongView);
    }
	
    /**
     * 后端Details
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QuxiaobaominghuodongEntity quxiaobaominghuodong = quxiaobaominghuodongService.selectById(id);
        return R.ok().put("data", quxiaobaominghuodong);
    }

    /**
     * 前端Details
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QuxiaobaominghuodongEntity quxiaobaominghuodong = quxiaobaominghuodongService.selectById(id);
        return R.ok().put("data", quxiaobaominghuodong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QuxiaobaominghuodongEntity quxiaobaominghuodong, HttpServletRequest request){
    	quxiaobaominghuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(quxiaobaominghuodong);
        quxiaobaominghuodongService.insert(quxiaobaominghuodong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QuxiaobaominghuodongEntity quxiaobaominghuodong, HttpServletRequest request){
    	quxiaobaominghuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(quxiaobaominghuodong);
        quxiaobaominghuodongService.insert(quxiaobaominghuodong);
        return R.ok();
    }

    /**
     * Edit
     */
    @RequestMapping("/update")
    public R update(@RequestBody QuxiaobaominghuodongEntity quxiaobaominghuodong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quxiaobaominghuodong);
        quxiaobaominghuodongService.updateById(quxiaobaominghuodong);//全部更新
        return R.ok();
    }
    

    /**
     * Delete
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        quxiaobaominghuodongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<QuxiaobaominghuodongEntity> wrapper = new EntityWrapper<QuxiaobaominghuodongEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhiyuanzhe")) {
			wrapper.eq("zhiyuanzhezhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = quxiaobaominghuodongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
