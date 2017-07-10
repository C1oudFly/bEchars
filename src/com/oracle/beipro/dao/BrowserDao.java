package com.oracle.beipro.dao;

import java.util.List;

import com.oracle.beipro.browser.entity.Browser;

public interface BrowserDao {
	public List<Browser> getBrowserList(String sdate);
}
