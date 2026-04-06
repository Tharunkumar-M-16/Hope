package com.ecommerce.main;

import com.ecommerce.model.Product;
import com.ecommerce.service.CartService;

public class MainApp {
    public static void main(String[] args) {
        CartService cartService = new CartService();
        Product product = new Product(1, "Product1", 100.0, 10);
        Product product2 = new Product(2, "Product2", 200.0, 20);
        cartService.addCart(product);
        cartService.addCart(product2);
        cartService.displayCart();
        System.out.println("Total price: " + cartService.calculateTotal());

    }
}
