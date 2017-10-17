package com.ust.spring.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.management.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ust.spring.model.Partner;

@Repository
public class LoginDAOImpl implements LoginDAO {
    
	
	private static final Logger logger = LoggerFactory.getLogger(PartnerDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
//	@Resource(name="sessionFactory")
//    protected SessionFactory sessionFactory;
//
//    public void setSessionFactory(SessionFactory sessionFactory) {
//           this.sessionFactory = sessionFactory;
//    }
//   
//    protected Session getSession(){
//           return sessionFactory.openSession();
//    }
    

    public boolean checkLogin(String Username, String Password){
//			System.out.println("In Check login");
			Session session = sessionFactory.openSession();
			
			//Query using Hibernate Query Language
			String QUERY ="from com.ust.spring.model.Login o where o.Username = '"+Username +"' and o.Password= '"+Password+"'";
			org.hibernate.Query query =  session.createQuery(QUERY);
			
			List list =  query.list();

			if (list != null && list.size()>0 ) { 
				return true;
			}

     		session.close();
			return false;              
    }

}
