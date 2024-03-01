package com.antonio.store.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

import com.antonio.store.store.entity.CartItem;
import com.antonio.store.store.entity.User;

public interface CartItemRepository extends CrudRepository<CartItem, Long> {

	@EntityGraph(attributePaths = { "article" })
	List<CartItem> findAllByUserAndOrderIsNull(User user);

	void deleteAllByUserAndOrderIsNull(User user);

	int countDistinctByUserAndOrderIsNull(User user);
}
