package com.ust.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;
import javax.transaction.Transactional;

//  this will be replica of partner table in database    like wise create a class for services
@Entity

@Table(name="login")
public class Login implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -348411645515345053L;

	/**
	 * 
	 */
	

	/**
	 * 
	 */

	@Id
	@Column(name="log_id")
	private int log_id;
	

//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="service_id")
//	private Service service_id;
	
	@Column(name="Username")
	private String Username;
	
	@Column(name="Password")
	private String Password;
	
	
	

	public int getId() {
		return log_id;
	}

	public void setId(int log_id) {
		this.log_id = log_id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String Username) {
		this.Username = Username;
	}
	
	public String getPassword() {
		return Password;
	}

	public void getPassword(String Password) {
		this.Password = Password;
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