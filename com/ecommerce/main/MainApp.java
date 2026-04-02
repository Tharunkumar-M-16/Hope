package com.ecommerce.main;

import com.ecommerce.service.CartService;;

public class MainApp {
    public static void main(String[] args) {
        CartService cartService = new CartService();
        Product product = new Product(1, " gugugaga", "10000000", "10000000");
        Product product2 = new Product(2, " gugugaga", "10000000", "10000000");
        cartService.addCart(product);
        cartService.addCart(product2);
        cartService.displayCart();
        System.out.println("Total price: " + cartService.calculateTotal());

    }
}
