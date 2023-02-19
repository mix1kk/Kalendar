package com.myProject.databaseManager.utils;
import java.util.Date;
import java.util.Map;

public class Positions {
    int id;
    String positionName;//Название должности
    Map<String, Integer> coveralls;// Мап спецодежды, название спецодежды и количество дней до замены
    String [] users;// Массив имен пользователей, которые принадлежат данной должности
    String hazardCategory;// Категория вредности(Возможно заменить на перечисление)
    Double salary;// Оклад


    public Positions(int id,String positionName, Map<String,Integer> coveralls,
                     String [] users,String hazardCategory,Double salary){
        this.id = id;
        this.positionName=positionName;
        this.coveralls=coveralls;
        this.users = users;
        this.hazardCategory = hazardCategory;
        this.salary = salary;

    }

    public Positions() {
        this.id = 0;
        this.positionName = "positionName";
        this.coveralls = Map.of("coveralls", 0);
        this.users =new String [0];
        this.hazardCategory = "hazardCategory";
        this.salary = 0.0;
    }
}
