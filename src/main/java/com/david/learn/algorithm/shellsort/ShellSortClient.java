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

        System.out.println("----------2.希尔排序------------");
        int[] arr2 = ArrayTools.init();
        ArrayTools.print(arr2);
        ShellSortGo.shellSortGo(arr2);
        ArrayTools.print(arr2);

        System.out.println("----------3.插入排序------------");
        int[] arr3 = ArrayTools.init();
        ArrayTools.print(arr3);
        ShellSortGo.insertSort(arr3);
        ArrayTools.print(arr3);

    }

}
