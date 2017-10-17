package com.ust.spring.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ust.spring.dao.LoginDAO;
import com.ust.spring.dao.PartnerDAO;
import com.ust.spring.dao.ProductDAO;
import com.ust.spring.model.Partner;
import com.ust.spring.model.Product;
import com.ust.spring.model.Service;
import com.ust.spring.dao.ServiceDAO;

@org.springframework.stereotype.Service
public class PartnerServiceImpl implements PartnerService {
	
	private PartnerDAO PartnerDAO;
	private ServiceDAO ServiceDAO;
	private ProductDAO ProductDAO;
	
	

	public void setPartnerDAO(PartnerDAO PartnerDAO) {
		this.PartnerDAO = PartnerDAO;
	}
	
	public ProductDAO getProductDAO() {
		return ProductDAO;
	}
	public void setProductDAO(ProductDAO ProductDAO) {
		this.ProductDAO = ProductDAO ;
	}

	@Override
	@Transactional
	public void addPartner(Partner p) {
		this.PartnerDAO.addPartner(p);
	}

	@Override
	@Transactional
	public void updatePartner(Partner p) {
		this.PartnerDAO.updatePartner(p);
	}

	@Override
	@Transactional
	public List<Partner> listPartners(int serviceid) {
		return this.PartnerDAO.listPartners(serviceid);
	}


	@Override
	@Transactional
	public void removePartner(int id) {
		this.PartnerDAO.removePartner(id);
	}

	@Override
	@Transactional
	public void updateService(Service s) {
		this.getServiceDAO().updateService(s);
	}
	

	

//	@Override
//	public List<com.ust.spring.model.Service> listServices() {
//		// TODO Auto-generated method stub
//		return this.getServiceDAO().listServices();
//	}
	
	@Override
	public List<com.ust.spring.model.Service> listServices() {
		// TODO Auto-generated method stub
		return this.getServiceDAO().listServices();
	}
	

	@Override
	public void removeService(com.ust.spring.model.Service s) {
		// TODO Auto-generated method stub
		this.getServiceDAO().removeService(s);
		
	}

	@Override
	public void addService(com.ust.spring.model.Service s) {
		// TODO Auto-generated method stub
		this.getServiceDAO().addService(s);
	}

	public ServiceDAO getServiceDAO() {
		return ServiceDAO;
	}

	public void setServiceDAO(ServiceDAO serviceDAO) {
		ServiceDAO = serviceDAO;
	}
	
	
	
	 private LoginDAO loginDAO;

	   public void setLoginDAO(LoginDAO loginDAO) {
             this.loginDAO = loginDAO;
      }
     
      public boolean checkLogin(String Username, String Password){
             //System.out.println("In Service class...Check Login");
             return loginDAO.checkLogin(Username, Password);
      }
	
      public Object AddS(String service_name, String service_desc){
          
          return ServiceDAO.AddS( service_name,  service_desc);
   }
      public Object RemoveS(int service_id){
          
          return ServiceDAO.RemoveS( service_id);
   }
      public Object RemoveP(int partner_id){
          
          return PartnerDAO.RemoveP(partner_id);
   }
      public Object UpdateS(int service_id,String service_name, String service_desc){
          
          return ServiceDAO.UpdateS( service_id, service_name,  service_desc);
   }
      
      public Object UpdateP(int partner_id,  String partner_name, String partner_desc){
          
          return PartnerDAO.UpdateP( partner_id, partner_name,  partner_desc);
   }

	@Override
	public Object AddP(int service_id, String partner_name, String partner_desc) {
		// TODO Auto-generated method stub
		return PartnerDAO.AddP(service_id, partner_name,  partner_desc);
	}

	@Override
	@Transactional
	public List<Product> listProduct(int partner_id) {
		// TODO Auto-generated method stub
		return this.ProductDAO.listProduct(partner_id);
	}

	@Override
	public Object UpdatePr(int product_id, int partner_id, String product) {
		// TODO Auto-generated method stub
		 return ProductDAO.UpdatePr( product_id, partner_id,  product);
	}

	@Override
	public Object AddPr(int partner_id, String product) {
		// TODO Auto-generated method stub
		return ProductDAO.AddPr(partner_id, product);
	}

	@Override
	public Object RemovePr(int product_id) {
		// TODO Auto-generated method stub
		return ProductDAO.RemovePr(product_id);
	}

	
      
}
