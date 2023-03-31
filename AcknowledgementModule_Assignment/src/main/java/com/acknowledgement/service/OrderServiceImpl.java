package com.acknowledgement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.acknowledgement.entity.OrderHeader;

import com.acknowledgement.repository.OrderHeaderRepository;

@Service
public class OrderServiceImpl implements OrderServiceI {

	@Autowired
	private OrderHeaderRepository orderHeaderRepository;

	@Override
	public OrderHeader addOrder(OrderHeader orderHeader) {

		OrderHeader save = orderHeaderRepository.save(orderHeader);

		return save;

	}

	@SuppressWarnings("deprecation")
	@Override
	public OrderHeader getByorderId(Integer orderId) {

		OrderHeader byId = orderHeaderRepository.getById(orderId);

		return byId;
	}

	@Override
	public List<OrderHeader> showAllOrder() {

		return orderHeaderRepository.findAll();

	}

	@Override
	public String deleteByOrderId(Integer orderId) {

		if (orderHeaderRepository.existsById(orderId)) {

			orderHeaderRepository.deleteById(orderId);

			return " Order Deleted Successfully...!!!";
		} else {

			return "No Order Found";
		}
	}

	@Override
	public boolean deleteAllOrder() {

		orderHeaderRepository.deleteAll();

		return false;
	}

}