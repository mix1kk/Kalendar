package com.myProject.databaseManager.DatabaseDao;

import com.myProject.databaseManager.utils.Events;
import com.myProject.databaseManager.utils.Users;

import java.util.List;

public interface InterfaceEventsDao {
    void addEvent(Events event);
    List<Events> getAllEvents();
    List<Events> getAllEventsForUser(Users user);
    Events getEventById(int id);
    void updateEvent(Events event);
    void removeEvent(Events event);
}
