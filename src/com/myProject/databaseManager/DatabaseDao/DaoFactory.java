package com.myProject.databaseManager.DatabaseDao;

public class DaoFactory implements InterfaceDaoFactory{
    private static InterfaceDaoFactory factory;
    public static synchronized InterfaceDaoFactory getInstance(){
        if (factory == null){
            factory = new DaoFactory();
        }
        return factory;
    }

    @Override
    public InterfaceUsersDao getUsersDao() {
        return new UsersJDBCDao();
    }

    @Override
    public EventsDao getEventsDao() {
        return new EventsDao();
    }

    @Override
    public SchedulesDao getSchedulesDao() {
        return new SchedulesDao();
    }

    @Override
    public PositionsDao getPositionsDao() {
        return new PositionsDao();
    }

    @Override
    public CalendarsDao getCalendarsDao() {
        return new CalendarsDao();
    }
}
