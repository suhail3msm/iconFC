package com.iconFC.service;

import com.iconFC.model.login;
import com.iconFC.dao.LoginDAO;


public class LoginService implements ILoginService {
	
	 private LoginDAO lgnDAO;
	 

	public LoginDAO getLgnDAO() {
		return lgnDAO;
	}


	public void setLgnDAO(LoginDAO lgnDAO) {
		this.lgnDAO = lgnDAO;
	}


	@Override
	public login validatelogin(String email, String password) {
	login lgn = getLgnDAO().getLoginDetailsByUsernameAndPassword(email, password);
		return lgn;
		
	}

}
