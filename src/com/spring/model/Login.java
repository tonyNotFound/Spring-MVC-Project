package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="registeration")
public class Login {

	@Id
	@Column(name="id")
	private int id;
	
	
	@NotNull(message="is required")
	@Size(min = 4, message="is required")
	@Column(name="email")
	private String email;
	
	
	@NotNull(message="is required")
	@Size(min = 4, message="is required")
	@Column(name="password")
	private String password;
	
	public Login() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
