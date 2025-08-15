package com.impankaj.notificationmanager;

import org.springframework.stereotype.Service;

@Service("emailNotificationService")
public class EmailNotificationService implements NotificationService {
    public void send(String message) {
        System.out.println("Email Notification");
        System.out.println("Message: " + message);
    }
}
