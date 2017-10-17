package com.ust.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ust.spring.model.Partner;


public interface LoginDAO {

	public boolean checkLogin(String Username, String Password);
}
