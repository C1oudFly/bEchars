package com.oracle.beipro.region.entity;

import java.util.List;

public class RegionEntity {
	List<String> listXaxis ;
	List<String> regionData;
	List<Integer> regionCountData;
	List<Integer> sessionNumberData;
	List<Integer> sessionJumpnumberData;
	List<Integer> jumpRateData;
	
	
	public List<String> getRegionData() {
		return regionData;
	}
	public void setRegionData(List<String> regionData) {
		this.regionData = regionData;
	}

	
	public List<String> getListXaxis() {
		return listXaxis;
	}
	public void setListXaxis(List<String> listXaxis) {
		this.listXaxis = listXaxis;
	}
	public List<Integer> getRegionCountData() {
		return regionCountData;
	}
	public void setRegionCountData(List<Integer> regionCountData) {
		this.regionCountData = regionCountData;
	}
	public List<Integer> getSessionNumberData() {
		return sessionNumberData;
	}
	public void setSessionNumberData(List<Integer> sessionNumberData) {
		this.sessionNumberData = sessionNumberData;
	}
	public List<Integer> getSessionJumpnumberData() {
		return sessionJumpnumberData;
	}
	public void setSessionJumpnumberData(List<Integer> sessionJumpnumberData) {
		this.sessionJumpnumberData = sessionJumpnumberData;
	}
	public List<Integer> getJumpRateData() {
		return jumpRateData;
	}
	public void setJumpRateData(List<Integer> jumpRateData) {
		this.jumpRateData = jumpRateData;
	}

	
}
