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
@Table(name="partner")
public class Partner implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1179069101898736514L;

	/**
	 * 
	 */

	@Id
	@Column(name="partner_id")
	private int partner_id;
	
	@Column(name="service_id")
	private int service_id;
	
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="service_id")
//	private Service service_id;
	
	@Column(name="partner_name")
	private String partner_name;
	
	@Column(name="partner_desc")
	private String partner_desc;
	
	
	

	public int getId() {
		return partner_id;
	}

	public void setId(int partner_id) {
		this.partner_id = partner_id;
	}
	
	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public String getPartner_name() {
		return partner_name;
	}

	public void setPartner_name(String partner_name) {
		this.partner_name = partner_name;
	}
	
	public String getPartner_desc() {
		return partner_desc;
	}

	public void getPartner_desc(String partner_desc) {
		this.partner_desc = partner_desc;
	}
	
	@Override
	public String toString(){
		return ", partner_name="+partner_name+", partner_desc="+partner_desc;
	    
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