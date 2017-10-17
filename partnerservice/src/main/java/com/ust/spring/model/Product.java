package com.ust.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.transaction.Transactional;

//  this will be replica of partner table in database    like wise create a class for services
@Entity
@Transactional
@Table(name="product")
public class Product implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1918111138460866914L;

	/**
	 * 
	 */


	@Id
	@Column(name="product_id")
	private int product_id;
	
	@Column(name="partner_id")
	private int partner_id;
	
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="service_id")
//	private Service service_id;
	
	@Column(name="product")
	private String product;
	
	
	
	
	

	public int getId() {
		return product_id;
	}

	public void setId(int product_id) {
		this.product_id = product_id;
	}
	
	public int getPartner_id() {
		return partner_id;
	}

	public void setPartner_id(int partner_id) {
		this.partner_id = partner_id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
	
	
	@Override
	public String toString(){
		return " Services Offered ="+product;
	    
	}
	
	//"service_id="+getservice_Id().toString()+
	

//	public Service getService_id() {
//		return service_id;
//	}
//
//	public void setService_id(Service service_id) {
//		this.service_id = service_id;
//	}
}