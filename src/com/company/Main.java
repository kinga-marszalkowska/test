package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new Integer[]{1, 2, 3, 4})));
        // write your code here
    }

    public static <T extends Comparable<T>> T[] selectionSort(T[] param){
        return param;
    }
}
