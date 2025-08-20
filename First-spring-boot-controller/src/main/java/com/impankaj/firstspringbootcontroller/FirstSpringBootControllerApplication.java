package com.impankaj.firstspringbootcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringBootControllerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FirstSpringBootControllerApplication.class, args);

        var heavyResource = context.getBean(HeavyResource.class);

        context.close();

//        var orderService = context.getBean(OrderService.class);
//        orderService.placeOrder();
    }

}
