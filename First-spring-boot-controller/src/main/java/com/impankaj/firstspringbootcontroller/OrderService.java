package com.impankaj.firstspringbootcontroller;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {

    private PaymentService paymentService;


    public OrderService() {}

    @PostConstruct
    public void init(){
        System.out.println("OrderService initialized");
    }

//    @Autowired
    public OrderService(PaymentService paymentService) {
     this.paymentService = paymentService;
    }

    public void placeOrder() {
       paymentService.processPayment(50.0);
    }

    @PreDestroy
    public void cancelOrder() {
        System.out.println("Order cancelled");
    }
}
