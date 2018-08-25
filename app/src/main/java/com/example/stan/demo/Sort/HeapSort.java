package com.example.stan.demo.Sort;

/**
 * Created by Stan on 2018/8/25.
 */

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 5, 6, 2, 8, 5, 1, 9, 7, 3, 2};
        HeapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void HeapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            adjustHeap(arr, 0, i);
        }
    }

    public static void adjustHeap(int[] arr, int i, int size) {
        int temp = arr[i];
        int j;
        for (j = 2 * i + 1; j < size; j = 2 * i + 1) {
            if (j + 1 < size && arr[j + 1] > arr[j]) {
                j++;
            }
            if (arr[j] > temp) {
                arr[i] = arr[j];
                i = j;
            } else {
                break;
            }
        }
        arr[i] = temp;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
