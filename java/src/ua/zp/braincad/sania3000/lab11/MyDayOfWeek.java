package ua.zp.braincad.sania3000.lab11;

import java.util.Arrays;

public enum MyDayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;


    public void nextDay () {
    MyDayOfWeek week = this;
    MyDayOfWeek[] myDayOfWeek = MyDayOfWeek.values();

        System.out.println("The next day of week: " + myDayOfWeek[week.ordinal()+1]);
        //if (myDayOfWeek[week.ordinal()+1]==(ArrayIndexOutOfBoundsException) {
       // return;


    }

}