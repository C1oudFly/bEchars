package com.oracle.beipro.browser.entity;

public class Browser {

	private String date;
	private String browser;
	private int adduserCount;
	private int visitCount;
	private int userCount;
	private int addmemberCount;
	private int activeCount;
	private int memberCount;
	private int sessionnumberCount;
	private int sessionlengthCount;
	private int averagesessionlength;
	private int sessionlengthdvalue;
	private int browserPv;
	
	public int getSessionlengthdvalue() {
		return sessionlengthdvalue;
	}
	public void setSessionlengthdvalue(int sessionlengthdvalue) {
		this.sessionlengthdvalue = sessionlengthdvalue;
	}
	public int getBrowserPv() {
		return browserPv;
	}
	public void setBrowserPv(int browserPv) {
		this.browserPv = browserPv;
	}
	
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getAdduserCount() {
		return adduserCount;
	}
	public void setAdduserCount(int adduserCount) {
		this.adduserCount = adduserCount;
	}
	public int getVisitCount() {
		return visitCount;
	}
	public void setVisitCount(int visitCount) {
		this.visitCount = visitCount;
	}
	public int getUserCount() {
		return userCount;
	}
	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}
	public int getAddmemberCount() {
		return addmemberCount;
	}
	public void setAddmemberCount(int addmemberCount) {
		this.addmemberCount = addmemberCount;
	}
	public int getActiveCount() {
		return activeCount;
	}
	public void setActiveCount(int activeCount) {
		this.activeCount = activeCount;
	}
	public int getMemberCount() {
		return memberCount;
	}
	public void setMemberCount(int memberCount) {
		this.memberCount = memberCount;
	}
	public int getSessionnumberCount() {
		return sessionnumberCount;
	}
	public void setSessionnumberCount(int sessionnumberCount) {
		this.sessionnumberCount = sessionnumberCount;
	}
	public int getSessionlengthCount() {
		return sessionlengthCount;
	}
	public void setSessionlengthCount(int sessionlengthCount) {
		this.sessionlengthCount = sessionlengthCount;
	}
	public int getAveragesessionlength() {
		return averagesessionlength;
	}
	public void setAveragesessionlength(int averagesessionlength) {
		this.averagesessionlength = averagesessionlength;
	}
}
