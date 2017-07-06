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
	public void showOrderList(HttpServletResponse response )
	{
		
		List<Region> list = regiondao.getRegionList();
		//X��
		List<String> listXaxis = new ArrayList<>();
		//����
		List<String> region = new ArrayList<>();
		//��������
		List<Integer> regionCount = new ArrayList<>();
		//����Ự����
		List<Integer> sessionNumber = new ArrayList<>();
		//����Ự������
		List<Integer> sessionJumpNumber = new ArrayList<>();
		//����Ự������
		List<Integer> jumpRate = new ArrayList<>();
	
		for (Region region2 : list) {
			listXaxis.add(region2.getDate());
			region.add(region2.getRegion());
			regionCount.add(region2.getRegionCount());
			sessionNumber.add(region2.getSessionNumber());
			sessionJumpNumber.add(region2.getSessionJumpnumber());
			jumpRate.add(region2.getJumpRate());
		}
		
		RegionEntity entity = new RegionEntity();
		entity.setListXaxis(listXaxis);
		entity.setRegionData(region);
		entity.setRegionCountData(regionCount);
		entity.setSessionNumberData(sessionNumber);
		entity.setSessionJumpnumberData(sessionJumpNumber);
		entity.setJumpRateData(jumpRate);
		
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