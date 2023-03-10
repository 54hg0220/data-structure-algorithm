package SortingAlgorithm;

public class BinarySearch {
    // 在有序数组找某个数是否存在
    // 如果用遍历的算法就是O(N)
    // 找个一个x， 在list的中间对比一下，x>num, 那么就在右边找
    // 一直二分到找到了为止， 这个的算法的时间就是O(log2N)的时间

    // arr 中 无序， 想领书一定不相等。 局部最小
    // 无序二分
    // 当可以确定甩掉一边就可以二分
    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 32位
//		int num = 4;
//
//		print(num);
//
//
//		int test = 1123123;
//		print(test);
//		print(test<<1);
//		print(test<<2);
//		print(test<<8);
//
//
//		int a = Integer.MAX_VALUE;
//		System.out.println(a);

//		print(-1);
//		int a = Integer.MIN_VALUE;
//		print(a);

//		int b = 123823138;
//		int c = ~b;
//		print(b);
//		print(c);

//		print(-5);

//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);

//		int a = 12319283;
//		int b = 3819283;
//		print(a);
//		print(b);
//		System.out.println("=============");
//		print(a | b);
//		print(a & b);
//		print(a ^ b);

//		int a = Integer.MIN_VALUE;
//		print(a);
//		print(a >> 1);
//		print(a >>> 1);
//
//		int c = Integer.MIN_VALUE;
//		int d = -c ;
//
//		print(c);
//		print(d);

    }
}
