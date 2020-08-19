package com.lti.repository;

import java.util.List;

import com.lti.entity.Customer;

public interface CustomerRepository {

	void save(Customer customer);

	Customer findById(int id);

	List<Customer> findAllCustomers();

	int findByEmailPassword(String email, String password);

}