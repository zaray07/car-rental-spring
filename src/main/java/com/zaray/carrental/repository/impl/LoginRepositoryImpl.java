package com.zaray.carrental.repository.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zaray.carrental.repository.LoginRepository;

@Repository
public class LoginRepositoryImpl implements LoginRepository {

	@Autowired
	protected EntityManager entityManager;

	public boolean checkLogin(String userEmail, String userPassword) {
		System.out.println("In Check login");
		boolean userFound = false;
		
	
		
		Query query = entityManager.createQuery("FROM User as o where o.userEmail=? and o.userPassword=?");
		query.setParameter(1, userEmail);
		query.setParameter(2, userPassword);
		List<?> list = query.getResultList();

		if ((list != null) && (list.size() > 0)) {
			userFound = true;
		}

		return userFound;
	}

}