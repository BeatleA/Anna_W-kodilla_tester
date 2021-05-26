package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WeatherWarningService {
    private HashMap<Location, Set<Subscriber>> subscriptionLists = new HashMap<>();

    public void addLocation(Location location) {
        if (!subscriptionLists.containsKey(location))
            this.subscriptionLists.put(location, new HashSet<>());
    }

    public void addSubscriber(Subscriber subscriber, Location location) {
        if (subscriptionLists.containsKey(location))
            this.subscriptionLists.get(location).add(subscriber);
    }

    public void sendNotification(Location location, WeatherNotification weatherNotification) {
        if (subscriptionLists.containsKey(location))
            this.subscriptionLists.get(location).forEach(subscriber -> subscriber.receive(weatherNotification));
    }

    public void sendNotificationToAll(WeatherNotification weatherNotification) {
        for (Location location : subscriptionLists.keySet())
           this.subscriptionLists.get(location).forEach(subscriber -> subscriber.receive(weatherNotification));
    }

    public void removeSubscriber(Subscriber subscriber, Location location) {
        if (subscriptionLists.containsKey(location))
            this.subscriptionLists.get(location).remove(subscriber);
    }

    public void removeSubscriberFromAllLocations(Subscriber subscriber) {
        for (Location location : subscriptionLists.keySet())
            subscriptionLists.get(location).remove(subscriber);
    }

    public void removeLocation(Location location) {

        subscriptionLists.remove(location);
    }
}
