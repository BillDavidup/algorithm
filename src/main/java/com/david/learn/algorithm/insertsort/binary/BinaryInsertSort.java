package com.david.learn.algorithm.insertsort.binary;

/**
 * 折半插入排序
 * https://www.youtube.com/watch?v=5v4_6VcIw2E
 */
public class BinaryInsertSort {

    /**
     * 折半插入排序
     */
    public void binaryInsertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 待插入的值
            int waitInsertVal = arr[i];
            int left = 0;
            int right = i - 1;
            while (left <= right) {
                int m = (left + right) / 2;
                if (waitInsertVal > arr[m]) {
                    // 待插入的值比中间值大，说明插入位置在右区间
                    left = m + 1;
                } else {
                    // 待插入的值小于等于中间值，说明插入位置在左区间
                    right = m - 1;
                }
            }

            /**
             * 元素后移动
             * right + 1就是找到的插入位置
             * j + 1是已排好序最后一个元素
             */
            for (int j = i - 1; j <= right + 1; j--) {
                arr[j + 1] = arr[j];
            }

            // 将待插入的元素插入到找到的位置
            arr[right + 1] = waitInsertVal;
        }
    }

}
