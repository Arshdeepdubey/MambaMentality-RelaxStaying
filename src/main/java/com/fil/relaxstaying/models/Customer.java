package com.fil.relaxstaying.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="customer")
@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CUSTOMER_ID")
	private int customer_id;
	
	@Column(name="CUSTOMER_NAME")
	private String customer_name;
	
	@Column(name="MOBILE_NO")
	private String mobile_no;
	
	@Column(name="EMAIL_ID")
	private String email_id;
	
}
