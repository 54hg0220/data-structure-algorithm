package SortingAlgorithm;

import static SortingAlgorithm.Util.swap;

//ιζ©ζεΊ
public class SlectionSort {
    public static void selectSort(int[] arr){
        if (arr == null || arr.length <2){
            return;
        }
        for (int i =0; i <arr.length -1;i++){
            int minIndex =i;
            for (int j = i+1;j<arr.length;j++){
                minIndex = arr[j]<arr[minIndex]?j:minIndex;
            }
            swap(arr,i,minIndex);
        }
    }

}
