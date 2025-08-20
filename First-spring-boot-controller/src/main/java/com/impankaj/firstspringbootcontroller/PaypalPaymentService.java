package com.impankaj.firstspringbootcontroller;

import org.springframework.stereotype.Service;

//@Service("paypalPaymentService")
public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(Double amount) {
        System.out.println("Paypal Payment");
        System.out.println("Amount: " + amount);
    }
}
