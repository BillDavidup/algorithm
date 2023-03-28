package com.david.learn.algorithm.quicksort;

import com.david.learn.algorithm.array.ArrayTools;
import com.david.learn.algorithm.quicksort.one.QuickSortOne;

/**
 * client
 */
public class QuickSortClient {
    public static void main(String[] args) {
        int[] arr = ArrayTools.init();
        ArrayTools.print(arr);
        QuickSortOne.quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后");
        ArrayTools.print(arr);
    }
}
