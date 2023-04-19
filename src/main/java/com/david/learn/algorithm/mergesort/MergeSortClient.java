package com.david.learn.algorithm.mergesort;

import com.david.learn.algorithm.array.ArrayTools;

/**
 * 调用客户端
 */
public class MergeSortClient {

    public static void main(String[] args) {

        System.out.println("----------1.归并排序------------");
        int[] arr = ArrayTools.init();
        ArrayTools.print(arr);
        MergeSort.mergeSort(arr);
        ArrayTools.print(arr);

    }

}
