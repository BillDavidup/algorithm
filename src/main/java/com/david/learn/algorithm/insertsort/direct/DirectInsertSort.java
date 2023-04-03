package com.david.learn.algorithm.insertsort.direct;

/**
 * 直接插入排序
 */
public class DirectInsertSort {

    public static void directInsertSort(int[] arr) {

        /**
         * 依次遍历带排序的元素，将元素插入到有序区中去
         */
        for (int i = 1; i < arr.length; i++) {
            int firstWaitInsertVal = arr[i];
            int j = i - 1;
            /**
             * 依次向后移动大于待插入元素的有序区元素
             */
            while (j >= 0 && firstWaitInsertVal < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // 最后将这个待插入元素正确的位置
            arr[j + 1] = firstWaitInsertVal;
        }
    }
}
