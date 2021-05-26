package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherWarningServiceTestSuite {
    WeatherWarningService weatherWarningService = new WeatherWarningService();
    Subscriber subscriber = Mockito.mock(Subscriber.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);
    Location location = Mockito.mock(Location.class);

    @Test
    public void newSubscriberShouldBeSubscribedToLocationAndReceiveNotification() {
        weatherWarningService.sendNotification(location, weatherNotification);
        Mockito.verify(subscriber, Mockito.times(1)).receive(weatherNotification);
    }

    @Test
    public void subscriberShouldBeUnsubscribeFromLocation() {
        weatherWarningService.removeSubscriber(subscriber, location);
        weatherWarningService.sendNotification(location, weatherNotification);
        Mockito.verify(subscriber, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void subscriberShouldBeUnsubscribeFromAllLocations() {
        Location location2 = Mockito.mock(Location.class);
        weatherWarningService.addLocation(location2);
        Location location3 = Mockito.mock(Location.class);
        weatherWarningService.addLocation(location3);
        weatherWarningService.addSubscriber(subscriber, location2);
        weatherWarningService.addSubscriber(subscriber, location3);
        weatherWarningService.removeSubscriberFromAllLocations(subscriber);
        weatherWarningService.sendNotification(location, weatherNotification);
        Mockito.verify(subscriber, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void notSubscribedToLocationShouldNotReceiveNotification() {
        Location location2 = Mockito.mock(Location.class);
        weatherWarningService.addLocation(location2);
        Subscriber subscriber2 = Mockito.mock(Subscriber.class);
        Subscriber subscriber3 = Mockito.mock(Subscriber.class);
        weatherWarningService.addSubscriber(subscriber2, location2);
        weatherWarningService.addSubscriber(subscriber3, location);
        weatherWarningService.sendNotification(location, weatherNotification);
        Mockito.verify(subscriber, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(subscriber2, Mockito.never()).receive(weatherNotification);
        Mockito.verify(subscriber3, Mockito.times(1)).receive(weatherNotification);
   }

    @Test
    public void allSubscribedShouldReceiveNotification() {
        Location location2 = Mockito.mock(Location.class);
        weatherWarningService.addLocation(location2);
        Subscriber subscriber2 = Mockito.mock(Subscriber.class);
        Subscriber subscriber3 = Mockito.mock(Subscriber.class);
        weatherWarningService.addSubscriber(subscriber, location2);
        weatherWarningService.addSubscriber(subscriber2, location2);
        weatherWarningService.addSubscriber(subscriber3, location);
        weatherWarningService.sendNotificationToAll(weatherNotification);
        Mockito.verify(subscriber, Mockito.times(2)).receive(weatherNotification);
        Mockito.verify(subscriber2, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(subscriber3, Mockito.times(1)).receive(weatherNotification);
    }

    @Test
    public void locationShouldBeRemoved() {
        weatherWarningService.removeLocation(location);
        weatherWarningService.sendNotification(location, weatherNotification);
        Mockito.verify(subscriber, Mockito.never()).receive(weatherNotification);
    }

    @BeforeEach
    public void initializeWeatherWarningService() {
        weatherWarningService.addLocation(location);
        weatherWarningService.addSubscriber(subscriber, location);
    }
}