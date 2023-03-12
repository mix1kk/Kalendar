package com.myProject.databaseManager.DomainLayer;

import java.util.ArrayList;
import java.util.Map;

public class CalendarsOfEvents {
    int id;
    int year;
    String calendarName;//Название графика работы
   ArrayList<String> calendarList;//Массив с событиями календарей, 365 дней и описание события


    public CalendarsOfEvents(int id,int year, String calendarName, ArrayList<String> calendarList){
        this.id = id;
        this.year = year;
        this.calendarName=calendarName;
        this.calendarList=calendarList;


    }

    public CalendarsOfEvents() {
        this.id = 0;
        this.year = 2023;
        this.calendarName = "calendarName";
        this.calendarList = new ArrayList<>();
    }

}
