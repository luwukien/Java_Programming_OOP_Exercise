package data;

import java.sql.SQLOutput;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

//    public boolean isValidDate(int day, int month, int yeaur) {
//        if (day > 0  && day < 31) {
//            return true;
//        }
//        else
//            throw new IllegalArgumentException("Invalid date");

//    }
    //setter
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //getter

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%02d : %02d : %04d", day, month, year);
    }



}
