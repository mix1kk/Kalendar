package com.myProject.databaseManager.DatabaseDao;

public interface InterfaceDaoFactory {
    InterfaceUsersDao getUsersDao();
    EventsDao getEventsDao();
    SchedulesDao getSchedulesDao();
    PositionsDao getPositionsDao();
    CalendarsDao getCalendarsDao();

}
