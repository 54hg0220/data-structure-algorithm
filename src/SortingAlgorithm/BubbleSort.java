package SortingAlgorithm;

//冒泡排序
public class BubbleSort {
    public static int[] bubblesort(int[] arr){
        if (arr == null || arr.length <2){
            return arr;
        }
        for (int e = arr.length-1;e>0;e--){
            for (int i =0; i<e;i++){
                if (arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        // 亦或运算, 无进位相加
        // 0^N = N, N^N=0 亦或运算满足交换率和结合率 (a^b)^c = a^(b^c)
        // a = 甲， b=乙;
        // a = a^b; a=甲^乙， b=乙
        // b = a^b; a=甲^乙， b=甲^（乙^乙）=甲^0=甲
        // a = a^b; a=甲^乙^甲=乙， b=甲
        // 使用这个的时候a所指向的内存和b所指向的内存是两块东西
        // 在这个array中这个i位置不能等于j位置，如果位置相同就会等于0。
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
    // 亦或运算的运用
    private static void printOddTimesNum1(int[] arr){
        int eor = 0;
        for (int cur : arr){
            eor ^= cur;
        }
        System.out.println(eor);
    }
}
