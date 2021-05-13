package com.iconFC.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="login1")
public class login {
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public login() {

	}

	public login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public boolean validate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }


	
}
