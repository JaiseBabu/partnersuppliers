package com.ust.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ust.spring.model.Partner;


public interface PartnerDAO {

	public void addPartner(Partner p);
	public void updatePartner(Partner p);
	public List<Partner> listPartners(int serviceid);
	public void removePartner(int id);
	public Object RemoveP(int partner_id);
	public Object UpdateP(int partner_id,String partner_name, String partner_desc);
	public Object AddP(int service_id, String partner_name, String partner_desc);
}
