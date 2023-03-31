package com.acknowledgement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acknowledgement.bsServive.service;
import com.acknowledgement.entity.OrderHeader;

@RestController
public class BsController {

	@Autowired
	private service service;
	
	@Autowired
	private Environment environment;

	@PostMapping("/save")
	public OrderHeader home(@RequestBody OrderHeader orderHeader) {

		OrderHeader saveOrder = service.saveOrder(orderHeader);
		
		return saveOrder;
	}

}
