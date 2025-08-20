package com.impankaj.firstspringbootcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${payment-gateway.default}")
    private String defaultPaymentService;

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }

    public PaymentService paypal(){
        return new PaypalPaymentService();
    }

    @Bean
    public OrderService orderService(){
        if(defaultPaymentService.equals("stripe"))
            return new OrderService(stripe());

        return new OrderService(paypal());
    }
}
