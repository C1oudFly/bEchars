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
import com.oracle.beipro.dao.UserDao;
import com.oracle.beipro.user.entity.User;
import com.oracle.beipro.user.entity.UserEntity;



@Controller
@RequestMapping(value="/user")
public class UserController 
{
	@Resource
	UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@ResponseBody
	@RequestMapping(value="/userList")
	public void showOrderList(HttpServletResponse response )
	{
		
		List<User> list=userDao.getUserList();
		//X轴
		List<String> listXaxis = new ArrayList<>();
		//新增用户
		List<Integer> adduserCount = new ArrayList<>();
		//活跃用户
		List<Integer> visitCount = new ArrayList<>();
		//总访客
		List<Integer> userCount = new ArrayList<>();
	
		for (User user : list) {
			listXaxis.add(user.getDate());
			adduserCount.add(user.getAdduserCount());
			visitCount.add(user.getVisitCount());
			userCount.add(user.getUserCount());
		}
		
		UserEntity entity = new UserEntity();
		entity.setListXaxis(listXaxis);
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
	@RequestMapping(value="/memberList")
	public void showMemberList(HttpServletResponse response )
	{
		
		List<User> list=userDao.getUserList();
		//X轴
		List<String> listXaxis = new ArrayList<>();
		//新增用户
		List<Integer> adduserCount = new ArrayList<>();
		//活跃用户
		List<Integer> visitCount = new ArrayList<>();
		//总访客
		List<Integer> userCount = new ArrayList<>();
	
		for (User user : list) {
			listXaxis.add(user.getDate());
			adduserCount.add(user.getAddmemberCount());
			visitCount.add(user.getActiveCount());
			userCount.add(user.getMemberCount());
		}
		
		UserEntity entity = new UserEntity();
		entity.setListXaxis(listXaxis);
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
	@RequestMapping(value="/sessionList")
	public void showSessionList(HttpServletResponse response )
	{
		
		List<User> list=userDao.getUserList();
		//X轴
		List<String> listXaxis = new ArrayList<>();
		//新增用户
		List<Integer> adduserCount = new ArrayList<>();
		//活跃用户
		List<Integer> visitCount = new ArrayList<>();
		//总访客
		List<Integer> userCount = new ArrayList<>();
	
		for (User user : list) {
			listXaxis.add(user.getDate());
			adduserCount.add(user.getSessionnumberCount());
			visitCount.add(user.getSessionlengthCount());
			userCount.add(user.getAveragesessionlength());
		}
		
		UserEntity entity = new UserEntity();
		entity.setListXaxis(listXaxis);
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
}
