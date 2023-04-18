package com.david.learn.algorithm.shellsort;

/**
 * 搜bilibili: [算法] ShellSort 讲解最清楚的希尔排序 Go语言实现
 * 搜bilibili: [算法] 插入排序 Go语言实现 为希尔算法做准备
 */
public class ShellSortGo {


    public static void shellSortGo(int[] arr) {
        // 进行步长分组
        for (int gap = arr.length / 2; gap > 0; gap = gap / 2) {
            // i:待排序元素，插入排序
            for (int i = gap; i < arr.length; i++) {
                // j:待比较过程中，待排序元素的位置
                for (int j = i; j >= gap; j = j - gap) {
                    // 同组左边的元素 <= 待排序的元素
                    if (arr[j - gap] <= arr[j]) {
                        break;
                    }
                    /**
                     * 交换
                     */
                    int temp = arr[j];
                    arr[j] = arr[j - gap];
                    arr[j - gap] = temp;
                }

            }
        }

    }

    public static void insertSort(int[] arr) {
        // i：待排序元素
        for (int i = 1; i < arr.length; i++) {
            //
            for (int j = i; j > 0; j--) {
                // 左边的元素小于右边的元素
                if (arr[j - 1] <= arr[j]) {
                    break;
                }
                /**
                 * 交换
                 */
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }
    }

}
