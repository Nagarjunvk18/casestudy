package com.pizza.entity;

import java.time.LocalDate;

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
public class PizzaOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookingOrderId;

	private LocalDate orderDate;

	private String transactionMode;

	private int quantity;

	private double totalCost;

	private Pizza pizza;

	private Order order;

	private Coupon coupon;
}
