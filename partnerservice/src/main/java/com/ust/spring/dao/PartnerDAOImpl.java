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

import com.ust.spring.model.Partner;

@Repository
public class PartnerDAOImpl implements PartnerDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PartnerDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addPartner(Partner p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Partner saved successfully, Partner Details="+p);
	}
	
	

	@Override
	public void updatePartner(Partner p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Partner updated successfully, Partner Details="+p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Partner> listPartners(int serviceid) {
		Session session = this.sessionFactory.getCurrentSession();
//		Criteria criteria = session.createCriteria(Partner.class,"partner");
//		criteria.add(Restrictions.eq("partner.service_id",(Integer) serviceid));
//		List<Partner> PartnersList = criteria.list();
		List<Partner> PartnersList = session.createQuery("from com.ust.spring.model.Partner E where E.service_id ="+serviceid).list();
		for(Partner p : PartnersList){
			logger.info("Partner List::"+p);
		}
		return PartnersList;
	}
// modify as per the changes in other classes ... like to list partner u need service id   creat the interface for services too--done
	

	@Override
	public void removePartner(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Partner p = (Partner) session.load(Partner.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Partner deleted successfully, Partner details="+p);
	}

	@Override
	@Transactional	
	public Object RemoveP(int partner_id){
		Session session = sessionFactory.openSession();	
		//Query using Hibernate Query Language
		String QUERY ="delete from com.ust.spring.model.Partner where partner_id ="+partner_id;
		org.hibernate.Query query = session.createQuery(QUERY);
		query.executeUpdate();	
 		return session.close();
		              
}
	
	@Override
	@Transactional
	public Object UpdateP(int partner_id, String partner_name, String partner_desc) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
		//Query using Hibernate Query Language
		String QUERY ="UPDATE com.ust.spring.model.Partner P  set  P.partner_name = '"+partner_name+"' , P.partner_desc ='"+partner_desc+"' where P.partner_id ='"+partner_id+"'";
		org.hibernate.Query query = session.createQuery(QUERY);
		query.executeUpdate();	
 		return session.close();
	}

	@Override
	@Transactional
	public Object AddP(int service_id, String partner_name, String partner_desc) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		//Query using Hibernate Query Language
		String QUERY ="INSERT INTO partner(service_id , partner_name , partner_desc) VALUES ('"+service_id+"','"+partner_name+"','"+partner_desc+"')";
		SQLQuery query =  session.createSQLQuery(QUERY);
		query.executeUpdate();
 		return session.close();	     
		
	}
	
}
