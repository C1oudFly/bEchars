package com.oracle.beipro.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oracle.beipro.browser.entity.Browser;
import com.oracle.beipro.browser.entity.BrowserEntity;
import com.oracle.beipro.dao.BrowserDao;
import com.oracle.beipro.region.entity.RegionEntity;

@Controller
@RequestMapping(value="/browser")
public class BrowserController 
{
	@Resource
	BrowserDao browserDao;

	public BrowserDao getBrowserDao() {
		return browserDao;
	}

	public void setBrowserDao(BrowserDao browserDao) {
		this.browserDao = browserDao;
	}

	@ResponseBody
	@RequestMapping(value="/browseruserList")
	public void showOrderList(HttpServletResponse response ,String sdate)
	{
		System.out.println(sdate);
		
		List<Browser> list= browserDao.getBrowserList(sdate);
		//X轴
		List<String> browserList = new ArrayList<>();
		//新增用户
		List<Integer> adduserCount = new ArrayList<>();
		//活跃用户
		List<Integer> visitCount = new ArrayList<>();
		//总访客
		List<Integer> userCount = new ArrayList<>();
	
		for (Browser browser : list) {
			browserList.add(browser.getBrowser());
			adduserCount.add(browser.getAdduserCount());
			visitCount.add(browser.getVisitCount());
			userCount.add(browser.getUserCount());
		}
		
		BrowserEntity entity = new BrowserEntity();
		entity.setBrowserData(browserList);
		entity.setAdduserData(adduserCount);
		entity.setVisitData(visitCount);
		entity.setUserData(userCount);
		
		Gson gson = new GsonBuilder().create();
		
		
		String json = gson.toJson(entity);
		
		
		try {
			System.out.println(json);
			response.setContentType("json/application;charset=UTF-8");
			response.getWriter().write(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@ResponseBody
	@RequestMapping(value="/browsermemberList")
	public void showMemberList(HttpServletResponse response ,String sdate)
	{
		System.out.println(sdate);
		
		List<Browser> list= browserDao.getBrowserList(sdate);
		//X轴
		List<String> browserList = new ArrayList<>();
		//新增用户
		List<Integer> adduserCount = new ArrayList<>();
		//活跃用户
		List<Integer> visitCount = new ArrayList<>();
		//总访客
		List<Integer> userCount = new ArrayList<>();
	
		for (Browser browser : list) {
			browserList.add(browser.getBrowser());
			adduserCount.add(browser.getAddmemberCount());
			visitCount.add(browser.getActiveCount());
			userCount.add(browser.getMemberCount());
		}
		
		BrowserEntity entity = new BrowserEntity();
		entity.setBrowserData(browserList);
		entity.setAdduserData(adduserCount);
		entity.setVisitData(visitCount);
		entity.setUserData(userCount);
		
		Gson gson = new GsonBuilder().create();
		
		
		String json = gson.toJson(entity);
		
		
		try {
			System.out.println(json);
			response.setContentType("json/application;charset=UTF-8");
			response.getWriter().write(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	@ResponseBody
	@RequestMapping(value="/browsersessionList")
	public void showSessionList(HttpServletResponse response,String sdate)
	{
		System.out.println(sdate);
		
		List<Browser> list= browserDao.getBrowserList(sdate);
		//X轴
		List<String> browserList = new ArrayList<>();
		//新增用户
		List<Integer> adduserCount = new ArrayList<>();
		//活跃用户
		List<Integer> visitCount = new ArrayList<>();
		//总访客
		List<Integer> userCount = new ArrayList<>();
	
		for (Browser browser : list) {
			browserList.add(browser.getBrowser());
			adduserCount.add(browser.getSessionnumberCount());
			visitCount.add(browser.getSessionlengthdvalue());
			userCount.add(browser.getAveragesessionlength());
		}
		
		BrowserEntity entity = new BrowserEntity();
		entity.setBrowserData(browserList);
		entity.setAdduserData(adduserCount);
		entity.setVisitData(visitCount);
		entity.setUserData(userCount);
		
		Gson gson = new GsonBuilder().create();
		
		
		String json = gson.toJson(entity);
		
		
		try {
			System.out.println(json);
			response.setContentType("json/application;charset=UTF-8");
			response.getWriter().write(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@ResponseBody
	@RequestMapping(value="/browserpvList")
	public void showPvList(HttpServletResponse response,String sdate)
	{
		System.out.println(sdate);
		
		List<Browser> list= browserDao.getBrowserList(sdate);
		//X轴
		List<String> browserList = new ArrayList<>();
		//新增用户
		List<Integer> adduserCount = new ArrayList<>();
		//活跃用户
		List<Integer> visitCount = new ArrayList<>();
		//总访客
		List<Integer> userCount = new ArrayList<>();
	
		for (Browser browser : list) {
			browserList.add(browser.getBrowser());
			adduserCount.add(browser.getBrowserPv());
		}
		
		BrowserEntity entity = new BrowserEntity();
		entity.setBrowserData(browserList);
		entity.setAdduserData(adduserCount);
		
		Gson gson = new GsonBuilder().create();
		
		
		String json = gson.toJson(entity);
		
		
		try {
			System.out.println(json);
			response.setContentType("json/application;charset=UTF-8");
			response.getWriter().write(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
