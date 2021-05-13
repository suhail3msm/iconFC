package com.iconFC.dao;

import org.hibernate.SessionFactory;

import com.iconFC.model.login;

public interface ILoginDAO {

	public login getLoginDetailsByUsernameAndPassword(String username,String password);
	}

