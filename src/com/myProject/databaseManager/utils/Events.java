package com.myProject.databaseManager.utils;

import java.util.Date;
import java.util.Map;

public class Events {
        int id;
        String eventName;//Название события
        String creator; // Автор события
        String [] users;//Массив пользователей, кто участвует в этом ивенте
        Date [] dates; //Массив дат, продолжительностью от начала до конца события
        Date notificationDate;//Дата напоминания о событии
        String typeOfEvent;// Тип события
        boolean isDone;// Флаг выполнено/не выполнено
        boolean isVisible;// Флаг видимо/не видимо
        String comment;// Текстовый комментарий
        String repeatPeriod;// Для повторяемых событий период повторения


        public Events(int id,String eventName, String creator,String [] users,Date [] dates, Date notificationDate,
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
            this.users= new String [0];
            this.dates=new Date [0];
            this.notificationDate=new Date(2023-01-01);
            this.typeOfEvent="typeOfEvent";
            this.isDone=true;
            this.isVisible=true;
            this.comment="comment";
            this.repeatPeriod="repeatPeriod";
        }

}
