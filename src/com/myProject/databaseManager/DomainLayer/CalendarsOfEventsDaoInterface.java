package com.myProject.databaseManager.DomainLayer;

import java.util.List;

public interface CalendarsOfEventsDaoInterface {
    void addCalendar(CalendarsOfEvents calendar);
    Positions getCalendarsById(int id);
    List<CalendarsOfEvents> getAllCalendars();
    void updateCalendar(CalendarsOfEvents calendar);
    void deleteCalendars(String name);
    void deleteCalendar(int id);
}
