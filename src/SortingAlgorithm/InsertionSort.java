package SortingAlgorithm;

import static SortingAlgorithm.Util.swap;

public class InsertionSort {
    // 插入排序
    // 假设我们又一个list[2,4,3,5,3]
    // 首先我们要保证 0-1 有序 ->做一次交换[2,4,3,5,3]
    // 然后保证0-2 有序-> 交换[2,3,4,5,3]
    // 一直操作到n个数
    // 假设我们有一个这样的数组[7,6,5,4,3,2,1]
    // 这个算法的数据复杂度是O(N^2)
    // 如果我们有一个这样的数组 [1,2,3,4,5,6,7]
    // 这个算法的时间复杂度是O(N^2)
    // 但是我们估计这个算法的时间复杂度要按最差的情况来估计

    public static void insertionSort(int[] arr){
        if (arr ==null || arr.length<2){
            return;
        }
        for (int i = 1; i < arr.length;i++){
            for (int j=i-1;j>0&&arr[j]>arr[j+1];j--){
                swap(arr,j,j+1);
            }
        }

    }
}
