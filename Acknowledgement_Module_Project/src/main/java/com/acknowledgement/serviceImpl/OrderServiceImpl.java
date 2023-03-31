package com.acknowledgement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.acknowledgement.entity.OrderHeader;
import com.acknowledgement.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	RestTemplate restTemplate = new RestTemplate();

	@Autowired
	private Environment environment;

	@Override
	public OrderHeader addOrder(OrderHeader orderHeader) {

		String bsRoot = environment.getProperty("api.bs.root");

		String url = bsRoot+ "/save";

		HttpHeaders headers = new HttpHeaders();

		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<OrderHeader> httpEntity = new HttpEntity<>(orderHeader, headers);

		ResponseEntity<OrderHeader> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, OrderHeader.class);

		return responseEntity.getBody();
	}

}
