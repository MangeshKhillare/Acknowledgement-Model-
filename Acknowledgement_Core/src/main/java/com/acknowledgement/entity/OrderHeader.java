package com.acknowledgement.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderHeader {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderId;

	private String userName;

	private String userMobileNo;

	private String userEmail;

	private Long purchaseOrderNumber;

	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate purchaseOrderDate;

	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate purchaseUpdatedOrderDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId")
	private Address address;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "orderItemId")
	private OrderItems orderItems;

}
