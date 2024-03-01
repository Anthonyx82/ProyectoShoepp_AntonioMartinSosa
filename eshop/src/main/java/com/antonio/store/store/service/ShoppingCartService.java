package com.antonio.store.store.service;

import com.antonio.store.store.entity.Article;
import com.antonio.store.store.entity.CartItem;
import com.antonio.store.store.entity.ShoppingCart;
import com.antonio.store.store.entity.User;


public interface ShoppingCartService {

	ShoppingCart getShoppingCart(User user);

	int getItemsNumber(User user);

	CartItem findCartItemById(Long cartItemId);

	CartItem addArticleToShoppingCart(Article article, User user, int qty, String size);

	void clearShoppingCart(User user);

	void updateCartItem(CartItem cartItem, Integer qty);

	void removeCartItem(CartItem cartItem);

}
