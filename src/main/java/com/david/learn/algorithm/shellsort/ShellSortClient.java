package com.david.learn.algorithm.shellsort;

import com.david.learn.algorithm.array.ArrayTools;

/**
 * 希尔排序
 */
public class ShellSortClient {

    public static void main(String[] args) {

        System.out.println("----------1.希尔排序------------");
        int[] arr = ArrayTools.init();
        ArrayTools.print(arr);
        ShellSort.shellSort(arr);
        ArrayTools.print(arr);

    }

}
