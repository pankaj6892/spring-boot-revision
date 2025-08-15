package com.impankaj.firstspringbootcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootControllerApplication {

    public static void main(String[] args) {
//        SpringApplication.run(FirstSpringBootControllerApplication.class, args);

        OrderService orderService = new OrderService();
        orderService.setPaymentService(new PaypalPaymentService());
        orderService.placeOrder();
    }

}
