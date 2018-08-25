package com.example.stan.demo.Sort;

/**
 * Created by Stan on 2018/8/25.
 */

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 5, 6, 2, 8, 5, 1, 9, 7, 3, 2};
        InsertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void InsertSort(int[] arr) {
        int j;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }
}
