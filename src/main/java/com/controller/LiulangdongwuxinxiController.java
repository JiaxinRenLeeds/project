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

import com.entity.LiulangdongwuxinxiEntity;
import com.entity.view.LiulangdongwuxinxiView;

import com.service.LiulangdongwuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 流浪动物信息Stray Animal Information
 * 后端接口The back-end interface
 */
@RestController
@RequestMapping("/liulangdongwuxinxi")
public class LiulangdongwuxinxiController {
    @Autowired
    private LiulangdongwuxinxiService liulangdongwuxinxiService;

    /**
     * The back-end list
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LiulangdongwuxinxiEntity liulangdongwuxinxi,
		HttpServletRequest request){
        EntityWrapper<LiulangdongwuxinxiEntity> ew = new EntityWrapper<LiulangdongwuxinxiEntity>();
		PageUtils page = liulangdongwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, liulangdongwuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * The front-end list
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LiulangdongwuxinxiEntity liulangdongwuxinxi, 
		HttpServletRequest request){
        EntityWrapper<LiulangdongwuxinxiEntity> ew = new EntityWrapper<LiulangdongwuxinxiEntity>();
		PageUtils page = liulangdongwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, liulangdongwuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * List
     */
    @RequestMapping("/lists")
    public R list( LiulangdongwuxinxiEntity liulangdongwuxinxi){
       	EntityWrapper<LiulangdongwuxinxiEntity> ew = new EntityWrapper<LiulangdongwuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( liulangdongwuxinxi, "liulangdongwuxinxi")); 
        return R.ok().put("data", liulangdongwuxinxiService.selectListView(ew));
    }

	 /**
     * The query
     */
    @RequestMapping("/query")
    public R query(LiulangdongwuxinxiEntity liulangdongwuxinxi){
        EntityWrapper< LiulangdongwuxinxiEntity> ew = new EntityWrapper< LiulangdongwuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( liulangdongwuxinxi, "liulangdongwuxinxi")); 
		LiulangdongwuxinxiView liulangdongwuxinxiView =  liulangdongwuxinxiService.selectView(ew);
		return R.ok("The stray animal information is successfully queried").put("data", liulangdongwuxinxiView);
    }
	
    /**
     * The back-end Details
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LiulangdongwuxinxiEntity liulangdongwuxinxi = liulangdongwuxinxiService.selectById(id);
        return R.ok().put("data", liulangdongwuxinxi);
    }

    /**
     * The front-end details
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LiulangdongwuxinxiEntity liulangdongwuxinxi = liulangdongwuxinxiService.selectById(id);
        return R.ok().put("data", liulangdongwuxinxi);
    }
    



    /**
     * The back-end save
     */
    @RequestMapping("/save")
    public R save(@RequestBody LiulangdongwuxinxiEntity liulangdongwuxinxi, HttpServletRequest request){
    	liulangdongwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(liulangdongwuxinxi);
        liulangdongwuxinxiService.insert(liulangdongwuxinxi);
        return R.ok();
    }
    
    /**
     * The front-end save
     */
    @RequestMapping("/add")
    public R add(@RequestBody LiulangdongwuxinxiEntity liulangdongwuxinxi, HttpServletRequest request){
    	liulangdongwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(liulangdongwuxinxi);
        liulangdongwuxinxiService.insert(liulangdongwuxinxi);
        return R.ok();
    }

    /**
     * Update
     */
    @RequestMapping("/update")
    public R update(@RequestBody LiulangdongwuxinxiEntity liulangdongwuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(liulangdongwuxinxi);
        liulangdongwuxinxiService.updateById(liulangdongwuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * Delete
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        liulangdongwuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * Remind interface
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
		
		Wrapper<LiulangdongwuxinxiEntity> wrapper = new EntityWrapper<LiulangdongwuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = liulangdongwuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
