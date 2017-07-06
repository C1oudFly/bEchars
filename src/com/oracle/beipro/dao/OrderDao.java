package com.oracle.beipro.dao;

import java.util.List;

import com.oracle.beipro.order.entity.Order;

public interface OrderDao {
	public List<Order> getOrdreList();
}
