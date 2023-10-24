package com.fil.relaxstaying.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fil.relaxstaying.models.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer>{

	//this interface will not contain any code.
}
