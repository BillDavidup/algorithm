package com.david.learn.algorithm.array;

import java.util.concurrent.CompletableFuture;

/**
 * 数组工具类
 */
public class ArrayTools {

    /**
     * 初始化一个数组
     *
     * @return
     */
    public static int[] init() {
        int[] arr = {9, 1, 2, 5, 4, 8, 3, 7, 0};
        return arr;
    }

    /**
     * 初始化一个用于堆排序的数组
     *
     * @return
     */
    public static int[] bigTopHeapArrInit() {
        int[] arr = new int[9];
        arr[1] = 53;
        arr[2] = 17;
        arr[3] = 78;
        arr[4] = 9;
        arr[5] = 45;
        arr[6] = 65;
        arr[7] = 87;
        arr[8] = 32;
        return arr;
    }

    /**
     * 打印数组元素
     *
     * @param arr
     */
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Supply Async...");

        CompletableFuture<String> execution = completableFuture
                .thenApply(s -> s + " Callback executed...");

        System.out.println(execution.get());
    }


}
