package com.david.learn.algorithm.insertsort;

import com.david.learn.algorithm.array.ArrayTools;
import com.david.learn.algorithm.insertsort.direct.DirectInsertSort;

/**
 * 调用客户端
 * https://baijiahao.baidu.com/s?id=1723003244236149504&wfr=spider&for=pc
 */
public class InsertSortClient {

    public static void main(String[] args) {

        System.out.println("----------1.直接插入排序------------");
        int[] arr = ArrayTools.init();
        ArrayTools.print(arr);
        DirectInsertSort.directInsertSort(arr);
        ArrayTools.print(arr);

        System.out.println("----------2.折半插入排序------------");
        int[] arr2 = ArrayTools.init();
        ArrayTools.print(arr2);
        DirectInsertSort.directInsertSort(arr2);
        ArrayTools.print(arr2);
    }

}
