package com.david.learn.algorithm.bubblesort;

import com.david.learn.algorithm.array.ArrayTools;

/**
 * 冒泡排序客户端
 */
public class BubbleSortClient {

    /**
     * 调用客户端
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = ArrayTools.init();
        ArrayTools.print(arr);
        BubbleSort.bubbleSort(arr);
        ArrayTools.print(arr);
    }

}
