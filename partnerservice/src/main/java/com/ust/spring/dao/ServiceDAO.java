package com.ust.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ust.spring.model.Service;

public interface ServiceDAO {

	
	public void addService(Service s);
	public void updateService(Service s);
	public List<Service> listServices();
	public void removeService(Service s);
	public Object AddS( String service_name, String service_desc);
	public Object RemoveS(int service_id);
	public Object UpdateS(int service_id, String service_name, String service_desc);
	
	
}