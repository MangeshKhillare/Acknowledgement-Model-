package com.acknowledgement.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.acknowledgement.entity.OrderHeader;
import com.acknowledgement.service.OrderServiceI;

@RestController
public class OrderController {

	@Autowired
	private OrderServiceI orderServiceI;

	/*
	 * @PostMapping(value = "/saveOrder", consumes = { "application/json" }) public
	 * ResponseEntity<String> saveOrder(@RequestBody OrderHeader OrderHeader) {
	 * 
	 * String msg = null;
	 * 
	 * OrderHeader addOrder1 = orderServiceI.addOrder(OrderHeader);
	 * 
	 * if (addOrder1.getOrderId() != null) {
	 * 
	 * msg = "Data Successfully Saved...!!!";
	 * 
	 * } else {
	 * 
	 * msg = "Failed To Save"; }
	 * 
	 * return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	 * 
	 * }
	 */

	@PostMapping(value = "/saveOrder")
	public OrderHeader saveOrder(@RequestBody OrderHeader orderHeader) {

		OrderHeader addOrder1 = orderServiceI.addOrder(orderHeader);

		System.out.println(addOrder1);

		return addOrder1;
	}

	@GetMapping("/getOrder/{orderId}")
	public OrderHeader getOrder(@PathVariable Integer orderId) {

		OrderHeader byOrderId = orderServiceI.getByorderId(orderId);

		return byOrderId;

	}

	@GetMapping("All_Orders")
	public List<OrderHeader> getAllOrder() {

		List<OrderHeader> showAllOrder = orderServiceI.showAllOrder();

		for (OrderHeader orderHeader : showAllOrder) {
			System.out.println(orderHeader);
		}
		return showAllOrder;
	}

	@DeleteMapping(value = "/deleteOrderId/{orderId}")
	public String deleteBySingleOrderId(@PathVariable Integer orderId) {

		String msg = null;

		String deleteOrderId = orderServiceI.deleteByOrderId(orderId);

		msg = "Deleted Single Order Successfully...!!!";

		return msg;

	}

	@DeleteMapping(value = "/deleteAll")
	public String deleteAll() {

		String msg = null;

		boolean deleteAllOrder = orderServiceI.deleteAllOrder();

		msg = "Deleted All Order Successfully...!!!";

		return msg;

	}

}