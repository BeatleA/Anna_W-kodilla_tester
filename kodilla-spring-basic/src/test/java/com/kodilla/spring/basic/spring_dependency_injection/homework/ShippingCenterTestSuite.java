package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldReturnSuccessShippingMessage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("45 Thames Street, Oxford, OX1 1ES", 25);
        Assertions.assertEquals("Package delivered to: 45 Thames Street, Oxford, OX1 1ES", message);
    }

    @Test
    public void shouldReturnFailShippingMessage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("45 Thames Street, Oxford, OX1 1ES", 35);
        Assertions.assertEquals("Package not delivered to: 45 Thames Street, Oxford, OX1 1ES", message);
    }

    @Test
    public void shouldReturnSuccessMessage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.success("45 Thames Street, Oxford, OX1 1ES");
        Assertions.assertEquals("Package delivered to: 45 Thames Street, Oxford, OX1 1ES", message);
    }

    @Test
    public void shouldReturnFailMessage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.fail("45 Thames Street, Oxford, OX1 1ES");
        Assertions.assertEquals("Package not delivered to: 45 Thames Street, Oxford, OX1 1ES", message);
    }

    @Test
    public void shouldReturnTrue(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean isDelivered = bean.deliverPackage("45 Thames Street, Oxford, OX1 1ES", 30);
        Assertions.assertTrue(isDelivered);
    }

    @Test
    public void shouldReturnFalse(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean isDelivered = bean.deliverPackage("45 Thames Street, Oxford, OX1 1ES", 31);
        Assertions.assertFalse(isDelivered);
    }

}