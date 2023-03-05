package com.myProject.databaseManager.DomainLayer;

import java.util.Map;

public class CalendarsOfEvents {
    int id;
    String calendarName;//Название графика работы
    Map<Integer,String> calendarMap;//Мап с событиями календарей, 365 дней и описание события


    public CalendarsOfEvents(int id, String calendarName, Map<Integer,String> calendarMap){
        this.id = id;
        this.calendarName=calendarName;
        this.calendarMap=calendarMap;


    }

    public CalendarsOfEvents() {
        this.id = 0;
        this.calendarName = "calendarName";
        this.calendarMap = Map.of(0,"calendarEvent");
    }

}
