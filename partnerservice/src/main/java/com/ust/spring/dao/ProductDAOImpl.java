package com.ust.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ust.spring.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> listProduct(int partner_id) {
		Session session = this.sessionFactory.getCurrentSession();
//		Criteria criteria = session.createCriteria(Partner.class,"partner");
//		criteria.add(Restrictions.eq("partner.service_id",(Integer) serviceid));
//		List<Partner> PartnersList = criteria.list();
		List<Product> ProductsList = session.createQuery("from com.ust.spring.model.Product E where E.partner_id ="+partner_id).list();
		for(Product p : ProductsList){
			logger.info("Products List::"+p);
		}
		return ProductsList;
	}
// modify as per the changes in other classes ... like to list partner u need service id   creat the interface for services too--done



	@Override
	@Transactional
	public Object UpdatePr(int product_id, int partner_id, String product) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
		//Query using Hibernate Query Language
		String QUERY ="UPDATE com.ust.spring.model.Product P  set  P.product = '"+product+"' where P.product_id ='"+product_id+"'";
		org.hibernate.Query query = session.createQuery(QUERY);
		query.executeUpdate();	
 		return session.close();
	}



	@Override
	@Transactional
	public Object AddPr(int partner_id, String product) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		//Query using Hibernate Query Language
		String QUERY ="INSERT INTO product(partner_id , product) VALUES ('"+partner_id+"','"+product+"')";
		SQLQuery query =  session.createSQLQuery(QUERY);
		query.executeUpdate();
 		return session.close();	     
		
	}



	@Override
	@Transactional
	public Object RemovePr(int product_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
		//Query using Hibernate Query Language
		String QUERY ="delete from com.ust.spring.model.Product where product_id ="+product_id;
		org.hibernate.Query query = session.createQuery(QUERY);
		query.executeUpdate();	
 		return session.close();
	}
	
	
	
	
}
