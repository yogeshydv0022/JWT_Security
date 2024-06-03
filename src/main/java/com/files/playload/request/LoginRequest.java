package com.files.playload.request;

import jakarta.persistence.Column;

public class LoginRequest {
	@Column(nullable = false)
	private String username;

	@Column(nullable = false)
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
}
