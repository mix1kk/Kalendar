package com.myProject.databaseManager.utils;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class Users implements Serializable {
    int id;
    String name;//ФИО
    int tabelNumber;// Табельный номер
    String position;//должность
    Date birthday; //День рождения
    Date employeeDate;//Дата трудоустройства
    String schedule;// Название графика работы
    String subUnit;// подразделение
    String group;// Группа прав доступа
    String phoneNumber;// Телефонный номер
    String postAdress;// Адрес электронной почты
    Map<String,Date> coveralls;// Спецодежда <Вид спецодежды, дата следующей замены>
    int [] events;// Массив событий для данного пользователя
    Date electroGroup; //дата следующей сдачи экзамена по электробезопасности

    public Users(int id,String name,int tabelNumber,String position,Date birthday,Date employeeDate,
                 String schedule,String subUnit,String group,String phoneNumber,String postAdress,
                 Map<String,Date> coveralls,int [] events,Date electroGroup){
        this.id = id;
        this.name=name;
        this.tabelNumber=tabelNumber;
        this.position=position;
        this.birthday=birthday;
        this.employeeDate=employeeDate;
        this.schedule=schedule;
        this.subUnit=subUnit;
        this.group=group;
        this.phoneNumber=phoneNumber;
        this.postAdress=postAdress;
        this.coveralls=coveralls;
        this.events=events;
        this.electroGroup=electroGroup;
            }

  public Users(){
        Date initialDate = new Date(2023-01-01);
      this.id = 0;
      this.name="name";
      this.tabelNumber= 0;
      this.position= "position";
      this.birthday= initialDate;
      this.employeeDate=initialDate;;
      this.schedule= "schedule";
      this.subUnit="subUnit";
      this.group= "user";
      this.phoneNumber="phoneNumber";
      this.postAdress="postAdress";
      this.coveralls= Map.of("coveralls", new Date(2023 - 01 - 01));
      this.events=new int[0];
      this.electroGroup=initialDate;
  }
}
