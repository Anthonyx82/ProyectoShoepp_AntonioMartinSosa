package com.antonio.store.store.repository;

import org.springframework.data.repository.CrudRepository;

import com.antonio.store.store.entity.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

	Role findByName(String name);

}
