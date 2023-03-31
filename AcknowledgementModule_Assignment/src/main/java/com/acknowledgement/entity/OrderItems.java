package com.acknowledgement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderItems {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderItemId;

	private Integer productNo;

	private String productName;

	private Integer productQuantity;

	private Double productPrice;

	public OrderItems() {
		super();

	}

	public OrderItems(Integer orderItemId, Integer productNo, String productName, Integer productQuantity,
			Double productPrice) {
		super();
		this.orderItemId = orderItemId;
		this.productNo = productNo;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}

	public Integer getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Integer getProductNo() {
		return productNo;
	}

	public void setProductNo(Integer productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "OrderItems [orderItemId=" + orderItemId + ", productNo=" + productNo + ", productName=" + productName
				+ ", productQuantity=" + productQuantity + ", productPrice=" + productPrice + "]";
	}

}
