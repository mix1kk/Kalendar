package com.myProject.databaseManager.DomainLayer;

import java.util.List;

public interface SchedulesDaoInterface {
    void addSchedule(Schedules schedule);
    Schedules getScheduleById(int id);
    Schedules getScheduleByName(String name);
    List<Schedules> getAllSchedules();
    void updateSchedule(Schedules schedule);
    void deleteSchedule(String name);
    void deleteSchedule(int id);
}
