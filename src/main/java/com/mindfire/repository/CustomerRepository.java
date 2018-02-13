/**
 * interface defined to get or set data in customer table in database 
 * with as specific key type
 */
package com.mindfire.repository;

import org.springframework.data.repository.CrudRepository;

import com.mindfire.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer>{
	
}
