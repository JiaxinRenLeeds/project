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

import com.entity.ZhiyuanzheshenqingbiaoEntity;
import com.entity.view.ZhiyuanzheshenqingbiaoView;

import com.service.ZhiyuanzheshenqingbiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * Volunteer application form
 * 后端接口
 * @author 
 * @email 
 * @date 2022-07-27 
 */
@RestController
@RequestMapping("/zhiyuanzheshenqingbiao")
public class ZhiyuanzheshenqingbiaoController {
    @Autowired
    private ZhiyuanzheshenqingbiaoService zhiyuanzheshenqingbiaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhiyuanzheshenqingbiaoEntity zhiyuanzheshenqingbiao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huiyuan")) {
			zhiyuanzheshenqingbiao.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhiyuanzheshenqingbiaoEntity> ew = new EntityWrapper<ZhiyuanzheshenqingbiaoEntity>();
		PageUtils page = zhiyuanzheshenqingbiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiyuanzheshenqingbiao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhiyuanzheshenqingbiaoEntity zhiyuanzheshenqingbiao, 
		HttpServletRequest request){
        EntityWrapper<ZhiyuanzheshenqingbiaoEntity> ew = new EntityWrapper<ZhiyuanzheshenqingbiaoEntity>();
		PageUtils page = zhiyuanzheshenqingbiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiyuanzheshenqingbiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhiyuanzheshenqingbiaoEntity zhiyuanzheshenqingbiao){
       	EntityWrapper<ZhiyuanzheshenqingbiaoEntity> ew = new EntityWrapper<ZhiyuanzheshenqingbiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhiyuanzheshenqingbiao, "zhiyuanzheshenqingbiao")); 
        return R.ok().put("data", zhiyuanzheshenqingbiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhiyuanzheshenqingbiaoEntity zhiyuanzheshenqingbiao){
        EntityWrapper< ZhiyuanzheshenqingbiaoEntity> ew = new EntityWrapper< ZhiyuanzheshenqingbiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhiyuanzheshenqingbiao, "zhiyuanzheshenqingbiao")); 
		ZhiyuanzheshenqingbiaoView zhiyuanzheshenqingbiaoView =  zhiyuanzheshenqingbiaoService.selectView(ew);
		return R.ok("查询Volunteer application form成功").put("data", zhiyuanzheshenqingbiaoView);
    }
	
    /**
     * 后端Details
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhiyuanzheshenqingbiaoEntity zhiyuanzheshenqingbiao = zhiyuanzheshenqingbiaoService.selectById(id);
        return R.ok().put("data", zhiyuanzheshenqingbiao);
    }

    /**
     * 前端Details
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhiyuanzheshenqingbiaoEntity zhiyuanzheshenqingbiao = zhiyuanzheshenqingbiaoService.selectById(id);
        return R.ok().put("data", zhiyuanzheshenqingbiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhiyuanzheshenqingbiaoEntity zhiyuanzheshenqingbiao, HttpServletRequest request){
    	zhiyuanzheshenqingbiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhiyuanzheshenqingbiao);
        zhiyuanzheshenqingbiaoService.insert(zhiyuanzheshenqingbiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhiyuanzheshenqingbiaoEntity zhiyuanzheshenqingbiao, HttpServletRequest request){
    	zhiyuanzheshenqingbiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhiyuanzheshenqingbiao);
        zhiyuanzheshenqingbiaoService.insert(zhiyuanzheshenqingbiao);
        return R.ok();
    }

    /**
     * Edit
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhiyuanzheshenqingbiaoEntity zhiyuanzheshenqingbiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhiyuanzheshenqingbiao);
        zhiyuanzheshenqingbiaoService.updateById(zhiyuanzheshenqingbiao);//全部更新
        return R.ok();
    }
    

    /**
     * Delete
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhiyuanzheshenqingbiaoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZhiyuanzheshenqingbiaoEntity> wrapper = new EntityWrapper<ZhiyuanzheshenqingbiaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huiyuan")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhiyuanzheshenqingbiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
