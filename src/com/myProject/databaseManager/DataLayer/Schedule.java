package com.myProject.databaseManager.DataLayer;

import com.myProject.databaseManager.DomainLayer.SchedulesDaoInterface;
import com.myProject.databaseManager.DomainLayer.Schedules;

import java.util.List;

public class Schedule implements SchedulesDaoInterface {
    @Override
    public void addSchedule(Schedules schedule) {

    }

    @Override
    public Schedules getScheduleById(int id) {
        return null;
    }

    @Override
    public Schedules getScheduleByName(String name) {
        return null;
    }

    @Override
    public List<Schedules> getAllSchedules() {
        return null;
    }

    @Override
    public void updateSchedule(Schedules schedule) {

    }

    @Override
    public void deleteSchedule(String name) {

    }

    @Override
    public void deleteSchedule(int id) {

    }
}
