package com.david.learn.algorithm.shellsort;

/**
 * 希尔排序
 * chatGPT:https://chatgpt.qdymys.cn//#/chat/1002
 * 提问词：用java实现希尔排序
 *
 */
public class ShellSort {

    /**
     * 在这个实现中，我们定义了一个 sort 方法，该方法接受一个整数数组作为参数并对其进行原位排序。
     * 1.首先，我们获取待排序数组的长度，并初始化初始间隔值为 len / 2。
     * 接下来，我们不断缩小间隔值，然后对每个间隔段使用插入排序进行排序操作，直到间隔值缩小到 0。
     * 2.在内部循环中，我们使用变量 temp 存储当前待插入元素的值，然后往前遍历已排好序的部分，
     * 将比 temp 大的元素往后移动距离为间隔值 gap，直到找到小于或等于 temp 的元素为止，然后将 temp 插入到该位置。
     * 这样，经过多次对间隔段的插入排序操作，最终我们就能够将整个数组排序完成。
     * @param arr
     */
    public static void shellSort(int[] arr) {

        int len = arr.length;
        int gap = len / 2;

        while (gap > 0) {
            // 待插入的元素arr[i]
            for (int i = gap; i < len; i++) {
                int waitInsert = arr[i];
                int j = i - gap;
                while (j >= 0 && arr[j] > waitInsert) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = waitInsert;
            }
            gap = gap / 2; // 缩小间隔值
        }

    }
}
