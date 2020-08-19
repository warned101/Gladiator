package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void save(Customer customer) {
		entityManager.merge(customer);
	}
	
	@Override
	public Customer findById(int id) {
		return entityManager.find(Customer.class, id);
	}
	
	@Override
	public List<Customer> findAllCustomers(){
		return entityManager.createNamedQuery("fetch-all").getResultList();
	}
	
	@Override
	public int findByEmailPassword(String email, String password) {
		return (int) entityManager.createQuery("select c.id from Customer c where c.email =: em and c.password =: pw ")
				.setParameter("em", email)
				.setParameter("pw", password)
				.getSingleResult();
	}
}
