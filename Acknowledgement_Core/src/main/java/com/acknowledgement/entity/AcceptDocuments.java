package com.acknowledgement.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AcceptDocuments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String userName;

	private Long purchaseOrderNumber;

	@CreationTimestamp
	private LocalDate documentsCreatedDate;

	private String acknowlendmentsType;

	@OneToOne(cascade = CascadeType.ALL)
	private OrderItems orderItems;
}
