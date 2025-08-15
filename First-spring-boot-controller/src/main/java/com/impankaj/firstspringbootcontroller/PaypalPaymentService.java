package com.impankaj.firstspringbootcontroller;

public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(Double amount) {
        System.out.println("Paypal Payment");
        System.out.println("Amount: " + amount);
    }
}
