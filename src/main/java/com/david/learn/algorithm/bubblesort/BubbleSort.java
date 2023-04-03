package com.david.learn.algorithm.bubblesort;

/**
 * 冒泡排序
 */
public class BubbleSort {

    /**
     * 冒泡排序
     *
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {
        /**
         * 外层循环执行一次浮出一个排序好位置的数，就是最后位置的数为最大
         * i是已浮出数量
         */
        for (int i = 0; i < arr.length - 1; i++) {
            /**
             * 内层循环每次都从最左边开始，走到还没浮出来的最后一位
             * -1保证j+1在范围内
             */
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
