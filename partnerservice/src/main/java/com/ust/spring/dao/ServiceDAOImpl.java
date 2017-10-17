package com.ust.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.ust.spring.model.Service;

@Repository
public class ServiceDAOImpl implements ServiceDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(ServiceDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addService(Service service) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(service);
		logger.info("Service saved successfully, Service Details="+service);
	}
	
	@Override
	@Transactional
	public Object AddS( String service_name, String service_desc){
//		System.out.println("In Check login");
		Session session = sessionFactory.openSession();
		//Query using Hibernate Query Language
		String QUERY ="INSERT INTO service( service_name, service_desc) VALUES ('"+service_name+"','"+service_desc+"')";
		SQLQuery query =  session.createSQLQuery(QUERY);
		query.executeUpdate();
 		return session.close();	              
}

	@Override
	public void updateService(Service s) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(s);
		logger.info("Service updated successfully, Service Details="+s);
	}

	@SuppressWarnings("unchecked")
	@Override
    @Transactional
	public List<Service> listServices() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Service> ServicesList = session.createQuery("from com.ust.spring.model.Service").list();
		for(Service s : ServicesList){
			logger.info("Service List::"+s);
		}
		return ServicesList;
	}
	
	


	@Override
	public void removeService(Service service) {
		Session session = this.sessionFactory.getCurrentSession();
		if(null != service){
			session.delete(service);
		}
		logger.info("Service deleted successfully, Service details="+service.getService_name());
	}
	
	@Override
	@Transactional	
	public Object RemoveS(int service_id){
		Session session = sessionFactory.openSession();
		String QUERY ="delete from com.ust.spring.model.Service where service_id ="+service_id;
		org.hibernate.Query query = session.createQuery(QUERY);
		query.executeUpdate();	
 		return session.close();
		              
}

	@Override
	@Transactional
	public Object UpdateS(int service_id, String service_name, String service_desc) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
		//Query using Hibernate Query Language
		String QUERYq ="UPDATE com.ust.spring.model.Service S  set S.service_name = '"+service_name+"' , S.service_desc ='"+service_desc+"' where S.service_id ='"+service_id+"'";
		org.hibernate.Query query = session.createQuery(QUERYq);
		query.executeUpdate();	
 		return session.close();
		
	}

	
	}
	
	
	


