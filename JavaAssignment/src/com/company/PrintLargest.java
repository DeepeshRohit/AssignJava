package com.company;

public class PrintLargest {
    static void print3largest(int arr[], int arr_size)
    {
        int i, first, second, third;

        if (arr_size < 3) {
            System.out.print(" Invalid Input ");
            return;
        }

        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {

            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }


            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }

            else if (arr[i] > third)
                third = arr[i];
        }

        System.out.println(  first + " ," + second + " ," + third);
    }

}
