package com.david.learn.algorithm.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和：有序和无序的
 * 返回下标的数组
 */
public class SumOfTwoNum {
    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfTwoNumForDoublePoint(new int[]{1, 2, 3, 4, 5, 6}, 10)));
    }


    /**
     * 暴力解法
     *
     * 时间复杂度：O(nxn)
     * 空间复杂度：1
     * @param arr
     * @param target
     * @return
     */
    public static int[] sumOfTwoNumNoOrder(int[] arr, int target) {

        if (null == arr) {
            return new int[]{};
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    /**
     * 用map牺牲空间复杂度，以空间换时间，只要遍历一次
     *
     * 时间复杂度：O(n)
     * 空间复杂度：n
     * @param arr
     * @param target
     * @return
     */
    public static int[] sumOfTwoNumNoOrder2(int[] arr, int target) {
        if (null == arr) {
            return new int[]{};
        }

        Map<Integer, Integer> numKeyIdxValMap = new HashMap<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (numKeyIdxValMap.containsKey(target - arr[i])) {
                return new int[]{numKeyIdxValMap.get(target - arr[i]), i};
            }
            numKeyIdxValMap.put(arr[i], i);
        }
        return new int[]{};
    }

    /**
     * 有序数组采用二分查找
     * 时间复杂度：O(nlogn)
     * 空间复杂度：1
     * @param arr
     * @param target
     * @return
     */
    public static int[] sumOfTwoNumForOrderArr(int[] arr, int target) {
        if (null == arr || arr.length == 0 || arr.length == 1) {
            return new int[]{};
        }
        for (int i = 0; i < arr.length; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            int j = binarySearch(arr, left, right, target - arr[i]);
            if (j != -1) {
                return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    /**
     * 二分查找
     * @param arr
     * @param left
     * @param right
     * @param target
     * @return
     */
    private static int binarySearch(int[] arr, int left, int right, int target) {
        if (arr == null) {
            return -1;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 双指针：效率更高
     * @param arr
     * @param target
     * @return
     */
    public static int[] sumOfTwoNumForDoublePoint(int[] arr, int target) {
        if (null == arr || arr.length == 0 || arr.length == 1) {
            return new int[]{};
        }
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int lowHithSum = arr[low] + arr[high];
            if (lowHithSum == target) {
                return new int[] {low, high};
            } else if (lowHithSum > target) {
                high --;
            } else {
                low ++;
            }
        }
        return new int[]{};
    }
}
