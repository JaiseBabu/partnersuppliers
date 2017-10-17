package com.ust.spring.service;

import java.util.List;

import com.ust.spring.model.Partner;
import com.ust.spring.model.Product;
import com.ust.spring.model.Service;

public interface PartnerService {

	public void addPartner(Partner p);
	public void updatePartner(Partner p);
	public List<Partner> listPartners(int serviceid);
	public void removePartner(int id);
	public List<Service> listServices();
	public void updateService(Service s);
	public void removeService(Service s);
	public void addService(Service s);
	public boolean checkLogin(String Username, String Password);
	public Object AddS(String service_name, String service_desc);
	public Object RemoveS(int id);
	public Object RemoveP(int partner_id);
	public Object UpdateS(int service_id,String service_name, String service_desc);
	public Object UpdateP(int partner_id,String partner_name, String partner_desc);
	public Object AddP(int service_id, java.lang.String partner_name, java.lang.String partner_desc);
	public List<Product> listProduct(int partner_id);
	public Object UpdatePr(int product_id, int partner_id, java.lang.String product);
	public Object AddPr(int partner_id, java.lang.String product);
	public Object RemovePr(int product_id);
	
	
	
}

