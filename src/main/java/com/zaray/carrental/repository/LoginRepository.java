package com.zaray.carrental.repository;


public interface LoginRepository {
	
	boolean checkLogin(String userEmail, String userPassword);

}
