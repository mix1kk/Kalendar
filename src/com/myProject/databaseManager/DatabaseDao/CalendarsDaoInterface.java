package com.myProject.databaseManager.DatabaseDao;

import com.myProject.databaseManager.utils.Calendars;
import com.myProject.databaseManager.utils.Positions;

import java.util.List;

public interface CalendarsDaoInterface {
    void addCalendar(Calendars calendar);
    Positions getCalendarsById(int id);
    List<Calendars> getAllCalendars();
    void updateCalendar(Calendars calendar);
    void deleteCalendars(String name);
    void deleteCalendar(int id);
}
