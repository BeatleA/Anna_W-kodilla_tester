package com.kodilla.spring.basic.dependency_injection.homework;

public class DPDDeliveryService implements DeliveryService {

    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("DPD courier delivery in progress...");
        return true;
    }
}
