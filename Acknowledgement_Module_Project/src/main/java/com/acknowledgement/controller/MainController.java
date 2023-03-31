package com.acknowledgement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acknowledgement.entity.OrderHeader;
import com.acknowledgement.service.OrderService;

@RestController
public class MainController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/order")
	public ResponseEntity<OrderHeader> saveOrder(@RequestBody OrderHeader orderHeader) {

		try {

			OrderHeader addOrder = orderService.addOrder(orderHeader);

			return new ResponseEntity<>(addOrder, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
