package com.david.learn.algorithm.selectsort;

import com.david.learn.algorithm.array.ArrayTools;
import com.david.learn.algorithm.insertsort.direct.DirectInsertSort;

/**
 * 选择排序调用客户端
 */
public class SelectSortClient {
    public static void main(String[] args) {

        System.out.println("----------1.简单选择排序------------");
        int[] arr = ArrayTools.init();
        ArrayTools.print(arr);
        SimpleSelectSort.simpleSelectSort(arr);
        ArrayTools.print(arr);

    }
}
