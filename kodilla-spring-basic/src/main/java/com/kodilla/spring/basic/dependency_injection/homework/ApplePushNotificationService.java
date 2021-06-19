package com.kodilla.spring.basic.dependency_injection.homework;

public class ApplePushNotificationService implements NotificationService {

    public void success(String address) {
        System.out.println("Apple Notification: package delivered to: " + address);
    }

    public void fail(String address) {
        System.out.println("Apple Notification: package not delivered to: " + address);
    }
}
