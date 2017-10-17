package com.ust.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ust.spring.model.Product;


public interface ProductDAO {

	
	public List<Product> listProduct(int partner_id);

	public Object UpdatePr(int product_id, int partner_id, String product);

	public Object AddPr(int partner_id, String product);

	public Object RemovePr(int product_id);
	
}
