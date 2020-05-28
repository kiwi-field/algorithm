package bubble_sort;

/**
 * @Description 优化后的冒泡算法
 * 当待排序数组为 {2,1,3,4,5,6,7,8,9}时：
 * 第1趟排序的结果为： 1 2 3 4 5 6 7 8 9，此时只需要排序一次就可以了，那么怎么优化呢
 * 此时其实序列已经完成，但是根据上述代码仍得继续遍历，直至第9趟排序。这显然是不合理的，
 * 如果我们能在代码中加入一个flag标记上一趟排序中是否进行过交换，如果进行过未进行交换，说明当前数组已经有序。
 * 参考博客 https://www.jianshu.com/p/ad84fd4dd4e2
 * 平均时间复杂度为O(n的平方)
 * 最好的时间复杂度为O(n)
 * @Date 2020/5/28 9:00
 * @Author dengxiaoyu
 */
public class OptimizedBubbleSort {
    public static void main(String[] args) {
//        int[] a = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        int[] a = {2,1,3,4,5,6,7,8,9};
        sort(a);
        System.out.println("-------sort结果-------");
        print(a);
    }

    static void sort(int[] a) {
        boolean swapped = true;
        for (int i = a.length - 1; i > 0 && swapped; i--) {
            swapped = false;
            System.out.println("进行第" + (a.length - i) + "趟排序");
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    swapped = true;
                }
                System.out.println("第" + (a.length - i) + "趟第" + (j + 1) + "次排序后的结果");
                print(a);
            }
            System.out.println("第" + (a.length - i) + "趟排序后的结果");
            print(a);
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
