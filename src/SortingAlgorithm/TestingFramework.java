package SortingAlgorithm;

import java.util.Arrays;

public class TestingFramework {
    // 方法a是我们想测的方法
    // 方法b是我们的暴力解法
    // 生成随机数组
    // 用来比较两周方法
    // Math.random() -> [0,1) 所有的小数，等概率返回一个
    // Math.random()*N -> [0,N) 所有小数，等概率返回一个
    // (int)(Math.random()*N) ->[0,N-1) 所有的整数，等概率返回一个

    public static int[] generateRndomArray(int maxSize, int maxValue){
        int[] arr = new int[(int)(Math.random()*(maxSize +1))]; // 长度随机
        for (int i = 0; i <arr.length;i++){
            arr[i] =(int)((maxValue+1)*Math.random()) - (int)(maxValue*Math.random());
        };
        return arr;
    }
    // 对数器的使用
    public static void main(String[] args){
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i <testTime;i++){
            int[] arr1 = generateRndomArray(maxSize,maxValue);
            int[] arr2 = Arrays.copyOf(arr1,arr1.length);
            int [] sorted_arr1 = InsertionSort.insertionSort(arr1);
            int [] sorted_arr2 = BubbleSort.bubblesort(arr1);
            if (!Arrays.equals(sorted_arr1,sorted_arr2)){
                succeed = false;
                break;
            }
        }
        System.out.println(succeed?"Yes":"No");
//        int[] arr1 = generateRndomArray(maxSize,maxValue);
//        System.out.println(Arrays.toString(arr1));
//        int [] sorted_arr1 = InsertionSort.insertionSort(arr1);
//        System.out.println(Arrays.toString(sorted_arr1));
//        int [] sorted_arr2 = BubbleSort.bubblesort(arr1);
//        System.out.println(Arrays.toString(sorted_arr2));
//        if (!Arrays.equals(sorted_arr1,sorted_arr2)){
//            succeed = false;
////            break;
//        }
    }
}
