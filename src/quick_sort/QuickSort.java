package quick_sort;

/**
 * @Description 快速排序
 * 主要思想: 在一堆数中找
 * @Date 2020/6/10 10:50
 * @Author dengxiaoyu
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] a = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(a);
        System.out.println("-------sort结果-------");
        print(a);
    }

    static void sort(int[] a) {

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
