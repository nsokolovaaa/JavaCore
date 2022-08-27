package com.example;
import java.util.Random;

public class Main {


    public static void main(String[] args) {


        int[][] array = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                array[i][j] = random.nextInt(20);


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }

        findMin(array);
        findMax(array);
        findAverage(array);

    }

    public static void findMin(int[][] array) {
        int minIndex = 0;
        int minValue = array[minIndex][minIndex];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (array[i][j] < minValue) {
                    minValue = array[i][j];
                    minIndex = i;
                }
            }

        }
        System.out.println(String.format("Min number is [%d] ", minValue));


    }

    public static void findMax(int[][] array) {
        int maxIndex = 0;
        int maxValue = array[maxIndex][maxIndex];
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {

                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                    maxIndex = i;
                }

            }

        }
        System.out.println(String.format("Max number is [%d] ", maxValue));


    }

    public static void findAverage(int[][] array) {
        int average = 0;
        if (array.length > 0) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    sum += array[i][j];
                }
                average =   sum / 25;
            }
        }
        System.out.println(String.format("Average number is [%d] ", average));
    }
}



