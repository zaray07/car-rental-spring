package com.zaray.carrental.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaray.carrental.repository.LoginRepository;
import com.zaray.carrental.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginRepository loginRepository;
	

	@Override
	public boolean checkLogin(String userEmail, String userPassword) {
			return loginRepository.checkLogin(userEmail, userPassword);
	}

}
