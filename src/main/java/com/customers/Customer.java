package com.customers;

import java.util.List;

import com.orders.Order;

public class Customer {

	private Long id;
	private String name;
	private String joined;
	private String city;
	private double orderTotal;
	private List<Order> orders; 
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Long id, String name, String joined, String city, double orderTotal) {
		super();
		this.id = id;
		this.name = name;
		this.joined = joined;
		this.city = city;
		this.orderTotal = orderTotal;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJoined() {
		return joined;
	}
	public void setJoined(String joined) {
		this.joined = joined;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	
	
	
}
