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
@Transactional
@Table(name="pict")
public class UploadFile implements Serializable{

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
	@Column(name="pic_id")
	private int pic_id;
	
	@Column(name="pic_name")
	private String pic_name;
	
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="service_id")
//	private Service service_id;
	public int getId() {
		return pic_id;
	}

	public void setId(int pic_id) {
		this.pic_id = pic_id;
	}
	
	public static String getPic_name(String pic_name) {
		return pic_name;
	}

	public void setPic_name(String pic_name) {
		this.pic_name = pic_name;
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