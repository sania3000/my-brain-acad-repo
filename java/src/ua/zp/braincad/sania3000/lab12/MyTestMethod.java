package ua.zp.braincad.sania3000.lab12;

import java.util.Arrays;
import java.util.Objects;

public class MyTestMethod {


    static <T extends Comparable> void calcNum ( T[] array, T maxNumber ) {

        int calc = 0;
        for (T e : array) {                                       //First task complete
            if (e.compareTo(maxNumber) > 0) {
                ++calc;


            }
        }
        System.out.println("Arrays values: " + Arrays.toString(array));
        System.out.println("Number of elements that are greater than " + maxNumber);
        System.out.println(calc);
    }

    //Second task

//    static <T extends Comparable, E extends Number> E calcSum ( T[] array, E maxElement ) {
//
//        Integer sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].compareTo(maxElement) > 0) {
//
//                sum+=(E)array[i];
//
//            }
//        }return sum;
//
//    }
}

//    @Override
//    public boolean equals ( Object obj ) {
//        return super.equals(obj);
//    }


