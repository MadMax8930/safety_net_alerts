package com.max.safetyalerts.auth.payload.request;

import lombok.Data;


@Data
public class LoginRequest {
	private String email;

	private String password;
}
