package com.david.learn.algorithm.heapsort;

import com.david.learn.algorithm.array.ArrayTools;

/**
 * 堆排序客户端
 */
public class HeapSortClient {

    public static void main(String[] args) {
        int[] arr = ArrayTools.bigTopHeapArrInit();
        ArrayTools.print(arr);
        HeapSort.heapSort(arr, arr.length - 1);
        ArrayTools.print(arr);
    }

}
