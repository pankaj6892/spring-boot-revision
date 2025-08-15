package com.impankaj.firstspringbootcontroller;

public class OrderService {
    public void placeOrder(String orderDetails) {
        StripePaymentService stripePaymentService = new StripePaymentService();
        stripePaymentService.processPayment(50.0);
    }
}
