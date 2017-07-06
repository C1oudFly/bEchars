package com.oracle.beipro.order.entity;

import java.util.List;

public class OrderEntity {
	List<String> listXaxis ;
	List<String> oidData;
	List<Integer> successData ;
	List<Integer> refundData;
	List<Integer> orderData;
	
	
	public List<String> getOidData() {
		return oidData;
	}
	public void setOidData(List<String> oidData) {
		this.oidData = oidData;
	}
	public List<String> getListXaxis() {
		return listXaxis;
	}
	public void setListXaxis(List<String> listXaxis) {
		this.listXaxis = listXaxis;
	}
	public List<Integer> getSuccessData() {
		return successData;
	}
	public void setSuccessData(List<Integer> successData) {
		this.successData = successData;
	}
	public List<Integer> getRefundData() {
		return refundData;
	}
	public void setRefundData(List<Integer> refundData) {
		this.refundData = refundData;
	}
	public List<Integer> getOrderData() {
		return orderData;
	}
	public void setOrderData(List<Integer> orderData) {
		this.orderData = orderData;
	}
	
}
