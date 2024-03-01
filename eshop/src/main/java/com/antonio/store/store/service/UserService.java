package com.antonio.store.store.service;


import java.util.List;

import com.antonio.store.store.entity.User;

public interface UserService {

	User findById(Long id);

	User findByUsername(String username);

	User findByEmail(String email);

	void save(User user);

	User createUser(String username, String email,  String password, List<String> roles);

}
