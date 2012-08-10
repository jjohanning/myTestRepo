package com.janhelmut.avz.service;

import java.util.List;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.janhelmut.avz.domain.Customer;

@Stateless
public class CustomerService {

	@PersistenceContext
	EntityManager em;

	@Resource(name = "sessionContext")
	private SessionContext context;

	public Customer findCustomerById(long id) {
		return em.find(Customer.class, id);
	}

	public Customer saveCustomer(Customer customer) {
		customer = setEditor(customer);
		em.persist(customer);
		return customer;
	}

	public Customer updateCustomer(Customer customer) {
		customer = setEditor(customer);
		return em.merge(customer);
	}

	@RolesAllowed("avzAdmin")
	public void deleteCustomer(Customer customer) {
		em.remove(customer);
	}

	public List<Customer> listCustomer() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Customer> query = builder.createQuery(Customer.class);

		Root<Customer> root = query.from(Customer.class);
		query.select(root);

		List<Customer> resultList = em.createQuery(query).getResultList();

		return resultList;
	}

	private Customer setEditor(Customer customer) {
		if (context.getCallerPrincipal() != null) {
			customer.setLastEditUser(context.getCallerPrincipal().getName());
		}
		return customer;
	}

}
