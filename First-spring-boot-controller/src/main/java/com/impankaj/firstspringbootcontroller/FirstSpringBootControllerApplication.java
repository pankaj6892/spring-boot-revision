package com.impankaj.firstspringbootcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootControllerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FirstSpringBootControllerApplication.class, args);

        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
