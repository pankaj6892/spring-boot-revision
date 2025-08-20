package com.impankaj.firstspringbootcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripePaymentService")
//@Primary
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiURL}")
    private String apiURL;

    @Value("${stripe.timeout}")
    private String timeout;

    @Value("${stripe.enabled}")
    private Boolean enabled;

    @Value("${stripe.currencies}")
    private List<String> currencies;

    @Override
    public void processPayment(Double amount) {
        System.out.println("Stripe Payment");
        System.out.println("API URL: " + apiURL);
        System.out.println("Timeout: " + timeout);
        System.out.println("Enabled: " + enabled);
        System.out.println("Currencies: " + currencies);
        System.out.println("Amount: " + amount);
    }
}
