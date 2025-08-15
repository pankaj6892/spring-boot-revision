package com.impankaj.firstspringbootcontroller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("stripePaymentService")
@Primary
public class StripePaymentService implements PaymentService {

    @Override
    public void processPayment(Double amount) {
        System.out.println("Stripe Payment");
        System.out.println("Amount: " + amount);
    }
}
