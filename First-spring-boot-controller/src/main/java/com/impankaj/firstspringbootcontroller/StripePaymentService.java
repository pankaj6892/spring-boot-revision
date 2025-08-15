package com.impankaj.firstspringbootcontroller;

public class StripePaymentService implements PaymentService {

    @Override
    public void processPayment(Double amount) {
        System.out.println("Stripe Payment");
        System.out.println("Amount: " + amount);
    }
}
