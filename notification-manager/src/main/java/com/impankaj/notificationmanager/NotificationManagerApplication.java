package com.impankaj.notificationmanager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NotificationManagerApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(NotificationManagerApplication.class, args);

        var notificationManager = context.getBean(NotificationManager.class);
        notificationManager.send("Hello, this is a test notification!");
    }



}
