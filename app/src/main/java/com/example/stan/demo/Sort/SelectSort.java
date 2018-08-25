package com.example.stan.demo.Sort;

/**
 * Created by Stan on 2018/8/25.
 */

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 5, 6, 2, 8, 5, 1, 9, 7, 3, 2};
        SelectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void SelectSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                swap(arr, minIndex, i);
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
