package com.acknowledgement.service;

import java.util.List;

import com.acknowledgement.entity.OrderHeader;


public interface OrderServiceI {

	public OrderHeader addOrder(OrderHeader orderHeader);

	public OrderHeader getByorderId(Integer orderId);

	public List<OrderHeader> showAllOrder();

	public String deleteByOrderId(Integer orderId);

	public boolean deleteAllOrder();
}
