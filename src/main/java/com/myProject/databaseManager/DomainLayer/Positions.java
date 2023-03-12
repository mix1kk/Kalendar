package com.myProject.databaseManager.DomainLayer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class Positions {
    int id;
    String positionName;//Название должности
    ArrayList<String> coveralls;// Массив названий спецодежды, которую положено выдавать
    ArrayList<String> users;// Массив имен пользователей, которые принадлежат данной должности
    String hazardCategory;// Категория вредности(Возможно заменить на перечисление)
    Double salary;// Оклад


    public Positions(int id,String positionName, ArrayList<String> coveralls,
                     ArrayList<String> users,String hazardCategory,Double salary){
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
        this.coveralls = new ArrayList<>();
        this.users =new ArrayList<>();
        this.hazardCategory = "hazardCategory";
        this.salary = 0.0;
    }
}
