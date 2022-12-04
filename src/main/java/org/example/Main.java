package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int min = getMin(array);
        System.out.println(String.format("Минимум равен %d", min));
        int max = getMax(array);
        System.out.println(String.format("Максимум равен %d", max));
        Double mean = getMean(array);
        System.out.println(String.format("Среднее равено %f", mean));
    }

    public static int getMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int getMax(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static double getMean(int[] array){
        double mean;
        double sum = 0;
        int lengthArray = array.length;
        for (int item: array) {
            sum += item;
        }
        mean = sum / lengthArray;
        return mean;
    }


}