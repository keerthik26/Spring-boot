package com.customers;

import java.util.List;

public interface CustomerRepository {

	List<Customer> findAll();
	void save(Customer contact);
}
