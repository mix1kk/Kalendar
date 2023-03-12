package com.myProject.databaseManager.DomainLayer;

import java.util.*;

public class Events {
        int id;
        String eventName;//Название события
        String creator; // Автор события
        ArrayList<String> users;//Массив пользователей, кто участвует в этом ивенте
        ArrayList<Calendar> dates; //Массив дат, продолжительностью от начала до конца события
        Calendar notificationDate;//Дата напоминания о событии
        String typeOfEvent;// Тип события
        boolean isDone;// Флаг выполнено/не выполнено
        boolean isVisible;// Флаг видимо/не видимо
        String comment;// Текстовый комментарий
        String repeatPeriod;// Для повторяемых событий период повторения


        public Events(int id,String eventName, String creator,ArrayList<String> users,ArrayList<Calendar> dates, Calendar notificationDate,
                      String typeOfEvent, boolean isDone,boolean isVisible,String comment,String repeatPeriod){
            this.id = id;
            this.eventName=eventName;
            this.creator=creator;
            this.users=users;
            this.dates=dates;
            this.notificationDate=notificationDate;
            this.typeOfEvent=typeOfEvent;
            this.isDone=isDone;
            this.isVisible=isVisible;
            this.comment=comment;
            this.repeatPeriod=repeatPeriod;

        }

        public Events(){
            this.id = 0;
            this.eventName="eventName";
            this.creator="creator";
            this.users= new ArrayList<>();
            this.dates= new ArrayList<>();
            this.notificationDate=new GregorianCalendar(2023, Calendar.JANUARY, 1);
            this.typeOfEvent="typeOfEvent";
            this.isDone=true;
            this.isVisible=true;
            this.comment="comment";
            this.repeatPeriod="repeatPeriod";
        }

}
