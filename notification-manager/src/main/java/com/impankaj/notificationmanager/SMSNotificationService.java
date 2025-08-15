package com.impankaj.notificationmanager;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("SMSNotificationService")
@Primary
public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS Notification");
        System.out.println("Message: " + message);
    }
}
