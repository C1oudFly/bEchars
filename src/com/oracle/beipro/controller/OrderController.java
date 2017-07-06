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
import com.oracle.beipro.dao.OrderDao;
import com.oracle.beipro.order.entity.Order;
import com.oracle.beipro.order.entity.OrderEntity;


@Controller
@RequestMapping(value="/order")
public class OrderController 
{
	@Resource
	OrderDao orderDao;
	
	
	public OrderDao getOrderDao() {
		return orderDao;
	}
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	
	@ResponseBody
	@RequestMapping(value="/orderList")
	public void showOrderList(HttpServletResponse response )
	{
		
		List<Order> list=orderDao.getOrdreList();
		//X��
		List<String> listXaxis = new ArrayList<>();
		//����ID
		List<String> oidID = new ArrayList<>();
		//�ɹ�������
		List<Integer> successCount = new ArrayList<>();
		//�˵���
		List<Integer> refundCount = new ArrayList<>();
		//�����������
		List<Integer> orderCount = new ArrayList<>();
	
		for (Order order : list) {
			listXaxis.add(order.getDate());
			oidID.add(order.getOid());
			successCount.add(order.getSuccessCount());
			refundCount.add(order.getRefundCount());
			orderCount.add(order.getOrderCount());
		}
		
		OrderEntity entity = new OrderEntity();
		entity.setListXaxis(listXaxis);
		entity.setOidData(oidID);
		entity.setSuccessData(successCount);
		entity.setRefundData(refundCount);
		entity.setOrderData(orderCount);
		
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
