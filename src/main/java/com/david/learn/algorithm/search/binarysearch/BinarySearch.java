package com.david.learn.algorithm.search.binarysearch;

/**
 * 二分查找法：有序序列中查找
 * https://blog.csdn.net/m0_58761900/article/details/124664975
 */
public class BinarySearch {

    /**
     * 闭区间【low,high】
     * @param arr
     * @param searchKey 待查询的key
     * @return 返回元素存放在数组的下标 没找到返回-1
     */
    public static int binarySearch(int[] arr, int searchKey) {

        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (high + low) / 2;
            if (arr[mid] == searchKey) {
                return mid;
            } else if (arr[mid] > searchKey) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 左闭右开区间【low,high）
     * @param arr
     * @param searchKey
     * @return
     */
    public static int binarySearch2(int[] arr, int searchKey) {

        int left = 0;
        int right = arr.length;
        int mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] == searchKey) {
                return mid;
            } else if (arr[mid] > searchKey) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

}
