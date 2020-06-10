package bubble_sort;

/**
 * @Description 两两比较，第一轮先将最大的数放到最后一个位置，第二轮将第2大的数放到倒数第2个位置，以此类推
 * 平均时间复杂度为O(n的平方)
 *
 * 基本不用,太慢
 * @Date 2020/5/28 9:00
 * @Author dengxiaoyu
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {9, 3, 1, 4, 6, 8, 7, 5, 2};
//        int[] a = {9, 2,3,4,5,6,7,8,1};
        System.out.println("排序前的数组");
        print(a);
        sort(a);
        print(a);
    }

    public static void sort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            findMax(a, i);
//            System.out.println("第"+(a.length-i)+"趟排序后的结果");
//            print(a);
        }
    }

    /**
     * 从位置0-指定位置n(包含0,包含n)寻找最大的值，并将最大值放置到n
     * @param a
     * @param n
     */
    static void findMax(int[] a, int n) {
        for(int j=0; j<n; j++) {
            if(a[j] > a[j+1]) swap(a, j, j+1);
//            System.out.println("第"+(a.length-n)+"趟第"+(j+1)+"次排序后的结果");
//            print(a);
        }
    }

    /**
     * 交换两个位置的数
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
