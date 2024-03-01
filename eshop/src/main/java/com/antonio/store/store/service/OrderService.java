package com.antonio.store.store.service;

import java.util.List;

import com.antonio.store.store.entity.Order;
import com.antonio.store.store.entity.Payment;
import com.antonio.store.store.entity.Shipping;
import com.antonio.store.store.entity.ShoppingCart;
import com.antonio.store.store.entity.User;

public interface OrderService {

	Order createOrder(ShoppingCart shoppingCart, Shipping shippingAddress, Payment payment, User user);

	List<Order> findByUser(User user);

	Order findOrderWithDetails(Long id);
}
