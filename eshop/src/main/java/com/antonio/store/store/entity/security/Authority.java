package com.antonio.store.store.entity.security;

import org.springframework.security.core.GrantedAuthority;

@SuppressWarnings("serial")
public class Authority implements GrantedAuthority {

	private final String authority;

	public Authority(String authority) {
		this.authority = authority;
	}

	@Override
	public String getAuthority() {
		return authority;
	}

}
