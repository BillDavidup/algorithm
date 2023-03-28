package com.david.learn.algorithm.quicksort.one;

import com.david.learn.algorithm.array.ArrayTools;

/**
 * 快速排序
 * https://www.youtube.com/watch?v=AsQW27DT82I
 */
public class QuickSortOne {
    /**
     * @param arr
     * @param left  数组下标 最小值 = 0
     * @param right 数组下标，最大值 = arr.length - 1
     */
    public static void quickSort(int[] arr, int left, int right) {

        /*
         * 递归终止条件：下标范围检查和只有一个元素的时候返回
         */
        if (!(left >= 0 && right <= arr.length - 1 && right - left > 0)) {
            return;
        }

        int i = left;
        int j = right;
        // 基准值
        int standard = arr[i];

        /*
         * 当i和j不相等的时候，从右往左找到比基准值小的，从左往右找比基准值大的，找到则交换
         */
        while (i != j) {
            // 从右往左找到比基准值小的
            while (standard <= arr[j] && i < j) {
                j -= 1;
            }
            // 从左往右找比基准值大的
            while (standard >= arr[i] && i < j) {
                i += 1;
            }
            // 找到则交换
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        /*
         * 如果数组左右下标i和j相遇了，则数组i位置的元素和基准值互换
         */
        arr[left] = arr[i];
        arr[i] = standard;

        /*
         * 数组以基准值为界，分为左子数组和右子数组，左子数组元素都不大于基准值，右边子数组元素都不小于基准值
         */
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }
}
