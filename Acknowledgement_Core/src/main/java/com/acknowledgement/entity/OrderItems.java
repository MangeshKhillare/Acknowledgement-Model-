package com.acknowledgement.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderItems {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderItemId;

	private Long productNumber;

	private String productName;

	private Integer productQuantity;

	private Long productPrice;
}
