package com.myProject.databaseManager.utils;
import java.util.Date;

public class Schedules {
    int id;
    String scheduleName;//Название графика работы
    int [] scheduleArray;//Массив интов графика работы, 56 дней(наименьший общий период повторения), привести к общей дате


    public Schedules(int id,String scheduleName, int [] scheduleArray){
        this.id = id;
        this.scheduleName=scheduleName;
        this.scheduleArray=scheduleArray;


    }

    public Schedules() {
        this.id = 0;
        this.scheduleName = "scheduleName";
        this.scheduleArray = new int [56];
    }


}
