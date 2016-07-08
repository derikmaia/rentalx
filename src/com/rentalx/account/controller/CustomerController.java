package com.rentalx.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rentalx.account.ContactInfo;
import com.rentalx.account.Customer;
import com.rentalx.account.PersonalDocument;
import com.rentalx.account.repository.CustomerRepository;


@Controller
@RequestMapping("api/customer")
public class CustomerController{

	@Autowired
	CustomerRepository cr;
	
	@RequestMapping("/add")
	protected void addCustomer(Customer customer, PersonalDocument doc, ContactInfo info){
		cr.create(customer);
	}
	
	@RequestMapping("/create")
	protected String createCustomer(){
		return "newCustomer";
	}
	

}
