package com.kodilla.spring.basic.dependency_injection.homework;

public class AmazonSimpleNotificationService implements NotificationService {

    public void success(String address) {
        System.out.println("Amazon Notification: package delivered to: " + address);
    }

    public void fail(String address) {
        System.out.println("Amazon Notification: package not delivered to: " + address);
    }
}
