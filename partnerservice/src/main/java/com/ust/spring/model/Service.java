package com.ust.spring.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


//  this will be replica of partner table in database    like wise create a class for services--done
@Entity

@Table(name="service")
public class Service implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3863308045415253448L;

	@Id
	@Column(name="service_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int service_id;
	
	@Column(name="service_name")
	private String service_name;
	

	@Column(name="service_desc")
	private String service_desc;
	
//	@OneToMany(mappedBy="service_id")
//    private Set<Partner> partner;
//    
	

	public int  getId() {
		return service_id;
	}

	public void setId(int  service_id) {
		this.service_id = service_id;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public String getService_desc() {
		return service_desc;
	}

	public void setService_desc(String service_desc) {
		this.service_desc = service_desc;
	}
	
	
	
	
	@Override
	public String toString(){

		String we="service_id="+service_id+", servicename="+", service_desc="+service_desc;
		return we;

	}
    

}

