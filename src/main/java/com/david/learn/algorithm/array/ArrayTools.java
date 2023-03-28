package com.david.learn.algorithm.array;

/**
 * 数组工具类
 */
public class ArrayTools {

    /**
     * 初始化一个数组
     * @return
     */
    public static int[] init() {
        int[] arr = {9, 1, 2, 5, 4, 8, 3, 7, 6};
        return arr;
    }

    /**
     * 打印数组元素
     * @param arr
     */
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}