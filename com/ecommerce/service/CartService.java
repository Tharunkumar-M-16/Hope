package com.ecommerce.service;

import java.util.*;
import com.ecommerce.model.Product;

public class CartService {
    private List<Product> cart = new ArrayList<>();

    public void addCart(Product product) {
        cart.add(product);

    }

    public void removeFromCart(Product product) {
        cart.remove(product);

    }

    public void displayCart() {
        System.out.println("Cart items:");
        for (Product product : cart) {
            System.out.println(product);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        return total;
    }
}
