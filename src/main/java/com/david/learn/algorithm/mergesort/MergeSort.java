package com.david.learn.algorithm.mergesort;

/**
 * 归并排序
 * https://blog.csdn.net/Px01Ih8/article/details/128758965
 */
public class MergeSort {

    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    /**
     * 1.确定递归方法的功能边界：给定一个数组及左右边界，方法完成数组边界内元素的排序
     *
     * @param arr
     * @param left
     * @param right
     */
    private static void mergeSort(int[] arr, int left, int right) {
        /**
         * 3.确定递归终止条件
         */
        if (arr == null || left == right) {
            return;
        }
        int mid = left + (right - left) / 2; //分割的边界
        mergeSort(arr, left, mid); //对左半部分调用递归方法，使其有序
        mergeSort(arr, mid + 1, right); //对右半部分调用递归方法，使其有序
        merge(arr, left, mid, right); //合并左右两部分，使整个数组有序

    }

    /**
     * 2.递推公式
     *
     * @param arr   要合并的数组
     * @param left  左边界
     * @param mid   中间的分界
     * @param right 右边界
     */
    private static void merge(int[] arr, int left, int mid, int right) {

        int[] helpArr = new int[right - left + 1]; // 定义一个辅助数组
        int lP = left; // 左指针
        int rP = mid + 1; // 右指针
        int helpP = 0; // 辅助数组指针

        while (lP <= mid && rP <= right) {
            if (arr[lP] <= arr[rP]) {
                helpArr[helpP++] = arr[lP++];
            } else {
                helpArr[helpP++] = arr[rP++];
            }
        }

        /**
         * 将左数组剩余元素填充到辅助数组
         */
        while (lP <= mid) {
            helpArr[helpP++] = arr[lP++];
        }

        /**
         * 将右边数组剩余元素填充到辅助数组
         */
        while (rP <= right) {
            helpArr[helpP++] = arr[rP++];
        }

        //将辅助数组中的元素回填至原数组
        for (int i = 0; i < helpArr.length; i++) {
            arr[left + i] = helpArr[i];
        }
    }
}
