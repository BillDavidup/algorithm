package com.david.learn.algorithm.search.binarysearch;

import com.david.learn.algorithm.array.ArrayTools;
import com.david.learn.algorithm.selectsort.SimpleSelectSort;

/**
 * 二分查找客户端
 */
public class BinarySearchClient {

    public static void main(String[] args) {
        System.out.println("----------1.简单选择排序------------");
        int[] arr = ArrayTools.init();
        ArrayTools.print(arr);
        SimpleSelectSort.simpleSelectSort(arr);
        ArrayTools.print(arr);
        System.out.println("----------2.二分查找找------------");
        int index = BinarySearch.binarySearch2(arr, 8);
        System.out.println("----------3.查找值下标---------");
        System.out.println(index);
    }

}
