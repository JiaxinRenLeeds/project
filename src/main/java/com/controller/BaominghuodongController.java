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

import com.entity.BaominghuodongEntity;
import com.entity.view.BaominghuodongView;

import com.service.BaominghuodongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * Registration activity
 * 后端接口
 * @author 
 * @email 
 * @date 2022-07-27 
 */
@RestController
@RequestMapping("/baominghuodong")
public class BaominghuodongController {
    @Autowired
    private BaominghuodongService baominghuodongService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BaominghuodongEntity baominghuodong,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhiyuanzhe")) {
			baominghuodong.setZhiyuanzhezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BaominghuodongEntity> ew = new EntityWrapper<BaominghuodongEntity>();
		PageUtils page = baominghuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baominghuodong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BaominghuodongEntity baominghuodong, 
		HttpServletRequest request){
        EntityWrapper<BaominghuodongEntity> ew = new EntityWrapper<BaominghuodongEntity>();
		PageUtils page = baominghuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baominghuodong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BaominghuodongEntity baominghuodong){
       	EntityWrapper<BaominghuodongEntity> ew = new EntityWrapper<BaominghuodongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( baominghuodong, "baominghuodong")); 
        return R.ok().put("data", baominghuodongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BaominghuodongEntity baominghuodong){
        EntityWrapper< BaominghuodongEntity> ew = new EntityWrapper< BaominghuodongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( baominghuodong, "baominghuodong")); 
		BaominghuodongView baominghuodongView =  baominghuodongService.selectView(ew);
		return R.ok("查询Registration activity成功").put("data", baominghuodongView);
    }
	
    /**
     * 后端Details
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BaominghuodongEntity baominghuodong = baominghuodongService.selectById(id);
        return R.ok().put("data", baominghuodong);
    }

    /**
     * 前端Details
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BaominghuodongEntity baominghuodong = baominghuodongService.selectById(id);
        return R.ok().put("data", baominghuodong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaominghuodongEntity baominghuodong, HttpServletRequest request){
    	baominghuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baominghuodong);
        baominghuodongService.insert(baominghuodong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BaominghuodongEntity baominghuodong, HttpServletRequest request){
    	baominghuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baominghuodong);
        baominghuodongService.insert(baominghuodong);
        return R.ok();
    }

    /**
     * Edit
     */
    @RequestMapping("/update")
    public R update(@RequestBody BaominghuodongEntity baominghuodong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baominghuodong);
        baominghuodongService.updateById(baominghuodong);//全部更新
        return R.ok();
    }
    

    /**
     * Delete
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        baominghuodongService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<BaominghuodongEntity> wrapper = new EntityWrapper<BaominghuodongEntity>();
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

		int count = baominghuodongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
