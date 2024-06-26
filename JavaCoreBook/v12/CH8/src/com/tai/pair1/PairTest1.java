package com.tai.pair1;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * @author Cay Horstmann
 * @version 1.01 2012-01-26
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        System.out.println("middle = %s".formatted(ArrayAlg.getMiddle(words)));
    }
}

 class ArrayAlg {

     /**
     * Gets the minimum and maximum of an array of strings.
     *
     * @param a an array of strings
     * @return a pair with the min and max values, or null if a is null or empty
     */

    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }

    //// Get the middle element of an array of objects with generics method.
    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }
}