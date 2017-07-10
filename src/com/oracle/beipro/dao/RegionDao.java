package com.oracle.beipro.dao;

import java.util.List;

import com.oracle.beipro.region.entity.Region;

public interface RegionDao {
	public List<Region> getRegionList();
	public List<Region> getRegionListBypro(String sdate);
}
