package com.coforge.test.restcontroller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.test.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {

	@GetMapping("/getCtm")
	public Customer getCustomer() {
		return new Customer("John", "USA", new Date(),101);
	}
	@GetMapping("/getById")
	public Customer getCustomerById() {
		
	}
}
