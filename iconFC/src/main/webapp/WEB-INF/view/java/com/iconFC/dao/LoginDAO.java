package com.iconFC.dao;

import java.util.ArrayList;
import java.util.List;

import com.iconFC.model.login;



public class LoginDAO implements ILoginDAO {
	
	@Override
	public login getLoginDetailsByUsernameAndPassword(String username, String password) {
		 List<login> users = new ArrayList<>();
		for (login user : users) {
            boolean isValid = ((login) user).validate(username, password);
            if (isValid)
                return user;
        }
		return null;
	}

}
