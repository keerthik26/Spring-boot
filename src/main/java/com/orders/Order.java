package com.orders;

public class Order {

	private int id;
    private String product;
    private double total;
    
    public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int id, String product, double total) {
		super();
		this.id = id;
		this.product = product;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
    
    
}
