package com.myProject.databaseManager.DataLayer;

import com.myProject.databaseManager.DomainLayer.EventsDaoInterface;
import com.myProject.databaseManager.DomainLayer.Events;
import com.myProject.databaseManager.DomainLayer.Users;

import java.util.List;

public class Event implements EventsDaoInterface {
    @Override
    public void addEvent(Events event) {

    }

    @Override
    public List<Events> getAllEvents() {
        return null;
    }

    @Override
    public List<Events> getAllEventsForUser(Users user) {
        return null;
    }

    @Override
    public Events getEventById(int id) {
        return null;
    }

    @Override
    public void updateEvent(Events event) {

    }

    @Override
    public void removeEvent(Events event) {

    }
}
