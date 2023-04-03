package com.david.learn.algorithm.selectsort;

/**
 * 简单选择排序
 * 第 i 趟排序再待排序序列 a[i]~a[n] 中选取关键码最小的记录，并和第 i 个记录交换作为有序序列的第 i 个记录。
 */
public class SimpleSelectSort {

    public static void simpleSelectSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                   minIndex = j;
                }
            }

            /**
             * 交换元素
             */
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

}
