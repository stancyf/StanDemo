package com.example.stan.demo.Sort;

/**
 * Created by Stan on 2018/8/25.
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 5, 6, 2, 8, 5, 1, 9, 7, 3, 2};
        QuickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int key = arr[left];
        while (left < right) {
            while (arr[right] >= key && left < right) {
                right--;
            }
            arr[left] = arr[right];
            while (arr[left] <= key && left < right) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[right] = key;
        return right;
    }

    public static void QuickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int index = partition(arr, left, right);
        QuickSort(arr, left, index - 1);
        QuickSort(arr, index + 1, right);
    }
}
