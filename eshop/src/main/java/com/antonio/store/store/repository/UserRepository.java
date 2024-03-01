package com.antonio.store.store.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.repository.CrudRepository;

import com.antonio.store.store.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

	@EntityGraph(value = "UserComplete", type=EntityGraphType.FETCH)
	User findByUsername(String username);

	User findByEmail(String email);

}
