package com.myProject.databaseManager.DomainLayer;

import java.util.List;

public interface EventsDaoInterface {
    void addEvent(Events event);
    List<Events> getAllEvents();
    List<Events> getAllEventsForUser(Users user);
    Events getEventById(int id);
    void updateEvent(Events event);
    void removeEvent(Events event);
}
