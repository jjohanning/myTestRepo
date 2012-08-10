package com.janhelmut.avz.face;

import java.util.List;

import javax.annotation.PostConstruct;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.janhelmut.avz.domain.Customer;
import com.janhelmut.avz.service.CustomerService;

@Named
@RequestScoped
public class CustomerHandler {

	private Customer customer;

	private List<Customer> customerList;

	@Inject
	CustomerService customerService;

	@PostConstruct
	public void init() {
		setCustomer(new Customer());
		updateCustomerList();
	}

	public void updateCustomerList() {
		this.setCustomerList(customerService.listCustomer());
	}

	public String save() {
		customerService.saveCustomer(customer);
		updateCustomerList();
		return "";
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

}
