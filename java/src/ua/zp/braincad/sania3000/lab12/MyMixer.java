package ua.zp.braincad.sania3000.lab12;

import java.util.Arrays;

import java.util.Collections;
/**
 * 4 task complete
 *
 */

public class MyMixer<T> {
    T[] array;

    public MyMixer ( T[] array ) {
        this.array = array;
    }

    public void shuffle(){
        Collections.shuffle(Arrays.asList(array));
        System.out.println(Arrays.toString(array));

    }
}
