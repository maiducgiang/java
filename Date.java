package com.company;

public class Date{
    private int day;
    private int month;
    private int year;
    public Date(int day, int month,  int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void setDate(int day, int month,  int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }
    public void display(){
        if(day < 10 && month < 10)
            System.out.println("0" +day + "/0" + month + "/" + year);
        else if(day < 10) System.out.println("0" +day + "/" + month + "/" + year);
        else if(month < 10) System.out.println(day + "/0" + month + "/" + year);
        else System.out.println(day + "/" + month + "/" + year);
        /*String day = this.day + "";
        String month = this.month + "";
        String year = this.year + "";
        if (day.length() == 1) {
            day = "0" + day;
        }
        if (month.length() == 1) {
            month = "0" + month;
        }
        System.out.println(day + "/" + month + "/" + year);*/
    }
}
