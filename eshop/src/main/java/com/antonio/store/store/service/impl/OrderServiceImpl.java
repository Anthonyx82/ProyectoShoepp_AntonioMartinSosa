package com.antonio.store.store.service.impl;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antonio.store.store.entity.Article;
import com.antonio.store.store.entity.CartItem;
import com.antonio.store.store.entity.Order;
import com.antonio.store.store.entity.Payment;
import com.antonio.store.store.entity.Shipping;
import com.antonio.store.store.entity.ShoppingCart;
import com.antonio.store.store.entity.User;
import com.antonio.store.store.repository.ArticleRepository;
import com.antonio.store.store.repository.CartItemRepository;
import com.antonio.store.store.repository.OrderRepository;
import com.antonio.store.store.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	CartItemRepository cartItemRepository;

	@Autowired
	ArticleRepository articleRepository;

	@Override
	@Transactional
	@CacheEvict(value = "itemcount", allEntries = true)
	public synchronized Order createOrder(ShoppingCart shoppingCart, Shipping shipping, Payment payment, User user) {
		Order order = new Order();
		order.setUser(user);
		order.setPayment(payment);
		order.setShipping(shipping);
		order.setOrderTotal(shoppingCart.getGrandTotal());
		shipping.setOrder(order);
		payment.setOrder(order);
		LocalDate today = LocalDate.now();
		LocalDate estimatedDeliveryDate = today.plusDays(5);
		order.setOrderDate(Date.from(today.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		order.setShippingDate(Date.from(estimatedDeliveryDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		order.setOrderStatus("In Progress");

		order = orderRepository.save(order);

		List<CartItem> cartItems = shoppingCart.getCartItems();
		for (CartItem item : cartItems) {
			Article article = item.getArticle();
			article.decreaseStock(item.getQty());
			articleRepository.save(article);
			item.setOrder(order);
			cartItemRepository.save(item);
		}
		return order;
	}

	@Override
	public Order findOrderWithDetails(Long id) {
		return orderRepository.findEagerById(id);
	}

	@Override
	public List<Order> findByUser(User user) {
		return orderRepository.findByUser(user);
	}

}
