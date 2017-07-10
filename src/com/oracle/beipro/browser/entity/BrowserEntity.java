package com.oracle.beipro.browser.entity;

import java.util.List;

public class BrowserEntity {

	List<String> listXaxis;
	List<String> browserData;
	List<Integer> adduserData;
	List<Integer> visitData;
	List<Integer> userData;
	List<Integer> addmemberData;
	List<Integer> activeData;
	List<Integer> memberData;
	List<Integer> sessionnumberData;
	List<Integer> sessionlengthData;
	List<Integer> averagesessionData;
	List<Integer> sessionlengthdvalue;
	List<Integer> browserPv;
	
	public List<Integer> getSessionlengthdvalue() {
		return sessionlengthdvalue;
	}
	public void setSessionlengthdvalue(List<Integer> sessionlengthdvalue) {
		this.sessionlengthdvalue = sessionlengthdvalue;
	}
	public List<Integer> getBrowserPv() {
		return browserPv;
	}
	public void setBrowserPv(List<Integer> browserPv) {
		this.browserPv = browserPv;
	}
	
	public List<String> getBrowserData() {
		return browserData;
	}
	public void setBrowserData(List<String> browserData) {
		this.browserData = browserData;
	}
	
	public List<String> getListXaxis() {
		return listXaxis;
	}
	public void setListXaxis(List<String> listXaxis) {
		this.listXaxis = listXaxis;
	}
	public List<Integer> getAdduserData() {
		return adduserData;
	}
	public void setAdduserData(List<Integer> adduserData) {
		this.adduserData = adduserData;
	}
	public List<Integer> getVisitData() {
		return visitData;
	}
	public void setVisitData(List<Integer> visitData) {
		this.visitData = visitData;
	}
	public List<Integer> getUserData() {
		return userData;
	}
	public void setUserData(List<Integer> userData) {
		this.userData = userData;
	}
	public List<Integer> getAddmemberData() {
		return addmemberData;
	}
	public void setAddmemberData(List<Integer> addmemberData) {
		this.addmemberData = addmemberData;
	}
	public List<Integer> getActiveData() {
		return activeData;
	}
	public void setActiveData(List<Integer> activeData) {
		this.activeData = activeData;
	}
	public List<Integer> getMemberData() {
		return memberData;
	}
	public void setMemberData(List<Integer> memberData) {
		this.memberData = memberData;
	}
	public List<Integer> getSessionnumberData() {
		return sessionnumberData;
	}
	public void setSessionnumberData(List<Integer> sessionnumberData) {
		this.sessionnumberData = sessionnumberData;
	}
	public List<Integer> getSessionlengthData() {
		return sessionlengthData;
	}
	public void setSessionlengthData(List<Integer> sessionlengthData) {
		this.sessionlengthData = sessionlengthData;
	}
	public List<Integer> getAveragesessionData() {
		return averagesessionData;
	}
	public void setAveragesessionData(List<Integer> averagesessionData) {
		this.averagesessionData = averagesessionData;
	}
}
