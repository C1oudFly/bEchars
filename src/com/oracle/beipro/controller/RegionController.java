package com.oracle.beipro.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oracle.beipro.dao.RegionDao;
import com.oracle.beipro.region.entity.Region;
import com.oracle.beipro.region.entity.RegionEntity;

@Controller
@RequestMapping(value="/region")
public class RegionController 
{
	@Resource
	RegionDao regiondao;
	
	public RegionDao getRegiondao() {
		return regiondao;
	}

	public void setRegiondao(RegionDao regiondao) {
		this.regiondao = regiondao;
	}

	@ResponseBody
	@RequestMapping(value="/regionList")
	public void showOrderList(HttpServletResponse response,String sdate)
	{
		RegionEntity entity = null;
		System.out.println(sdate);
		if(sdate == null){
			List<Region> list = regiondao.getRegionList();
			//X轴
			List<String> listXaxis = new ArrayList<>();
			//地域
			List<String> region = new ArrayList<>();
			//地域总数
			List<Integer> regionCount = new ArrayList<>();
			//地域会话个数
			List<Integer> sessionNumber = new ArrayList<>();
			//地域会话跳出数
			List<Integer> sessionJumpNumber = new ArrayList<>();
			//地域会话跳出率
			List<Double> jumpRate = new ArrayList<>();
		
			for (Region region2 : list) {
				listXaxis.add(region2.getDate());
				region.add(region2.getRegion());
				regionCount.add(region2.getRegionCount());
				sessionNumber.add(region2.getSessionNumber());
				sessionJumpNumber.add(region2.getSessionJumpnumber());
				jumpRate.add(region2.getJumpRate());
			}
			
			entity = new RegionEntity();
			entity.setListXaxis(listXaxis);
			entity.setRegionData(region);
			entity.setRegionCountData(regionCount);
			entity.setSessionNumberData(sessionNumber);
			entity.setSessionJumpnumberData(sessionJumpNumber);
			entity.setJumpRateData(jumpRate);
		}else {
			String s = null;
			
			List<Region> list = regiondao.getRegionListBypro(sdate);
			
			List<HashMap<String, String>> regionValue = new ArrayList<>();
			//地域与值
		
			int i = 0;
			for (Region region2 : list) {
				HashMap<String, String> hashMap = new HashMap<>();
				System.out.println(i++);
				if(region2.getRegion().startsWith("内蒙")){
					
					s = region2.getRegion().substring(0,3);
					hashMap.put("name" ,s);
					hashMap.put("value", Integer.toString(region2.getRegionCount()));
				
				}else if(region2.getRegion().length() > 1){
					s = region2.getRegion().substring(0,2);
					hashMap.put("name" ,s);
					hashMap.put("value", Integer.toString(region2.getRegionCount()));
				}
				regionValue.add(hashMap);
			}
			
			entity = new RegionEntity();
			entity.setRegionMap(regionValue);
		}
		
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
	@RequestMapping(value="/regionjumpList")
	public void showjumpList(HttpServletResponse response,String sdate){
		
		RegionEntity entity = null;
		System.out.println(sdate);
			
		String s = null;
			
		List<Region> list = regiondao.getRegionListBypro(sdate);
		
		List<HashMap<String, String>> jumpValue = new ArrayList<>();
		//地域与值
	
		int i = 0;
		for (Region region2 : list) {
			HashMap<String, String> hashMap = new LinkedHashMap<>();
			System.out.println(i++);
			if(region2.getRegion().startsWith("内蒙")){
				
				s = region2.getRegion().substring(0,3);
				hashMap.put("value", Double.toString(region2.getJumpRate()));
				hashMap.put("name" ,s);
			
			}else if(region2.getRegion().length() > 1){
				s = region2.getRegion().substring(0,2);
				hashMap.put("value", Double.toString(region2.getJumpRate()));
				hashMap.put("name" ,s);
			}
			jumpValue.add(hashMap);
		}
		
		entity = new RegionEntity();
		entity.setRegionMap(jumpValue);
		
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