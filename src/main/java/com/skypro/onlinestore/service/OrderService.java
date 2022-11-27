package com.skypro.onlinestore.service;

import com.skypro.onlinestore.componenet.Cart;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class OrderService {

    private final Cart cart;

    public OrderService(Cart cart) {
        this.cart = cart;
    }

    public void addToCart(List<Integer> idsToAdd) {
        cart.addToCart(idsToAdd);
    }


    public List<Integer> getItems() {
        return cart.getCartContent();
    }
}
