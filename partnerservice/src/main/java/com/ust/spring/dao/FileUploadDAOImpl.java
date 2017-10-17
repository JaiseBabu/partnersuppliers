package com.ust.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ust.spring.model.Partner;
import com.ust.spring.model.UploadFile;

@Repository
public class FileUploadDAOImpl implements FileUploadDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(FileUploadDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
    @Transactional
    public void save(UploadFile uploadFile) {
        sessionFactory.getCurrentSession().save(uploadFile);
    }
	
}
