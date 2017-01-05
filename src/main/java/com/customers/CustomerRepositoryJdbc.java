package com.customers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.orders.Order;

@Repository
public class CustomerRepositoryJdbc implements CustomerRepository {

	List<Order> orderList = new ArrayList<>();
	private JdbcTemplate jdbc;

	@Autowired
	public CustomerRepositoryJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
		
		orderList.add(new Order(1, "Shoes", 9.956));
		orderList.add(new Order(2, "Pens",10));
		orderList.add(new Order(3, "Dress", 20));
	}

	@Override
	public List<Customer> findAll() {

		return jdbc.query("select id, uname, joined, city from customer order by uname", 
				new RowMapper<Customer>(){

					@Override
					public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Customer contact = new Customer();
						contact.setId(rs.getLong(1));
						contact.setName(rs.getString(2));
						contact.setJoined(rs.getString(3));
						contact.setCity(rs.getString(4));
						contact.setOrderTotal(39.956);
						contact.setOrders(orderList);
						return contact;
					}
			
		});
	}

	@Override
	public void save(Customer contact) {
		jdbc.update("insert into customer (id, uname, joined, city) values(?,?,?,?)",
				contact.getId(), contact.getName(), contact.getJoined(), contact.getCity());

	}

}
