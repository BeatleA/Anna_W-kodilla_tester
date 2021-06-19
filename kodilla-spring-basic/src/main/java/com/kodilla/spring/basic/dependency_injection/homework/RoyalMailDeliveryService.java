package com.kodilla.spring.basic.dependency_injection.homework;

public class RoyalMailDeliveryService implements DeliveryService{

    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Royal Mail delivery in progress...");
        return true;
    }
}
