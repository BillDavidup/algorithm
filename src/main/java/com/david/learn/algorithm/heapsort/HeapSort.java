package com.david.learn.algorithm.heapsort;

/**
 * 堆排序
 * youtube:https://www.youtube.com/watch?v=mL63hRHD_no&t=1760s
 */
public class HeapSort {

    public static void heapSort(int[] arr, int length) {
        buildMaxHeap(arr, length);
        for (int i = length; i > 0; i--) {
            /**
             * 堆顶元素和最后一个元素交换
             */
            int temp = arr[i];
            arr[i] = arr[1];
            arr[1] = temp;
            adjustDown(arr, 1, i - 1);
        }
        // 置空arr[0]
        arr[0] = 0;
    }

    /**
     * 构建最大堆，n/2是非终端节点（有孩子的节点）
     * @param arr
     * @param length
     */
    public static void buildMaxHeap(int[] arr, int length) {
        for (int i = length / 2; i > 0; i--) {
            adjustDown(arr, i, length);
        }
    }

    /**
     * 向下调整：因为替换的是堆顶元素，所以需要从上到下调整
     *
     * @param arr
     * @param k
     * @param subLen 每调整一次，堆顶元素被交换到了数组尾部，用于控制不需要调整的数据
     */
    public static void adjustDown(int[] arr, int k, int subLen) {
        arr[0] = arr[k]; // arr[0]用来暂存
        // 左孩子2n，右孩子2n+1，节点n序号
        for (int i = 2 * k; i <= subLen; i = i * 2) {
            // 右孩子大则i++指向右孩子
            if (i < subLen && arr[i] < arr[i + 1]) {
                i++;
            }
            if (arr[0] >= arr[i]) {
                break;
            } else {
                arr[k] = arr[i]; // 找到比教大的节点则替换
                k = i; //兑换后改变了最大堆，需要对该节点进行调整
            }
        }
        arr[k] = arr[0];
    }

}
