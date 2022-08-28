package com.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        MySort(array);


    }

    public static void MySort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int sum = array[i];
            int j = i - 1;
            while(j >= 0 && sum < array[j]) {
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = sum;
        }
        System.out.println(Arrays.toString(array ));
    }
}


