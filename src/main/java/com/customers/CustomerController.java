package com.customers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	private CustomerRepository contactRepo;
	
	@Autowired
	public CustomerController(CustomerRepository coRepository) {
		this.contactRepo = coRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Customer> getCustomers() {
		List<Customer> contacts = contactRepo.findAll();
		//model.put("contacts", contacts);
		return contacts;
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(Customer contact){
		contactRepo.save(contact);
		return "redirect:/";
	}
}
