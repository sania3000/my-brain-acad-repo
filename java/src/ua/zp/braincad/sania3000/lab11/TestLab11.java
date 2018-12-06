package ua.zp.braincad.sania3000.lab11;

import java.util.Arrays;
import java.util.Scanner;

public class TestLab11 {
    public static void main ( String[] args ) {

        MyDayOfWeek[] myDayOfWeek = MyDayOfWeek.values();
        Scanner scanner =new Scanner(System.in);

        System.out.println(Arrays.toString(MyDayOfWeek.values()));

        for (MyDayOfWeek a : MyDayOfWeek.values())

            System.out.println(a);

        for (int i = 0; i < myDayOfWeek.length; i++) {

            switch (myDayOfWeek[i]) {
                case TUESDAY:
                case THURSDAY:
                    System.out.println("My java day : " + myDayOfWeek[i]);
                    break;
                    default:
            }


        }

        MyDayOfWeek.SUNDAY.nextDay();
        myDayOfWeek[1].nextDay();
    }

}
