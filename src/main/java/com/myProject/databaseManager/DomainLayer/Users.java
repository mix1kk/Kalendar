package com.myProject.databaseManager.DomainLayer;

import java.util.*;

public class Users {
    int id;
    String name;//ФИО
    int tabelNumber;// Табельный номер
    String position;//должность
    Calendar birthday; //День рождения
    Calendar employeeDate;//Дата трудоустройства
    String schedule;// Название графика работы
    String subUnit;// подразделение
    String group;// Группа прав доступа
    String phoneNumber;// Телефонный номер
    String emailAddress;// Адрес электронной почты
    //Map<String,Date> coveralls;// Спецодежда <Вид спецодежды, дата следующей замены>
    Calendar electroGroup; //дата следующей сдачи экзамена по электробезопасности

    public Users(int id, String name, int tabelNumber, String position, Calendar birthday, Calendar employeeDate,
                 String schedule, String subUnit, String group, String phoneNumber, String postAdress,
            /* Map<String,Date> coveralls,ArrayList<Integer> events,*/Calendar electroGroup) {
        this.id = id;
        this.name = name;
        this.tabelNumber = tabelNumber;
        this.position = position;
        this.birthday = birthday;
        this.employeeDate = employeeDate;
        this.schedule = schedule;
        this.subUnit = subUnit;
        this.group = group;
        this.phoneNumber = phoneNumber;
        this.emailAddress = postAdress;
        // this.coveralls=coveralls;
        this.electroGroup = electroGroup;
    }

    public Users() {
        Calendar initialDate = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        System.out.println(initialDate);
        this.id = 0;
        this.name = "name";
        this.tabelNumber = 0;
        this.position = "position";
        this.birthday = initialDate;
        this.employeeDate = initialDate;
        ;
        this.schedule = "schedule";
        this.subUnit = "subUnit";
        this.group = "user";
        this.phoneNumber = "phoneNumber";
        this.emailAddress = "emailAdress";
        /*  this.coveralls= Map.of("coveralls", new Date(2023 - 01 - 01));*///todo:создать новую таблицу со спецодеждой
        this.electroGroup = initialDate;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTabelNumber() {
        return tabelNumber;
    }

    public void setTabelNumber(int tabelNumber) {
        this.tabelNumber = tabelNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public Calendar getEmployeeDate() {
        return employeeDate;
    }

    public void setEmployeeDate(Calendar employeeDate) {
        this.employeeDate = employeeDate;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSubUnit() {
        return subUnit;
    }

    public void setSubUnit(String subUnit) {
        this.subUnit = subUnit;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /*   public Map<String, Date> getCoveralls() {
           return coveralls;
       }
       //todo: убрать из юзеров это поле, сделать отдельную таблицу со спецодеждой
       public void setCoveralls(Map<String, Date> coveralls) {
           this.coveralls = coveralls;
       }
   */
    public Calendar getElectroGroup() {
        return electroGroup;
    }

    public void setElectroGroup(Calendar electroGroup) {
        this.electroGroup = electroGroup;
    }
}
